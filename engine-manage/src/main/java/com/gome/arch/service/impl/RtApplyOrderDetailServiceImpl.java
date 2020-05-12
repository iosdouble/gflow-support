package com.gome.arch.service.impl;

import com.alibaba.druid.support.json.JSONUtils;
import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.mapper.RtApplyOrderDetailMapper;
import com.gome.arch.service.RtApplyOrderDetailService;
import com.gome.arch.service.dto.ApplyDetailTO;
import com.gome.arch.service.dto.BaseApplyTO;
import com.gome.arch.service.dto.TaskTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname RtApplyOrderDetailServiceImpl
 * @Description TODO 工单详情
 * @Date 2020/5/6 6:07 PM
 * @Created by nihui
 */
@Slf4j
@Service
public class RtApplyOrderDetailServiceImpl implements RtApplyOrderDetailService {

    @Autowired
    private RtApplyOrderDetailMapper rtApplyOrderDetailMapper;
    @Override
    public int addApplyOrderDetail(ApplyDetailTO applyDetailTO) {
        log.info("get applyDetailTo"+applyDetailTO.toString());
        RtApplyOrderDetail rtApplyOrderDetail = new RtApplyOrderDetail();
        rtApplyOrderDetail.setId(applyDetailTO.getApplyId());
        rtApplyOrderDetail.setApplyOrderDetail(applyDetailTO.getApplyOrderDetail());
        rtApplyOrderDetail.setApplyOrderDetailId(applyDetailTO.getApplyId());
        int insert = rtApplyOrderDetailMapper.insert(rtApplyOrderDetail);
        return insert;
    }
}
