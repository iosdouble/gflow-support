package com.gome.arch.core.engine.task;

import com.gome.arch.service.dto.TaskTO;

/**
 * @Classname TaskService
 * @Description TODO 获取当前啊任务服务
 * @Date 2020/4/23 10:46 AM
 * @Created by nihui
 */
public interface TaskService {

    public String addTask(TaskTO taskTO);
}
