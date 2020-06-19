package com.gome.arch.controller.v1;

import com.github.pagehelper.PageInfo;
import com.gome.arch.constant.HTTPSTATE;
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
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(value = "任务操作接口",description = "流程任务管理",tags = {"任务操作接口"})
@Slf4j
@RestController
@RequestMapping
public class TaskController {

    @Autowired
    private IdWorker idWorker;
    @Autowired
    private TaskService taskService;


    @ApiOperation(value = "用户第三方接口调用",notes = "第三方系统调用，向流程管理中添加自己的任务操作")
    @ApiParam(name = "baseTaskVO",value = "封装的任务信息")
    @PostMapping("/addTask")
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

    /**
     * 开启任务
     * @param taskVO
     * @return
     */
    @PostMapping("/startTask")
    @ApiOperation(value = "开启任务接口",notes = "用户开启当前任务指定的流程操作，并且选择审批人等操作")
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

    /**
     * 废除工单
     * @return
     */
    @ApiOperation(value = "废除工单接口",notes = "在用户提交工单之后，如果出现不需要进行流程操作的时候，可以调用这个接口来对指定工单号进行废除操作")
    @DeleteMapping("/endTask")
    public ResponseEntity<String> endTask(@RequestParam(name = "applyId") Long applyId){
        log.info("endTask {}",applyId);
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        String s = taskService.endTask(applyId);
        responseEntity.setData(s);
        return responseEntity;
    }

//    @GetMapping("/getStartList")
//    @RequestMapping( value = "/getStartList",method = RequestMethod.GET)
    @ApiOperation(value = "获取工单列表操作信息",notes = "获取到指定用户当前，所有操作状态的工单信息")
    public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(@RequestParam("page") Integer page,
                                                                  @RequestParam("limit") Integer limit){
        log.info(" getStartList {} ",new Date());
        ResponseEntity<PageInfo<BaseApplyOrderTO>> responseEntity = new ResponseEntity<>();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        PageInfo<BaseApplyOrderTO> startTaskList = taskService.getStartTaskList("1994", page, limit);
        responseEntity.setData(startTaskList);
        return responseEntity;
    }
}
