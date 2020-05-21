package com.gome.arch.service.impl;



import com.gome.arch.dao.bean.*;
import com.gome.arch.dao.mapper.*;
import com.gome.arch.dpo.ApprovalOrderPO;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.dto.ApprovalOrderTO;
import com.gome.arch.service.dto.TaskTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname RtApplyOrderServiceImpl
 * @Description TODO 工单操作
 * @Date 2020/5/7 3:13 PM
 * @Created by nihui
 */
@Service
@Slf4j
public class RtApplyOrderServiceImpl implements RtApplyOrderService {

    //预留用来缓存节点信息
    private ConcurrentHashMap<Integer,Integer> node = new ConcurrentHashMap<>();

    @Autowired
    private RtApplyOrderMapper rtApplyOrderMapper;

    @Autowired
    private BaseProcessNodeMapper baseProcessNodeMapper;

    @Autowired
    private RtApprovalUserMapper rtApprovalUserMapper;

    @Autowired
    private HiApprovalUserFlowMapper hiApprovalUserFlowMapper;

    @Autowired
    private BaseApplyOrderMapper baseApplyOrderMapper;

    /**
     * 添加新任务
     * @param taskTO
     * @return
     */
    public int insertNewApplyOrder(TaskTO taskTO){

        Map<Integer,Integer> node = getProcess(Long.valueOf(taskTO.getProcessId()));
        RtApplyOrder record = new RtApplyOrder();
        record.setId(taskTO.getApplyId());
        record.setApplyOrderDetailId(taskTO.getApplyId());
        record.setCurrentNodeId(Long.valueOf(node.get(1)));
        record.setNextNodeId(Long.valueOf(node.get(2)));
        record.setCurrentNodeFinishStatus(0);
        record.setProcessFinishStatus(0);
        record.setPorcessId(taskTO.getProcessId());
        record.setProcessNodeTotalnumber(Long.valueOf(getProcessTotalNumber(Long.valueOf(taskTO.getProcessId()))));
        record.setCreateTime(new Date());
        record.setLastUpdateTime(new Date());
        return rtApplyOrderMapper.insert(record);
    }

    /**
     * 根据用户ID获取被该用户审批的工单
     * @param userid
     * @return
     */
    @Override
    public List<ApprovalOrderPO> getApprovalListByUserId(Long userid) {
        return rtApplyOrderMapper.getApprovalListByUserId(userid);
    }

    /**
     * 获取审批详情列表
     * @param userid
     * @return
     */
    @Override
    public List<ApprovalOrderPOExt> getApprovalDetailListByUserId(Long userid) {
        List<ApprovalOrderPOExt> listByUserId = rtApplyOrderMapper.getApprovalDetailListByUserId(userid);
        return listByUserId ;
    }

    /**
     * 申请成功
     * @param approvalOrderTO
     * @return
     */
    @Override
    public int updateApplyOrderOK(ApprovalOrderTO approvalOrderTO) {
        Map<Long, Long> relationByApplyId = getRelationByApplyId(approvalOrderTO.getApplyId());
        RtApplyOrderExample rtApplyOrderExample = new RtApplyOrderExample();
        RtApplyOrderExample.Criteria criteria = rtApplyOrderExample.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(approvalOrderTO.getApplyId());

        RtApplyOrder rtApplyOrder = new RtApplyOrder();
        rtApplyOrder.setCurrentNodeId(relationByApplyId.get(approvalOrderTO.getCurrentNode()));
        Long nextNode = relationByApplyId.get(relationByApplyId.get(approvalOrderTO.getCurrentNode()));
        if (approvalOrderTO.getNextNode() == 0){
            rtApplyOrder.setProcessFinishStatus(1);
        }
        if (nextNode!=null){
            log.info("这里执行了");
            rtApplyOrder.setNextNodeId(nextNode);
        }else {
            log.info("这里实行了");
            rtApplyOrder.setNextNodeId(0L);
        }
        rtApplyOrder.setLastUpdateTime(new Date());
        rtApplyOrderMapper.updateByExampleSelective(rtApplyOrder,rtApplyOrderExample);
        return 0;
    }

    public int finishBaseApplyOrder(Long applyId,Integer state){
        log.info("执行更新工单操作");
        BaseApplyOrder baseApplyOrder = new BaseApplyOrder();
        BaseApplyOrderExample baseApplyOrderExample = new BaseApplyOrderExample();
        BaseApplyOrderExample.Criteria criteria = baseApplyOrderExample.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(applyId);
        baseApplyOrder.setDealState(state);
        baseApplyOrderMapper.updateByExampleSelective(baseApplyOrder,baseApplyOrderExample);
        return 0;
    }

    @Override
    public int finishApplyOrder(Long applyId, Integer state) {
        RtApplyOrder rtApplyOrder = new RtApplyOrder();
        RtApplyOrderExample rtApplyOrderExample = new RtApplyOrderExample();
        RtApplyOrderExample.Criteria criteria = rtApplyOrderExample.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(applyId);
        rtApplyOrder.setProcessFinishStatus(1);
        rtApplyOrderMapper.updateByExampleSelective(rtApplyOrder,rtApplyOrderExample);
        return 0;
    }

    /**
     * 拒绝工单操作
     * @return
     */
    @Override
    public int updateApprovalRegject() {
        return 0;
    }

    /**
     * 撤回工单操作
     * @param applyId
     * @return
     */
    @Override
    public int reBackApplyOrder(Long applyId) {
        return 0;
    }


    /**
     * 根据流程ID获取流程对应的节点关系
     * @param id
     * @return
     */
    private Map<Integer,Integer> getProcess(Long id){
        List<ProcessPO> processPOList = baseProcessNodeMapper.getProcessById(id);
        Map<Integer,Integer> node = new HashMap<>();
        for (ProcessPO processPO: processPOList) {
            node.put(processPO.getNodeOrder(),processPO.getNodeId());
        }
        return node;
    }

    /**
     * 根据流程ID获取执行顺序
     * @param id
     * @return
     */
    private List<Integer> getNodeOrder(Long id){
        List<ProcessPO> processPOList = baseProcessNodeMapper.getProcessById(id);
        List<Integer> nodeOrders = new ArrayList<>();
        return nodeOrders;
    }

    private Integer getProcessTotalNumber(Long id){
        return baseProcessNodeMapper.getProcessById(id).size();
    }

    private Map<Long,Long> getRelationByApplyId(Long applyId) {
//        List<RtApprovalUser> rtApprovalUsers = rtApprovalUserMapper.getDealUserListByApplyId(applyId);
        List<RtApprovalUser> rtApprovalUsers = hiApprovalUserFlowMapper.getDealUserListByApplyId(applyId);
        Map<Long,Long> relationList = new HashMap<>();
        for (int i = 0; i < rtApprovalUsers.size()-1 ; i++) {
            relationList.put(rtApprovalUsers.get(i).getNodeId(),rtApprovalUsers.get(i+1).getNodeId());
        }
        return relationList;
    }

}
