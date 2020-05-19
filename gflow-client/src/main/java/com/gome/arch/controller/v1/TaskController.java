package com.gome.arch.controller.v1;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dao.bean.BaseApplyOrder;
import com.gome.arch.json.JsonUtil;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dto.BaseTaskTO;
import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.BaseTaskVO;
import com.gome.arch.service.dvo.TaskVO;
import com.gome.arch.core.engine.v1.task.TaskService;
import com.gome.arch.service.dvo.response.ResponseEntity;
import com.gome.arch.uuid.IdWorker;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;


/**
 * @Classname TaskController
 * @Description TODO 任务管理窗口
 * @Date 2020/5/6 3:56 PM
 * @Created by nihui
 */
@Api(value = "基本任务管理",description = "流程任务管理")
@Slf4j
@RestController
public class TaskController {

    @Autowired
    private IdWorker idWorker;
    @Autowired
    private TaskService taskService;


    @PostMapping("/addTask")
    public ResponseEntity<String> addTask(@RequestBody BaseTaskVO baseTaskVO){
        log.info(" addTask "+baseTaskVO.toString());
        Long applyId = idWorker.nextId();
        ResponseEntity responseEntity = new ResponseEntity();
        BaseTaskTO baseTaskTO = new BaseTaskTO();
        baseTaskTO.setApplyId(applyId);
        baseTaskTO.setApplyUserCode(baseTaskVO.getApplyUserCode());
        baseTaskTO.setSystemType(baseTaskVO.getSystemType());
        baseTaskTO.setApplyContentDetail(baseTaskVO.getApplyContentDetail());
        String s = taskService.addTask(baseTaskTO);
        responseEntity.setCode(200);
        responseEntity.setMsg("normal");
        responseEntity.setData(s);
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
        log.info("=========================== "+ JsonUtil.toJson(taskVO));
        TaskTO taskTO = new TaskTO();
        BeanUtils.copyProperties(taskVO,taskTO);
        taskTO.setApplyId(taskVO.getApplyId());
        taskTO.setProcessId(taskVO.getProcessId());
        String s = taskService.startTask(taskTO);
        responseEntity.setCode(200);
        responseEntity.setMsg("normal");
        responseEntity.setData("OK" + new Date() + s);
        return responseEntity;
    }

    /**
     * 废除工单
     * @return
     */
    @DeleteMapping("/endTask")
    public ResponseEntity<String> endTask(@RequestParam(name = "applyId") Long applyId){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg("normal");
        String s = taskService.endTask(applyId);
        responseEntity.setData(s);
        return responseEntity;
    }

    @GetMapping("/getStartList")
    public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(){
        ResponseEntity<PageInfo<BaseApplyOrderTO>> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(200);
        responseEntity.setMsg("nurmal");
        PageInfo<BaseApplyOrderTO> startTaskList = taskService.getStartTaskList(1994L, 0, 10);
        responseEntity.setData(startTaskList);
        return responseEntity;
    }


}
