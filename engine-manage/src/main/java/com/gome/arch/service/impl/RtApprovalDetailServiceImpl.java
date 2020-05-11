package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.dao.mapper.RtApprovalDetailMapper;
import com.gome.arch.service.RtApprovalDetailService;
import com.gome.arch.service.dvo.ApprovalDealVO;
import com.gome.arch.uuid.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Classname RtApprovalDetailServiceImpl
 * @Description TODO
 * @Date 2020/5/11 3:37 PM
 * @Created by nihui
 */
@Service
public class RtApprovalDetailServiceImpl implements RtApprovalDetailService {

    @Autowired
    private RtApprovalDetailMapper rtApprovalDetailMapper;


    @Autowired
    private IdWorker idWorker;
    @Override
    public int insertApprovalDetail(ApprovalDealVO approvalDealVO) {
        RtApprovalDetail rtApprovalDetail = new RtApprovalDetail();
        rtApprovalDetail.setId(idWorker.nextId());
        rtApprovalDetail.setApplyOrderId(approvalDealVO.getApplyOrderId());
        rtApprovalDetail.setApprovalPersonId(approvalDealVO.getDealUserId());
        rtApprovalDetail.setCurrentProcessId(approvalDealVO.getProcessId());
        rtApprovalDetail.setCurrentNodeDealId(approvalDealVO.getCurrentNode());
        rtApprovalDetail.setApprovalPersonNote(approvalDealVO.getOpinion());
        rtApprovalDetail.setCreateTime(new Date());
        rtApprovalDetail.setLastUpdateTime(new Date());
        rtApprovalDetailMapper.insert(rtApprovalDetail);
        return 0;
    }

}
