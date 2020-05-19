package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.dao.bean.BaseApplyOrderExample;
import com.gome.arch.dao.mapper.BaseApplyOrderMapper;
import com.gome.arch.service.BaseApplyOrderService;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dto.BaseApplyTO;
import com.gome.arch.uuid.IdWorker;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
        baseApplyOrder.setDealState(0);
        baseApplyOrderMapper.insert(baseApplyOrder);
        return "OK";
    }

    @Override
    public List<BaseApplyOrderTO> getApplyOrderList(Long applyUserCode, Integer state) {
        BaseApplyOrderExample baseApplyOrderExample = new BaseApplyOrderExample();
        BaseApplyOrderExample.Criteria criteria = baseApplyOrderExample.createCriteria();
        criteria.andDealStateEqualTo(state);
        criteria.andApplyUserCodeEqualTo(applyUserCode);
        List<BaseApplyOrder> baseApplyOrders = baseApplyOrderMapper.selectByExample(baseApplyOrderExample);
        List<BaseApplyOrderTO> baseApplyOrderTOList = new ArrayList<>();
        for (BaseApplyOrder baseApplyOrder: baseApplyOrders) {
            BaseApplyOrderTO baseApplyOrderTO = new BaseApplyOrderTO();
            baseApplyOrderTO.setId(String.valueOf(baseApplyOrder.getId()));
            baseApplyOrderTO.setApplyOrderDetailId(String.valueOf(baseApplyOrder.getApplyOrderDetailId()));
            BeanUtils.copyProperties(baseApplyOrder,baseApplyOrderTO);
            baseApplyOrderTOList.add(baseApplyOrderTO);
        }
        return baseApplyOrderTOList;
    }
}
