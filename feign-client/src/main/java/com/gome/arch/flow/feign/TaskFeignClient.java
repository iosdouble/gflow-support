package com.gome.arch.flow.feign;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dvo.BaseTaskVO;
import com.gome.arch.service.dvo.TaskVO;
import org.springframework.cloud.openfeign.FeignClient;

import com.gome.arch.service.dvo.response.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Classname TaskFeignClient
 * @Description TODO
 * @Date 2020/6/18 3:53 PM
 * @Created by nihui
 */
@FeignClient(name="gome-flow-service", fallbackFactory = TaskFeignClientFallbackFactory.class,url="${gome-flow-service.feign.url:}")
@Path("/api/v1/task")
@Produces(MediaType.APPLICATION_JSON)
public interface TaskFeignClient {


    @POST
    @Path("/addTask")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<String> addTask(@Valid  BaseTaskVO baseTaskVO);


    @POST
    @Path("/startTask")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<String> startTask(@Valid TaskVO taskVO);


    @GET
    @Path("/end")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<String> endTask(@QueryParam("applyId") Long applyId);

    @GET
    @Path("/getStartList")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(
            @QueryParam("username") String name,
            @QueryParam("offset") Integer offset,
            @QueryParam("limit") Integer limit);

    @GET
    @Path("/getProcess")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<List<ProcessPO>> getProcessMethod(String tag);
}
