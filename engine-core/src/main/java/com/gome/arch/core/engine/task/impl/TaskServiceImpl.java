package com.gome.arch.core.engine.task.impl;

import ch.qos.logback.classic.Logger;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.dao.mapper.RtApplyOrderDetailMapper;
import com.gome.arch.service.BaseApplyOrderService;
import com.gome.arch.service.RtApplyOrderDetailService;
import com.gome.arch.service.RtApplyOrderService;
import com.gome.arch.service.dto.ApplyDetailTO;
import com.gome.arch.service.dto.BaseApplyTO;
import com.gome.arch.service.dto.BaseTaskTO;
import com.gome.arch.service.dvo.ApprovalUserVO;
import com.gome.arch.core.engine.task.TaskService;
import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.RtApprovalUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.javassist.bytecode.stackmap.TypeData;
import org.slf4j.LoggerFactory;
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
    public String endTask() {
        return null;
    }

    @Override
    public PageInfo<BaseApplyOrder> getStartTaskList(Long applyUserCode,Integer offset,Integer limit) {
        PageHelper.offsetPage(offset, limit);
        List<BaseApplyOrder> applyOrderList = baseApplyOrderService.getApplyOrderList(applyUserCode,0);
        PageInfo<BaseApplyOrder> pageInfo = new PageInfo<BaseApplyOrder>(applyOrderList);
        return pageInfo;
    }
}
