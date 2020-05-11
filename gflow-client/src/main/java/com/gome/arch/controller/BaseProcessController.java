package com.gome.arch.controller;

import com.gome.arch.core.engine.ProcessEngine;
import com.gome.arch.dpo.ProcessPO;
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
@RestController
public class BaseProcessController {
    @Autowired
    private ProcessEngine processEngine;

    @GetMapping("/getProcess")
    public List<ProcessPO> getProcessById(@RequestParam(name = "pid") Long processId){
        return processEngine.createProcess(processId);
    }

}
