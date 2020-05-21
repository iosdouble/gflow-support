package com.gome.arch.service;

import com.gome.arch.dao.bean.RtApprovalUser;
import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.ApprovalUserVO;

import java.util.List;


/**
 * @Classname RtApprovalUserService
 * @Description TODO 关联审批人与工单
 * @Date 2020/5/6 5:07 PM
 * @Created by nihui
 */
public interface RtApprovalUserService {

    //增加处理人信息
    @Deprecated
    public int addApprovalUserRelation(TaskTO taskTO);

    //根据工单号获取处理信息
    public List<RtApprovalUser> getRelationByApplyId(Long applyId);

}
