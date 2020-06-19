package com.gome.arch.flow.feign;

import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Classname TaskFeignClient
 * @Description TODO
 * @Date 2020/6/18 3:53 PM
 * @Created by nihui
 */
@FeignClient(name="gome-flow-service", fallbackFactory = ProcessFeignClientFallbackFactory.class,url="${gome-flow-service.feign.url:}")
@Path("/api/v1/task")
@Produces(MediaType.APPLICATION_JSON)
public interface ProcessFeignClient {

    @GET
    @Path("/getProcess")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<List<ProcessPO>> getProcessMethod(String tag);
}
