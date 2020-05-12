package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.dao.mapper.BaseApplyOrderMapper;
import com.gome.arch.service.BaseApplyOrderService;
import com.gome.arch.service.dto.BaseApplyTO;
import com.gome.arch.uuid.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Classname BaseApplyOrderServiceImpl
 * @Description TODO
 * @Date 2020/5/12 3:36 PM
 * @Created by nihui
 */
@Service
public class BaseApplyOrderServiceImpl implements BaseApplyOrderService {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private BaseApplyOrderMapper baseApplyOrderMapper;

    @Override
    public String addApplyOrder(BaseApplyTO baseApplyTO) {
        BaseApplyOrder baseApplyOrder = new BaseApplyOrder();
        baseApplyOrder.setId(idWorker.nextId());
        baseApplyOrder.setApplyOrderDetailId(idWorker.nextId());
        baseApplyOrder.setApplyUserCode(1994L);
        baseApplyOrder.setSystemType("cd");
        baseApplyOrder.setCreateTime(new Date());
        baseApplyOrderMapper.insert(baseApplyOrder);
        return "OK";
    }
}
