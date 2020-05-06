package com.gome.arch.service;

import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.service.dto.TaskTO;

/**
 * @Classname RtApplyOrderDetailService
 * @Description TODO
 * @Date 2020/5/6 6:06 PM
 * @Created by nihui
 */
public interface RtApplyOrderDetailService {

    public int addApplyOrderDetail(TaskTO taskTO);
}
