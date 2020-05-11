package com.gome.arch.service.impl;



import com.gome.arch.dpo.ApprovalOrderPO;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.dao.bean.RtApplyOrder;
import com.gome.arch.dao.mapper.BaseProcessNodeMapper;
import com.gome.arch.dao.mapper.RtApplyOrderMapper;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.dto.TaskTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Classname RtApplyOrderServiceImpl
 * @Description TODO 工单操作
 * @Date 2020/5/7 3:13 PM
 * @Created by nihui
 */
@Service
public class RtApplyOrderServiceImpl implements RtApplyOrderService {

    //预留用来缓存节点信息
    private ConcurrentHashMap<Integer,Integer> node = new ConcurrentHashMap<>();

    @Autowired
    private RtApplyOrderMapper rtApplyOrderMapper;

    @Autowired
    private BaseProcessNodeMapper baseProcessNodeMapper;

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

    @Override
    public List<ApprovalOrderPOExt> getApprovalDetailListByUserId(Long userid) {
        return rtApplyOrderMapper.getApprovalDetailListByUserId(userid);
    }

    @Override
    public int updateApprovalOK() {
        return 0;
    }

    @Override
    public int updateApprovalRegject() {
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

}
