package com.gome.arch.service;

import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.service.dto.ApprovalDealTO;

import java.util.List;

/**
 * @Classname RtApprovalDetailService
 * @Description TODO
 * @Date 2020/5/11 3:37 PM
 * @Created by nihui
 */
public interface RtApprovalDetailService {

    public int insertApprovalDetail(ApprovalDealTO approvalDealVO);

    public List<RtApprovalDetail> getApprovalFlowDetailByApplyID(Long applyId);


}
