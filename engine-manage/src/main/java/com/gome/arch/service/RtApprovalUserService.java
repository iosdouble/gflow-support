package com.gome.arch.service;

import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.ApprovalUserVO;


/**
 * @Classname RtApprovalUserService
 * @Description TODO 关联审批人与工单
 * @Date 2020/5/6 5:07 PM
 * @Created by nihui
 */
public interface RtApprovalUserService {
    public int addApprovalUserRelation(TaskTO taskTO);
}
