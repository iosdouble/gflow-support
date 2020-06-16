package com.gome.arch.controller.v1;

import com.github.pagehelper.PageInfo;
import com.gome.arch.constant.APPROVAL;
import com.gome.arch.constant.HTTPSTATE;
import com.gome.arch.constant.STATE;
import com.gome.arch.core.engine.v1.runtime.RuntimeService;
import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.json.JsonUtil;
import com.gome.arch.service.dto.ApprovalDealTO;
import com.gome.arch.service.dvo.ApprovalDealVO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname RuntimeController
 * @Description TODO
 * @Date 2020/5/11 11:33 AM
 * @Created by nihui
 */
@Api(value = "运行时操作管理",description = "运行时流程管理",tags = {"运行时操作管理"})
@RestController
@Slf4j
public class RuntimeController {

    @Autowired
    private RuntimeService runtimeService;


    @Deprecated
    @GetMapping("/getTaskList")
    public PageInfo<ApprovalOrderPOExt> getOrder(){
        Long userid = 1992L;
        PageInfo<ApprovalOrderPOExt> approvalOrderPOExtPageInfo = runtimeService.pageOrderApplies(userid, 0, 5);
        return approvalOrderPOExtPageInfo;
    }

    /***
     * 审批指定任务
     */
    @PostMapping("/approvalTask")
    public ResponseEntity<String> approvalTask(@RequestBody ApprovalDealVO approvalDealVO){
        log.info("========  "+ JsonUtil.toJson(approvalDealVO));
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        ApprovalDealTO approvalDealTO = new ApprovalDealTO();
        BeanUtils.copyProperties(approvalDealVO,approvalDealTO);
        approvalDealTO.setDealUserName("1994");
        if (approvalDealVO.getStatus()==APPROVAL.AGREE){
            runtimeService.updateApprovalAgree(approvalDealTO);
        }else if (approvalDealVO.getStatus()==APPROVAL.REJECT){
            runtimeService.updateApprovalReject(approvalDealTO);
        }
        responseEntity.setData("OK");
        return responseEntity;
    }

    /**
     * 查看审批流程详情
     * @param applyId
     * @return
     */
    @GetMapping("/getApprovalFlowDetail")
    public ResponseEntity<List<RtApprovalDetail>> getApprovalDetail(@RequestParam(name = "applyId") Long applyId){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        List<RtApprovalDetail> approvalDetail = runtimeService.getApprovalDetail(applyId);
        responseEntity.setData(approvalDetail);
        return responseEntity;
    }

    /**
     * 获取工单详情
     * @param applyId
     * @return
     */
    @GetMapping("/getApplyOrderDetail")
    public ResponseEntity<RtApplyOrderDetail> getApplyOrderDetail(@RequestParam(name = "orderId") Long applyId){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        RtApplyOrderDetail applyOrderDetailByApplyId = runtimeService.getApplyOrderDetailByApplyId(applyId);
        responseEntity.setData(applyOrderDetailByApplyId);
        return responseEntity;
    }

    /**
     * 根据工单号终止当前工单
     * @param applyId
     * @return
     */
    @DeleteMapping("/endProcess")
    public ResponseEntity<String> endApprovalProcess(@RequestParam(name = "applyid") Long applyId){
        return null;
    }
}
