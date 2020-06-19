package com.gome.arch.resource;

import com.gome.arch.constant.HTTPSTATE;
import com.gome.arch.core.engine.v1.history.HistoryService;
import com.gome.arch.dao.bean.HiApprovalUserFlow;
import com.gome.arch.flow.feign.HistoryFeignClient;
import com.gome.arch.service.dvo.response.ResponseEntity;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.Path;
import java.util.List;

/**
 * @Classname HistoryResource
 * @Description TODO
 * @Date 2020/6/19 11:04 AM
 * @Created by nihui
 */
@Api(value = "历史服务")
@Component
@Path("/v1/history")
@Slf4j
public class HistoryResource implements HistoryFeignClient {

    @Autowired
    private HistoryService historyService;

    public ResponseEntity getApprovalFlowHistory(@RequestParam(name = "applyid") Long applyId){
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(HTTPSTATE.HTTP_OK.getStateCode());
        responseEntity.setMsg(HTTPSTATE.HTTP_OK.getStateKey());
        List<HiApprovalUserFlow> approvalFlow = historyService.getApprovalFlow(applyId);
        responseEntity.setData(approvalFlow);
        return responseEntity;
    }
}
