package com.gome.arch.controller;

import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.TaskVO;
import com.gome.arch.core.engine.task.TaskService;
import com.gome.arch.uuid.IdWorker;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * @Classname TaskController
 * @Description TODO 任务管理窗口
 * @Date 2020/5/6 3:56 PM
 * @Created by nihui
 */
@RestController
public class TaskController {

    @Autowired
    private IdWorker idWorker;
    @Autowired
    private TaskService taskService;
    // 添加任务

    @PostMapping("/addTask")
    public String addTask(@RequestBody TaskVO taskVO){
        TaskTO taskTO = new TaskTO();
        BeanUtils.copyProperties(taskVO,taskTO);
        taskTO.setApplyId(idWorker.nextId());
        taskTO.setProcessId(taskVO.getProcessId());
        String s = taskService.addTask(taskTO);
        return "OK" + new Date() + s;

    }



}
