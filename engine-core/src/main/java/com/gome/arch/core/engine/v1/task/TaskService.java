package com.gome.arch.core.engine.v1.task;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dto.BaseTaskTO;
import com.gome.arch.service.dto.TaskTO;

/**
 * @Classname TaskService
 * @Description TODO 流程任务操作
 * @Date 2020/4/23 10:46 AM
 * @Created by nihui
 */
public interface TaskService {

    //开启任务
    public String startTask(TaskTO taskTO);

    //添加任务
    public String addTask(BaseTaskTO baseTaskTO);

    //结束任务
    public String endTask();

    //获取开启任务列表
//    public PageInfo<BaseApplyOrder> getStartTaskList(Long applyUserCode ,Integer offset,Integer limit);
    public PageInfo<BaseApplyOrderTO> getStartTaskList(Long applyUserCode , Integer offset, Integer limit);
}
