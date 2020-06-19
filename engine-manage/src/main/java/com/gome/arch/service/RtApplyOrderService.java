package com.gome.arch.service;

import com.gome.arch.dpo.ApprovalOrderPO;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.dto.ApprovalOrderTO;
import com.gome.arch.service.dto.TaskTO;

import java.util.List;

/**
 * @Classname RtApplyOrderService
 * @Description TODO 工单相关内容的处理
 * @Date 2020/5/7 3:01 PM
 * @Created by nihui
 */
public interface RtApplyOrderService {

    // 提交新的工单信息
    public int insertNewApplyOrder(TaskTO taskTO);

    public List<ApprovalOrderPO> getApprovalListByUserId(Long userid);

    //获取工单流程列表
    public List<ApprovalOrderPOExt> getApprovalDetailListByUserId(String userid);

    //审批成功
    public int updateApplyOrderOK(ApprovalOrderTO approvalOrderTO);

    public int finishApplyOrder(Long applyId,Integer state);

    public int finishBaseApplyOrder(Long applyId,Integer state);

    //审批拒绝
    public int updateApprovalRegject();

    public int reBackApplyOrder(Long applyId);
}
