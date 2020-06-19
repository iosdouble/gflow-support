package com.gome.arch.flow.feign;

import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Classname BaseProcessFeignClient
 * @Description TODO
 * @Date 2020/6/19 4:32 PM
 * @Created by nihui
 */
@FeignClient(name="gome-flow-service", fallbackFactory = BaseProcessFeignClientFallbackFactory.class,url="${gome-flow-service.feign.url:}")
@Path("/api/v1/process")
@Produces(MediaType.APPLICATION_JSON)
public interface BaseProcessFeignClient {

    @GET
    @Path("/getProcess")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<List<ProcessPO>> getProcessMethod(String tag);
}
