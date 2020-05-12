package com.gome.arch.core.engine.task.impl;

import com.gome.arch.dao.mapper.RtApplyOrderDetailMapper;
import com.gome.arch.service.BaseApplyOrderService;
import com.gome.arch.service.RtApplyOrderDetailService;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.dto.BaseTaskTO;
import com.gome.arch.service.dvo.ApprovalUserVO;
import com.gome.arch.core.engine.task.TaskService;
import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.RtApprovalUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname TaskServiceImpl
 * @Description TODO 关于Task操作封装
 * @Date 2020/4/23 1:46 PM
 * @Created by nihui
 */
@Service
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
       rtApprovalUserService.addApprovalUserRelation(taskTO);
       rtApplyOrderService.insertNewApplyOrder(taskTO);
       return "处理成功";
    }

    /**
     * 添加任务主要是对工单基础信息进行绑定操作
     * @param baseTaskTO
     * @return
     */
    @Override
    public String addTask(BaseTaskTO baseTaskTO) {
        baseApplyOrderService.addApplyOrder(null);
        baseApplyOrderDetialService.addApplyOrderDetail(null);
        return null;
    }

    @Override
    public String endTask() {
        return null;
    }
}
