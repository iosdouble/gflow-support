package com.gome.arch.core.engine.v1.task.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.service.BaseApplyOrderService;
import com.gome.arch.service.RtApplyOrderDetailService;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.dto.*;
import com.gome.arch.core.engine.v1.task.TaskService;
import com.gome.arch.service.RtApprovalUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname TaskServiceImpl
 * @Description TODO 关于Task操作封装
 * @Date 2020/4/23 1:46 PM
 * @Created by nihui
 */
@Slf4j
@Service
@Transactional(rollbackFor=Exception.class,propagation=Propagation.REQUIRED)
public class TaskServiceImpl implements TaskService {


    @Autowired
    private RtApprovalUserService rtApprovalUserService;
    @Autowired
    private RtApplyOrderDetailService baseApplyOrderDetialService;
    @Autowired
    private RtApplyOrderService rtApplyOrderService;
    @Autowired
    private BaseApplyOrderService baseApplyOrderService;


    /**
     * 开启任务主要是对处理人和运行时操作进行操作
     * @param taskTO
     * @return
     */
    @Override
    public String startTask(TaskTO taskTO) {
        //增加审批人处理
       rtApprovalUserService.addApprovalUserRelation(taskTO);
       //增加审批处理
       rtApplyOrderService.insertNewApplyOrder(taskTO);

       baseApplyOrderService.updateBaseApplyOrder(taskTO.getApplyId());

       return "处理成功";
    }

    /**
     * 添加任务主要是对工单基础信息进行绑定操作
     * @param baseTaskTO
     * @return
     */
    @Override
    public String addTask(BaseTaskTO baseTaskTO) {
        log.info("start add apply info " + baseTaskTO.toString() );
        BaseApplyTO baseApplyTO = new BaseApplyTO();
        baseApplyTO.setApplyId(baseTaskTO.getApplyId());
        baseApplyTO.setApplyUserCode(baseTaskTO.getApplyUserCode());
        baseApplyTO.setSystemType(baseTaskTO.getSystemType());
        baseApplyTO.setApplyContentDetial(baseTaskTO.getApplyContentDetail());
        baseApplyOrderService.addApplyOrder(baseApplyTO);
        ApplyDetailTO applyDetailTO = new ApplyDetailTO();
        applyDetailTO.setApplyId(baseTaskTO.getApplyId());
        applyDetailTO.setApplyOrderDetail(baseTaskTO.getApplyContentDetail());
        baseApplyOrderDetialService.addApplyOrderDetail(applyDetailTO);
        log.info("end add task ");
        return "OK";
    }

    @Override
    public String endTask(Long applyId) {
        return baseApplyOrderService.deleteBaseApplyOrder(applyId);
    }


    @Override
    public PageInfo<BaseApplyOrderTO> getStartTaskList(Long applyUserCode,Integer offset,Integer limit) {
        PageHelper.offsetPage(offset, limit);
//        List<BaseApplyOrder> applyOrderList = baseApplyOrderService.getApplyOrderList(applyUserCode,0);
        List<BaseApplyOrderTO> applyOrderList = baseApplyOrderService.getApplyOrderList(applyUserCode,0);
        PageInfo<BaseApplyOrderTO> pageInfo = new PageInfo<BaseApplyOrderTO>(applyOrderList);
        return pageInfo;
    }
}
