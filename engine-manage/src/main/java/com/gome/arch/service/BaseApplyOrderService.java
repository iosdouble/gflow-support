package com.gome.arch.service;

import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.service.dto.BaseApplyTO;

import java.util.List;

/**
 * @Classname BaseApplyOrderService
 * @Description TODO
 * @Date 2020/5/12 3:36 PM
 * @Created by nihui
 */
public interface BaseApplyOrderService {

    public String addApplyOrder(BaseApplyTO baseApplyTO);

    public List<BaseApplyOrder> getApplyOrderList(Long applyUserCode,Integer state);
}
