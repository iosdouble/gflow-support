package com.gome.arch.core.engine.v1.task.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.arch.constant.STATE;
import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.json.JsonUtil;
import com.gome.arch.service.*;
import com.gome.arch.service.dto.*;
import com.gome.arch.core.engine.v1.task.TaskService;
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
@Transactional(rollbackFor = Exception.class, propagation = Propagation.REQUIRED)
public class TaskServiceImpl implements TaskService {
    @Autowired
    private RtApprovalUserService rtApprovalUserService;
    @Autowired
    private RtApplyOrderDetailService baseApplyOrderDetialService;
    @Autowired
    private RtApplyOrderService rtApplyOrderService;
    @Autowired
    private BaseApplyOrderService baseApplyOrderService;
    @Autowired
    private HiApprovalUserFlowService hiApprovalUserFlowService;

    /**
     * 开启任务主要是对处理人和运行时操作进行操作
     *
     * @param taskTO
     * @return
     */
    @Override
    public String startTask(TaskTO taskTO) {
        log.info("开启流程 {}",JsonUtil.toJson(taskTO));
        try {
            //增加审批人处理
            //rtApprovalUserService.addApprovalUserRelation(taskTO);
            //增加历史处理记录
            hiApprovalUserFlowService.addApprovalFlowRelation(taskTO);
            //增加审批处理
            rtApplyOrderService.insertNewApplyOrder(taskTO);
            //更新基础工单状态
            baseApplyOrderService.updateBaseApplyOrder(taskTO.getApplyId());
            return String.valueOf(taskTO.getApplyId());
        } catch (Exception e) {
            e.printStackTrace();
            return "0";
        }
    }

    /**
     * 添加工单
     *
     * @param baseTaskTO
     * @return 返回信息为工单号
     */
    @Override
    public String addTask(BaseTaskTO baseTaskTO) {
        log.info("start add apply info {} ",JsonUtil.toJson(baseTaskTO));
        BaseApplyTO baseApplyTO = new BaseApplyTO();
        baseApplyTO.setApplyId(baseTaskTO.getApplyId());
        baseApplyTO.setApplyUserName(baseTaskTO.getApplyUserName());
        baseApplyTO.setSystemType(baseTaskTO.getSystemType());
        baseApplyTO.setApplyContentDetial(baseTaskTO.getApplyContentDetail());
        baseApplyOrderService.addApplyOrder(baseApplyTO);
        ApplyDetailTO applyDetailTO = new ApplyDetailTO();
        applyDetailTO.setApplyId(baseTaskTO.getApplyId());
        applyDetailTO.setApplyOrderDetail(baseTaskTO.getApplyContentDetail());
        baseApplyOrderDetialService.addApplyOrderDetail(applyDetailTO);
        long code = baseApplyTO.getApplyId();
        String response = String.valueOf(code);
        log.info("end add task " + response);
        return response;
    }

    @Override
    public String endTask(Long applyId) {
        baseApplyOrderService.deleteBaseApplyOrder(applyId);
        String code = String.valueOf(applyId);
        return code;
    }


    @Override
    public PageInfo<BaseApplyOrderTO> getStartTaskList(String applyUserCode, Integer offset, Integer limit) {
        PageHelper.offsetPage(offset, limit);
//        List<BaseApplyOrder> applyOrderList = baseApplyOrderService.getApplyOrderList(applyUserCode,0);
        List<BaseApplyOrderTO> applyOrderList = baseApplyOrderService.getApplyOrderList(applyUserCode, STATE.INIT);
        PageInfo<BaseApplyOrderTO> pageInfo = new PageInfo<BaseApplyOrderTO>(applyOrderList);
        return pageInfo;
    }
}
