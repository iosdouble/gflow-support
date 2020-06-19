package com.gome.arch.resource;

import com.github.pagehelper.PageInfo;
import com.gome.arch.constant.HTTPSTATE;
import com.gome.arch.core.engine.v1.task.TaskService;
import com.gome.arch.flow.feign.TaskFeignClient;
import com.gome.arch.json.JsonUtil;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dto.BaseTaskTO;
import com.gome.arch.service.dto.TaskTO;
import com.gome.arch.service.dvo.BaseTaskVO;
import com.gome.arch.service.dvo.TaskVO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import com.gome.arch.uuid.IdWorker;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.Date;

/**
 * @Classname TaskResource
 * @Description TODO
 * @Date 2020/6/18 3:59 PM
 * @Created by nihui
 */
@Api(value = "部门服务")
@Component
@Path("/v1/task")
@Slf4j
public class TaskResource implements TaskFeignClient {

    @Autowired
    private IdWorker idWorker;
    @Autowired
    private TaskService taskService;


    public ResponseEntity<String> addTask(@RequestBody BaseTaskVO baseTaskVO){
        log.info(JsonUtil.toJson(baseTaskVO));
        Long applyId = idWorker.nextId();
        ResponseEntity responseEntity = new ResponseEntity();
        try{
            BaseTaskTO baseTaskTO = new BaseTaskTO();
            baseTaskTO.setApplyId(applyId);
            baseTaskTO.setApplyUserName(baseTaskVO.getApplyUserName());
            baseTaskTO.setSystemType(baseTaskVO.getSystemType());
            baseTaskTO.setApplyContentDetail(baseTaskVO.getApplyContentDetail());
            String orderId = taskService.addTask(baseTaskTO);
            responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
            responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
            responseEntity.setData(orderId);
        }catch (Exception e){
            log.info(" error {}",e);
            e.printStackTrace();
            responseEntity.setCode(HTTPSTATE.HTTP_ERROR.getStateCode());
            responseEntity.setMsg(HTTPSTATE.HTTP_ERROR.getStateKey());
            responseEntity.setData("0");
        }
        return responseEntity;
    }


    public ResponseEntity<String> startTask(@RequestBody TaskVO taskVO){
        log.info("startTask {}",JsonUtil.toJson(taskVO));
        ResponseEntity responseEntity = new ResponseEntity();
        TaskTO taskTO = new TaskTO();
        BeanUtils.copyProperties(taskVO,taskTO);
        taskTO.setApplyId(taskVO.getApplyId());
        taskTO.setProcessId(taskVO.getProcessId());
        String s = taskService.startTask(taskTO);
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        responseEntity.setData("OK" + new Date() + s);
        return responseEntity;
    }


    public ResponseEntity<String> endTask(@RequestParam(name = "applyId") Long applyId){
        log.info("endTask {}",applyId);
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        String s = taskService.endTask(applyId);
        responseEntity.setData(s);
        return responseEntity;
    }

    @Override
    public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(Integer page,Integer limit ){
        log.info(" getStartList {} ",new Date());
        ResponseEntity<PageInfo<BaseApplyOrderTO>> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        PageInfo<BaseApplyOrderTO> startTaskList = taskService.getStartTaskList("1994", page, limit);
        responseEntity.setData(startTaskList);
        return responseEntity;
    }

}
