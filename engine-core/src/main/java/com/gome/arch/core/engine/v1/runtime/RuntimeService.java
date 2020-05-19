package com.gome.arch.core.engine.v1.runtime;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.dto.ApprovalDealTO;

/**
 * @Classname RuntimeService
 * @Description TODO 运行时服务，表示流程执行的过程，相对于流程来讲
 * @Date 2020/4/23 10:47 AM
 * @Created by nihui
 */
public interface RuntimeService {

    /**
     * 根据审批人ID获取对应人员审批的列表信息
     * @param userid
     * @param offset
     * @param limit
     * @return
     */
    public PageInfo<ApprovalOrderPOExt> pageOrderApplies(Long userid,int offset, int limit);


    /**
     * 审批同意
     * @param approvalDealVO
     * @return
     */
    public int updateApprovalAgree(ApprovalDealTO approvalDealVO);


    /**
     * 审批拒绝
     * @param approvalDealVO
     * @return
     */
    public int updateApprovalReject(ApprovalDealTO approvalDealVO);


    /**
     * 获取审批详情
     */
    public String getApprovalDetail(Long applyId);

    /**
     * 撤回工单
     */
    public String reCallWorkOrder(Long applyId);

}
