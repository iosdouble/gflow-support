package com.gome.arch.flow.feign;

import com.github.pagehelper.PageInfo;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import org.springframework.cloud.openfeign.FeignClient;

import com.gome.arch.service.dvo.response.ResponseEntity;


import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

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


//    public ResponseEntity<String> addTask(@RequestBody BaseTaskVO baseTaskVO);
//
//
//    public ResponseEntity<String> startTask(@RequestBody TaskVO taskVO);
//
//
//    public ResponseEntity<String> endTask(@RequestParam(name = "applyId") Long applyId);

    @GET
    @Path("/getStartList")
    @Consumes(MediaType.APPLICATION_JSON)
    public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(
            @QueryParam("page") Integer page,
            @QueryParam("limit") Integer limit);


//        @GET
////    @Path("/getStartList")
//    @Consumes(MediaType.APPLICATION_JSON)
//    public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(
//             Integer page, Integer limit);
}
