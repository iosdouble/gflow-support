package com.gome.arch.flow.feign;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.dvo.ApprovalDealVO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import org.springframework.cloud.openfeign.FeignClient;

import javax.validation.Valid;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * @Classname RuntimeFeignClient
 * @Description TODO
 * @Date 2020/6/19 11:00 AM
 * @Created by nihui
 */
@FeignClient(name="gome-flow-service", fallbackFactory = RuntimeFeignClientFallbackFactory.class,url="${gome-flow-service.feign.url:}")
@Path("/api/v1/runtime")
@Produces(MediaType.APPLICATION_JSON)
public interface RuntimeFeignClient {

    @GET
    @Path("/getOrder")
    @Consumes({MediaType.APPLICATION_JSON})
    @Deprecated
    public ResponseEntity<PageInfo<ApprovalOrderPOExt>>  getOrder(
            @QueryParam("username")String userName,
            @QueryParam("offset") Integer offset,
            @QueryParam("limit") Integer limit);

    /***
     * 审批指定任务
     */
    @POST
    @Path("/approvalTask/{userName}/check")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<String> approvalTask(
            @PathParam("userName") String dealName,
            @Valid ApprovalDealVO approvalDealVO);

    /**
     * 查看审批流程详情
     * @param applyId
     * @return
     */
    @GET
    @Path("/getApprvalDetail")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<List<RtApprovalDetail>> getApprovalDetail(@QueryParam("applyId") Long applyId);

    /**
     * 获取工单详情
     * @param applyId
     * @return
     */
    @GET
    @Path("/getApplyOrderDetail")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<RtApplyOrderDetail> getApplyOrderDetail(@QueryParam("orderId") Long applyId);

    /**
     * 根据工单号终止当前工单
     * @param applyId
     * @return
     */

    @GET
    @Path("/endApprovalProcess")
    @Consumes({MediaType.APPLICATION_JSON})
    public ResponseEntity<String> endApprovalProcess(@QueryParam("applyid") Long applyId);
}
