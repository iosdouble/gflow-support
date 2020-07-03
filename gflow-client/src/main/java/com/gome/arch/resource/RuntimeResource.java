package com.gome.arch.resource;

import com.github.pagehelper.PageInfo;
import com.gome.arch.constant.APPROVAL;
import com.gome.arch.constant.HTTPSTATE;
import com.gome.arch.core.engine.v1.runtime.RuntimeService;
import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.flow.feign.RuntimeFeignClient;
import com.gome.arch.json.JsonUtil;
import com.gome.arch.service.dto.ApprovalDealTO;
import com.gome.arch.service.dvo.ApprovalDealVO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.Path;
import java.util.List;

/**
 * @Classname RuntimeResource
 * @Description TODO
 * @Date 2020/6/19 11:03 AM
 * @Created by nihui
 */
@Api(value = "运行时服务")
@Component
@Path("/v1/runtime")
@Slf4j
public class RuntimeResource implements RuntimeFeignClient {

    @Autowired
    private RuntimeService runtimeService;


    @Deprecated
    public ResponseEntity<PageInfo<ApprovalOrderPOExt>> getOrder(String userName, Integer offset, Integer limit){
        log.info("======= "+ userName);
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        PageInfo<ApprovalOrderPOExt> approvalOrderPOExtPageInfo = runtimeService.pageOrderApplies(userName, offset, limit);
        responseEntity.setData(approvalOrderPOExtPageInfo);
        return responseEntity;
    }

    /***
     * 审批指定任务
     */
    public ResponseEntity<String> approvalTask(String dealName,ApprovalDealVO approvalDealVO){
        log.info("========  "+ JsonUtil.toJson(approvalDealVO));
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        ApprovalDealTO approvalDealTO = new ApprovalDealTO();
        BeanUtils.copyProperties(approvalDealVO,approvalDealTO);
        approvalDealTO.setDealUserName(dealName);
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

    public ResponseEntity<String> endApprovalProcess(@RequestParam(name = "applyid") Long applyId){
        return null;
    }


}
