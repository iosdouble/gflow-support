package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.mapper.RtApplyOrderDetailMapper;
import com.gome.arch.service.RtApplyOrderDetailService;
import com.gome.arch.service.dto.TaskTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname RtApplyOrderDetailServiceImpl
 * @Description TODO
 * @Date 2020/5/6 6:07 PM
 * @Created by nihui
 */
@Service
public class RtApplyOrderDetailServiceImpl implements RtApplyOrderDetailService {

    @Autowired
    private RtApplyOrderDetailMapper rtApplyOrderDetailMapper;
    @Override
    public int addApplyOrderDetail(TaskTO taskTO) {
        RtApplyOrderDetail rtApplyOrderDetail = new RtApplyOrderDetail();
        rtApplyOrderDetail.setId(taskTO.getApplyId());
        rtApplyOrderDetail.setApplyOrderDetail(taskTO.getApplyDetail());
        rtApplyOrderDetail.setApplyOrderDetailId(taskTO.getApplyId());
        int insert = rtApplyOrderDetailMapper.insert(rtApplyOrderDetail);
        return insert;
    }
}
