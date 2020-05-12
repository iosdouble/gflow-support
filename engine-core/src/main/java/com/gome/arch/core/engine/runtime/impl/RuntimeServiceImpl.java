package com.gome.arch.core.engine.runtime.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.arch.core.constant.OPTION;
import com.gome.arch.core.engine.runtime.RuntimeService;
import com.gome.arch.dpo.ApprovalOrderPO;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.RtApprovalDetailService;
import com.gome.arch.service.RtApprovalUserService;
import com.gome.arch.service.dvo.ApprovalDealVO;
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
    @Autowired
    private RtApplyOrderService rtApplyOrderService;


    @Autowired
    private RtApprovalDetailService rtApprovalDetailService;

    @Override
    public PageInfo<ApprovalOrderPOExt> pageOrderApplies(Long userid, int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        List<ApprovalOrderPOExt> listByUserId = rtApplyOrderService.getApprovalDetailListByUserId(userid);
        PageInfo<ApprovalOrderPOExt> pageInfo = new PageInfo<ApprovalOrderPOExt>(listByUserId);
        return pageInfo;
    }

    @Override
    public int updateApprovalAgree(ApprovalDealVO approvalDealVO) {
        rtApprovalDetailService.insertApprovalDetail(approvalDealVO);

//        rtApplyOrderService.updateApplyOrderOK(approvalDealVO.getApplyOrderId());
        return 0;
    }

    @Override
    public int updateApprovalReject(ApprovalDealVO approvalDealVO) {
        return 0;
    }

}
