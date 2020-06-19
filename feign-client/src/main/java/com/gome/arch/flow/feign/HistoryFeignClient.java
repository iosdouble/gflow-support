package com.gome.arch.flow.feign;

import com.gome.arch.service.dvo.response.ResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @Classname HistoryFeignClient
 * @Description TODO
 * @Date 2020/6/19 11:00 AM
 * @Created by nihui
 */
@FeignClient(name="gome-flow-service", fallbackFactory = HistoryFeignClientFallbackFactory.class,url="${gome-flow-service.feign.url:}")
@Path("/api/v1/history")
@Produces(MediaType.APPLICATION_JSON)
public interface HistoryFeignClient {
    public ResponseEntity getApprovalFlowHistory(@RequestParam(name = "applyid") Long applyId);
}
