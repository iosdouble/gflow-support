package com.gome.arch.core.engine.task.impl;

import com.gome.arch.dao.mapper.RtApplyOrderDetailMapper;
import com.gome.arch.service.RtApplyOrderDetailService;
import com.gome.arch.service.RtApplyOrderService;
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
    private RtApplyOrderDetailService rtApplyOrderDetailService;

    @Autowired
    private RtApplyOrderService rtApplyOrderService;


    @Override
    public String addTask(TaskTO taskTO) {
       rtApprovalUserService.addApprovalUserRelation(taskTO);
       rtApplyOrderDetailService.addApplyOrderDetail(taskTO);
       rtApplyOrderService.insertNewApplyOrder(taskTO);
       return "处理成功";
    }
}
