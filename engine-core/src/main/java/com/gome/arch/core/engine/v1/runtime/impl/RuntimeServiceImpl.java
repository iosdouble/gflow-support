package com.gome.arch.core.engine.v1.runtime.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.arch.core.engine.v1.runtime.RuntimeService;
import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.json.JsonUtil;
import com.gome.arch.service.HiApprovalUserFlowService;
import com.gome.arch.service.RtApplyOrderDetailService;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.RtApprovalDetailService;
import com.gome.arch.service.dto.ApprovalDealTO;
import com.gome.arch.service.dto.ApprovalOrderTO;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class RuntimeServiceImpl implements RuntimeService {
    /**
     * 运行时工单服务
     */
    @Autowired
    private RtApplyOrderService rtApplyOrderService;
    /**
     * 工单详情操作
     */
    @Autowired
    private RtApplyOrderDetailService rtApplyOrderDetailService;
    /**
     * 审批详情
     */
    @Autowired
    private RtApprovalDetailService rtApprovalDetailService;

    @Autowired
    private HiApprovalUserFlowService rtApprovalFlowService;

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
     * @param approvalDealTO
     * @return
     */
    @Override
    public int updateApprovalAgree(ApprovalDealTO approvalDealTO) {
        log.info("======== ApprovalDealTO ========== "+ JsonUtil.toJson(approvalDealTO));
        rtApprovalDetailService.insertApprovalDetail(approvalDealTO);
        ApprovalOrderTO  approvalOrderTO = new ApprovalOrderTO();
        approvalOrderTO.setApplyId(approvalDealTO.getApplyOrderId());
        approvalOrderTO.setCurrentNode(approvalDealTO.getCurrentNode());
        approvalOrderTO.setNextNode(approvalDealTO.getNextNode());
        if (approvalDealTO.getNextNode()==0){
            log.info("完成工单操作");
            rtApprovalFlowService.updateApprovalFlowStatus(approvalDealTO.getApplyOrderId(),2);
            rtApplyOrderService.finishApplyOrder(approvalDealTO.getApplyOrderId(),1);
            rtApplyOrderService.finishBaseApplyOrder(approvalDealTO.getApplyOrderId(),2);
        }else {
            rtApplyOrderService.updateApplyOrderOK(approvalOrderTO);
        }

        return 0;
    }


    /**
     * 审批拒绝
     * @param approvalDealTO
     * @return
     */
    @Override
    public int updateApprovalReject(ApprovalDealTO approvalDealTO) {
        log.info("工单被拒绝了");
        rtApprovalDetailService.insertApprovalDetail(approvalDealTO);
        ApprovalOrderTO  approvalOrderTO = new ApprovalOrderTO();
        approvalOrderTO.setApplyId(approvalDealTO.getApplyOrderId());
        approvalOrderTO.setCurrentNode(approvalDealTO.getCurrentNode());
        approvalOrderTO.setNextNode(approvalDealTO.getNextNode());
        rtApprovalFlowService.updateApprovalFlowStatus(approvalDealTO.getApplyOrderId(),3);
        rtApplyOrderService.finishApplyOrder(approvalDealTO.getApplyOrderId(),3);
        rtApplyOrderService.finishBaseApplyOrder(approvalDealTO.getApplyOrderId(),3);
        return 0;
    }

    /**
     * 获取审批列表
     * @param applyId
     * @return
     */
    @Override
    public List<RtApprovalDetail> getApprovalDetail(Long applyId) {
        return rtApprovalDetailService.getApprovalFlowDetailByApplyID(applyId);
    }


    /**
     * 撤回工单
     * @param applyId
     * @return
     */
    @Override
    public String reCallWorkOrder(Long applyId) {

        return null;
    }

    @Override
    public RtApplyOrderDetail getApplyOrderDetailByApplyId(Long applyId) {
        List<RtApplyOrderDetail> approvalApplyDetailByApplyId = rtApplyOrderDetailService.getApprovalApplyDetailByApplyId(applyId);
        return approvalApplyDetailByApplyId.get(0);
    }

}
