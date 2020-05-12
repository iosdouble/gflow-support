package com.gome.arch.core.engine.task;

import com.gome.arch.service.dto.BaseTaskTO;
import com.gome.arch.service.dto.TaskTO;

/**
 * @Classname TaskService
 * @Description TODO 流程任务操作
 * @Date 2020/4/23 10:46 AM
 * @Created by nihui
 */
public interface TaskService {

    public String startTask(TaskTO taskTO);

    public String addTask(BaseTaskTO baseTaskTO);
}
