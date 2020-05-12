package com.gome.arch.service;

import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.service.dto.ApplyDetailTO;
import com.gome.arch.service.dto.BaseApplyTO;
import com.gome.arch.service.dto.TaskTO;

/**
 * @Classname RtApplyOrderDetailService
 * @Description TODO 工单详情处理
 * @Date 2020/5/6 6:06 PM
 * @Created by nihui
 */
public interface RtApplyOrderDetailService {

    public int addApplyOrderDetail(ApplyDetailTO applyDetailTO);
}
