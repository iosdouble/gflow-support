package com.gome.arch.service.impl;


import com.gome.arch.dao.bean.RtApprovalUser;
import com.gome.arch.dao.bean.RtApprovalUserExample;
import com.gome.arch.dao.mapper.RtApprovalUserMapper;
import com.gome.arch.service.RtApprovalUserService;
import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.ApprovalUserVO;
import com.gome.arch.uuid.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname RtApprovalUserServiceImpl
 * @Description TODO 工单与审批人对应关系
 * @Date 2020/5/6 5:08 PM
 * @Created by nihui
 */

@Service
public class RtApprovalUserServiceImpl implements RtApprovalUserService {

    @Autowired
    private RtApprovalUserMapper rtApprovalUserMapper;


    @Autowired
    private IdWorker idWorker;

    @Override
    public int addApprovalUserRelation(TaskTO taskTO) {
        for (ApprovalUserVO approvalUserVO: taskTO.getApprovalUserVoList()) {
            RtApprovalUser rtApprovalUser = new RtApprovalUser();
            rtApprovalUser.setId(idWorker.nextId());
            rtApprovalUser.setApplyOrderDetailId(taskTO.getApplyId());
            rtApprovalUser.setSubmitterId(taskTO.getApplyUserCode());
            rtApprovalUser.setProcessId(taskTO.getProcessId());
            rtApprovalUser.setNodeId(approvalUserVO.getNodeId());
            rtApprovalUser.setNodeOrder(approvalUserVO.getApprovalOrder());
            rtApprovalUser.setApprovalUserName(approvalUserVO.getApprovalUserName());
            rtApprovalUserMapper.insert(rtApprovalUser);
        }
        return 1;
    }

    @Override
    public List<RtApprovalUser> getRelationByApplyId(Long applyId) {
        RtApprovalUserExample rtApprovalUserExample = new RtApprovalUserExample();
        RtApprovalUserExample.Criteria criteria = rtApprovalUserExample.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(applyId);
        List<RtApprovalUser> rtApprovalUsers = rtApprovalUserMapper.selectByExample(rtApprovalUserExample);
        return rtApprovalUsers;
    }
}
