package com.gome.arch.controller;

import com.github.pagehelper.PageInfo;
import com.gome.arch.core.engine.runtime.RuntimeService;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname RuntimeController
 * @Description TODO
 * @Date 2020/5/11 11:33 AM
 * @Created by nihui
 */
@Api(value = "运行时操作管理",description = "运行时流程管理")
@RestController

public class RuntimeController {

    @Autowired
    private RuntimeService runtimeService;

    /***
     * 根据用户ID获取审批列表
     * @param userid
     * @return
     */
    @GetMapping("/getTaskList")
    public PageInfo<ApprovalOrderPOExt> getOrder(@RequestParam(name = "userid") Long userid){
        return runtimeService.pageOrderApplies(userid,2,5);
    }

    /***
     * 审批指定任务
     */
    @PostMapping("/approvalTask")
    public String approvalTask(){
        return "OK";
    }





}
