package com.gome.arch.controller.v1;

import com.gome.arch.core.engine.v1.ProcessEngine;
import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import io.swagger.annotations.Api;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @Classname BaseProcessController
 * @Description TODO 用来对流程相关的内容提供配置
 * @Date 2020/5/6 3:25 PM
 * @Created by nihui
 */
@Api(value = "获取基本的流程管理",description = "基本流程管理,用于测试以及其他地方调用的管理操作",tags = {"流程相关操作的管理"})
@RestController
public class BaseProcessController {
    @Autowired
    private ProcessEngine processEngine;

    @Deprecated
    @GetMapping("/getProcessById")
    public List<ProcessPO> getProcessById(@RequestParam(name = "pid") Long processId){
        return processEngine.createProcess(processId);
    }

//    @GetMapping("/getProcess")
    public ResponseEntity<List<ProcessPO>> getProcess(){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg("numal");
        List<ProcessPO> process = processEngine.createProcess();
        responseEntity.setData(process);
        return responseEntity;
    }

    @GetMapping("/startProcessUseable")
    public ResponseEntity<String> startProcess(@RequestParam(name = "processId") Long processId){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg("nurmal");
        Integer integer = processEngine.changProcessIsUseAble(processId, true);
        if (integer==1){
            responseEntity.setData("已存在使用中的流程");
        }
        responseEntity.setData("更新成功");
        return responseEntity;
    }

    @GetMapping("/startProcessUnuseAble")
    public ResponseEntity<String> startProcessUn(@RequestParam(name = "processId") Long processId){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg("nurmal");
        processEngine.changProcessIsUseAble(processId,false);
        responseEntity.setData("更新成功");
        return responseEntity;
    }

}
