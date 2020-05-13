package com.gome.arch.controller.v1;

import com.gome.arch.core.engine.v1.ProcessEngine;
import com.gome.arch.dpo.ProcessPO;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname BaseProcessController
 * @Description TODO 用来对流程相关的内容提供配置
 * @Date 2020/5/6 3:25 PM
 * @Created by nihui
 */
@Api(value = "获取基本的流程管理",description = "基本流程管理")
@RestController
public class BaseProcessController {
    @Autowired
    private ProcessEngine processEngine;

    @Deprecated
    @GetMapping("/getProcessById")
    public List<ProcessPO> getProcessById(@RequestParam(name = "pid") Long processId){
        return processEngine.createProcess(processId);
    }

    @GetMapping("/getProcess")
    public List<ProcessPO> getProcess(){
        return processEngine.createProcess();
    }

}
