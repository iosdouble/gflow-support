package com.gome.arch.core.engine.runtime.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.arch.core.engine.runtime.RuntimeService;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.RtApprovalDetailService;
import com.gome.arch.service.dto.ApprovalDealTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname RuntimeServiceImpl
 * @Description TODO 关于运行时操作封装
 * @Date 2020/4/23 1:46 PM
 * @Created by nihui
 */
@Service
public class RuntimeServiceImpl implements RuntimeService {
    /**
     * 运行时工单服务
     */
    @Autowired
    private RtApplyOrderService rtApplyOrderService;

    /**
     * 运行时工单处理服务
     */
    @Autowired
    private RtApprovalDetailService rtApprovalDetailService;

    /**
     * 根据用户ID获取审批列表
     * @param userid
     * @param offset
     * @param limit
     * @return
     */
    @Override
    public PageInfo<ApprovalOrderPOExt> pageOrderApplies(Long userid, int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        List<ApprovalOrderPOExt> listByUserId = rtApplyOrderService.getApprovalDetailListByUserId(userid);
        PageInfo<ApprovalOrderPOExt> pageInfo = new PageInfo<ApprovalOrderPOExt>(listByUserId);
        return pageInfo;
    }

    /**
     * 审批同意
     * @param approvalDealVO
     * @return
     */
    @Override
    public int updateApprovalAgree(ApprovalDealTO approvalDealVO) {
        rtApprovalDetailService.insertApprovalDetail(approvalDealVO);

//        rtApplyOrderService.updateApplyOrderOK(approvalDealVO.getApplyOrderId());
        return 0;
    }

    /**
     * 审批拒绝
     * @param approvalDealVO
     * @return
     */
    @Override
    public int updateApprovalReject(ApprovalDealTO approvalDealVO) {
        return 0;
    }

}
