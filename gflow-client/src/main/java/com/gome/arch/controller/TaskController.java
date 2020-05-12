package com.gome.arch.controller;

import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.BaseTaskVO;
import com.gome.arch.service.dvo.TaskVO;
import com.gome.arch.core.engine.task.TaskService;
import com.gome.arch.service.dvo.response.ResponseEntity;
import com.gome.arch.uuid.IdWorker;
import io.swagger.annotations.Api;
import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
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
@Api(value = "基本任务管理",description = "流程任务管理")
@RestController
public class TaskController {

    @Autowired
    private IdWorker idWorker;
    @Autowired
    private TaskService taskService;


    @PostMapping("/addTask")
    public ResponseEntity<String> addTask(BaseTaskVO baseTaskVO){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg("normal");
        responseEntity.setData("Hello World");
        return responseEntity;
    }

    /**
     * 开启任务
     * @param taskVO
     * @return
     */
    @PostMapping("/startTask")
    public ResponseEntity<String> startTask(@RequestBody TaskVO taskVO){
        ResponseEntity responseEntity = new ResponseEntity();
        TaskTO taskTO = new TaskTO();
        BeanUtils.copyProperties(taskVO,taskTO);
        taskTO.setApplyId(idWorker.nextId());
        taskTO.setProcessId(taskVO.getProcessId());
        String s = taskService.addTask(taskTO);
        responseEntity.setCode(200);
        responseEntity.setMsg("normal");
        responseEntity.setData("OK" + new Date() + s);
        return responseEntity;
    }



    @PostMapping("/endTask")
    public ResponseEntity<String> endTask(){
        ResponseEntity responseEntity = new ResponseEntity();
        return responseEntity;
    }


}
