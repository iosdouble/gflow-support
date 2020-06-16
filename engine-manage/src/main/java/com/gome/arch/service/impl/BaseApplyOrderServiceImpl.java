package com.gome.arch.service.impl;

import com.gome.arch.constant.STATE;
import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.dao.bean.BaseApplyOrderExample;
import com.gome.arch.dao.mapper.BaseApplyOrderMapper;
import com.gome.arch.service.BaseApplyOrderService;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dto.BaseApplyTO;
import com.gome.arch.uuid.IdWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

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
@Slf4j
@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
public class BaseApplyOrderServiceImpl implements BaseApplyOrderService {
    @Autowired
    private IdWorker idWorker;
    @Autowired
    private BaseApplyOrderMapper baseApplyOrderMapper;

    @Override
    public String addApplyOrder(BaseApplyTO baseApplyTO) {
        BaseApplyOrder baseApplyOrder = new BaseApplyOrder();
        baseApplyOrder.setId(idWorker.nextId());
        baseApplyOrder.setApplyOrderDetailId(baseApplyTO.getApplyId());
        baseApplyOrder.setApplyUserName(baseApplyTO.getApplyUserName());
        baseApplyOrder.setSystemType(baseApplyTO.getSystemType());
        baseApplyOrder.setCreateTime(new Date());
        baseApplyOrder.setDealState(STATE.INIT);
        int insert = baseApplyOrderMapper.insert(baseApplyOrder);
        log.debug(" option success or fail row number {}",insert);
        return "SUCCESS";
    }

    @Override
    public List<BaseApplyOrderTO> getApplyOrderList(String  applyUserName, Integer state) {
        BaseApplyOrderExample baseApplyOrderExample = new BaseApplyOrderExample();
        BaseApplyOrderExample.Criteria criteria = baseApplyOrderExample.createCriteria();
//        criteria.andDealStateEqualTo(state);
        criteria.andApplyUserNameEqualTo(applyUserName);
        List<BaseApplyOrder> baseApplyOrders = baseApplyOrderMapper.selectByExample(baseApplyOrderExample);
        List<BaseApplyOrderTO> baseApplyOrderTOList = new ArrayList<>();
        for (BaseApplyOrder baseApplyOrder : baseApplyOrders) {
            BaseApplyOrderTO baseApplyOrderTO = new BaseApplyOrderTO();
            baseApplyOrderTO.setId(String.valueOf(baseApplyOrder.getId()));
            baseApplyOrderTO.setApplyOrderDetailId(String.valueOf(baseApplyOrder.getApplyOrderDetailId()));
            BeanUtils.copyProperties(baseApplyOrder, baseApplyOrderTO);
            baseApplyOrderTOList.add(baseApplyOrderTO);
        }
        return baseApplyOrderTOList;
    }

    @Override
    public String updateBaseApplyOrder(Long applyId) {
        log.info("update base applyorder {}",applyId);
        BaseApplyOrder record = new BaseApplyOrder();
        record.setDealState(STATE.DOING);
        BaseApplyOrderExample example = new BaseApplyOrderExample();
        BaseApplyOrderExample.Criteria criteria = example.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(applyId);
        int count = baseApplyOrderMapper.updateByExampleSelective(record, example);
        log.debug("option success or fail row number {}",count);
        return "SUCCESS";

    }

    @Override
    public String deleteBaseApplyOrder(Long applyId) {
        log.info("delete applyorder {}",applyId);
        BaseApplyOrder record = new BaseApplyOrder();
        record.setDealState(STATE.DELETE);
        BaseApplyOrderExample example = new BaseApplyOrderExample();
        BaseApplyOrderExample.Criteria criteria = example.createCriteria();
        criteria.andApplyOrderDetailIdEqualTo(applyId);
        int count = baseApplyOrderMapper.updateByExampleSelective(record, example);
        log.debug("option success or fail row number {}",count);
        return "SUCCESS";
    }
}
