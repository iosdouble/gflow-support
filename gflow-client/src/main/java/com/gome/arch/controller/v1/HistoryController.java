package com.gome.arch.controller.v1;

import com.gome.arch.constant.HTTPSTATE;
import com.gome.arch.core.engine.v1.history.HistoryService;
import com.gome.arch.dao.bean.HiApprovalUserFlow;
import com.gome.arch.service.dvo.response.ResponseEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname HistoryController
 * @Description TODO
 * @Date 2020/5/11 1:57 PM
 * @Created by nihui
 */
@Api(value = "历史操作管理",description = "历史数据管理")
@RestController
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping("/history")
    public String getHistory(){
        return "OK";
    }


    @GetMapping("/getApprovalFlow")
    public ResponseEntity getApprovalFlowHistory(@RequestParam(name = "applyid") Long applyId){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        List<HiApprovalUserFlow> approvalFlow = historyService.getApprovalFlow(applyId);
        responseEntity.setData(approvalFlow);
        return responseEntity;
    }


}
