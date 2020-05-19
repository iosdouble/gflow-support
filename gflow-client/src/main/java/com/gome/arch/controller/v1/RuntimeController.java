package com.gome.arch.controller.v1;

import com.github.pagehelper.PageInfo;
import com.gome.arch.core.engine.v1.runtime.RuntimeService;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.dto.ApprovalDealTO;
import com.gome.arch.service.dvo.ApprovalDealVO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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


    @Deprecated
    @GetMapping("/getTaskList")
    public PageInfo<ApprovalOrderPOExt> getOrder(){
        Long userid = 1994L;
        PageInfo<ApprovalOrderPOExt> approvalOrderPOExtPageInfo = runtimeService.pageOrderApplies(userid, 1, 5);
        return approvalOrderPOExtPageInfo;
    }

    /***
     * 审批指定任务
     */
    @PostMapping("/approvalTask")
    public ResponseEntity<String> approvalTask(@RequestBody ApprovalDealVO approvalDealVO){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg("numal");

        ApprovalDealTO approvalDealTO = new ApprovalDealTO();
        BeanUtils.copyProperties(approvalDealTO,approvalDealVO);
        if (approvalDealVO.getStatus()==1){
            runtimeService.updateApprovalAgree(approvalDealTO);
        }else if (approvalDealVO.getStatus()==0){
            runtimeService.updateApprovalReject(approvalDealTO);
        }
        responseEntity.setData("OK");
        return responseEntity;
    }

    @GetMapping("/getApprovalDetail")
    public ResponseEntity<String> getApprovalDetail(@RequestParam(name = "applyId") Long applyId){
        return null;
    }






}
