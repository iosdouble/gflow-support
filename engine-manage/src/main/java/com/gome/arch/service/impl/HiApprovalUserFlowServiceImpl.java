package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.HiApprovalUserFlow;
import com.gome.arch.dao.bean.HiApprovalUserFlowExample;
import com.gome.arch.dao.bean.RtApprovalUser;
import com.gome.arch.dao.mapper.HiApprovalUserFlowMapper;
import com.gome.arch.service.HiApprovalUserFlowService;
import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.ApprovalUserVO;
import com.gome.arch.uuid.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Classname HiApprovalUserFlowServiceImpl
 * @Description TODO
 * @Date 2020/5/20 11:28 AM
 * @Created by nihui
 */
@Service
@Slf4j
public class HiApprovalUserFlowServiceImpl implements HiApprovalUserFlowService {

    @Autowired
    private HiApprovalUserFlowMapper hiApprovalUserFlowMapper;

    @Autowired
    private IdWorker idWorker;

    @Override
    public int addApprovalFlowRelation(TaskTO taskTO) {
        for (ApprovalUserVO approvalUserVO: taskTO.getApprovalUserVoList()) {
            HiApprovalUserFlow hiApprovalUserFlow = new HiApprovalUserFlow();
            hiApprovalUserFlow.setId(idWorker.nextId());
            hiApprovalUserFlow.setApplyOrderDetailId(taskTO.getApplyId());
            hiApprovalUserFlow.setSubmitterId(taskTO.getApplyUserCode());
            hiApprovalUserFlow.setProcessId(taskTO.getProcessId());
            hiApprovalUserFlow.setNodeId(approvalUserVO.getNodeId());
            hiApprovalUserFlow.setNodeOrder(approvalUserVO.getApprovalOrder());
            hiApprovalUserFlow.setApprovalUserId(approvalUserVO.getApprovalUserId());
            hiApprovalUserFlow.setApprovalState(0);
            hiApprovalUserFlow.setLastUpdateTime(new Date());
            hiApprovalUserFlowMapper.insert(hiApprovalUserFlow);
        }
        return 1;
    }

    @Override
    public List<HiApprovalUserFlow> getApprovalFlowHistory(Long applyId) {
        HiApprovalUserFlowExample hiApprovalUserFlowExample = new HiApprovalUserFlowExample();
        HiApprovalUserFlowExample.Criteria criteria = hiApprovalUserFlowExample.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(applyId);
        List<HiApprovalUserFlow> hiApprovalUserFlows = hiApprovalUserFlowMapper.selectByExample(hiApprovalUserFlowExample);
        return hiApprovalUserFlows;
    }

    @Override
    public int updateFlowHistory() {
        return 0;
    }

    @Override
    public int updateApprovalFlowStatus(Long applyId, Integer state) {
        HiApprovalUserFlow hiApprovalUserFlow = new HiApprovalUserFlow();
        HiApprovalUserFlowExample hiApprovalUserFlowExample = new HiApprovalUserFlowExample();
        HiApprovalUserFlowExample.Criteria criteria = hiApprovalUserFlowExample.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(applyId);
        hiApprovalUserFlow.setApprovalState(state);
        hiApprovalUserFlowMapper.updateByExampleSelective(hiApprovalUserFlow,hiApprovalUserFlowExample);
        return 0;
    }
}
