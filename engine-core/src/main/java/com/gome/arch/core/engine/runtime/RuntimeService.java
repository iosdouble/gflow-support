package com.gome.arch.core.engine.runtime;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.dvo.ApprovalDealVO;

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


    public int updateApprovalAgree(ApprovalDealVO approvalDealVO);


    public int updateApprovalReject(ApprovalDealVO approvalDealVO);

}
