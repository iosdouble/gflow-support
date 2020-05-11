package com.gome.arch.controller;

import com.gome.arch.dao.bean.BaseProcess;
import com.gome.arch.dao.bean.RtApprovalUser;
import com.gome.arch.dao.bean.User;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.*;
import com.gome.arch.service.dto.ApprovalOrderTO;
import com.gome.arch.service.dvo.ApprovalDealVO;
import com.gome.arch.uuid.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2020/4/20 10:59 AM
 * @Created by nihui
 */
@RestController
public class UserController {

    @Autowired
    private IdWorker idWorker;

    @Autowired
    private UserService userService;

    @Autowired
    private BaseProcessService baseProcessService;

    @Autowired
    private BaseProcessNodeService baseProcessNodeService;

    @Autowired
    private RtApplyOrderService rtApplyOrderService;

    @Autowired
    private RtApprovalUserService rtApprovalUserService;

    @Autowired
    private RtApprovalDetailService rtApprovalDetailService;


    @GetMapping("/add")
    public String add(){
        User user = new User();
        user.setId(1);
        user.setUsername("nihui");
        user.setPassword("123123");
        user.setEmail("nihui@geom.com.cn");
        userService.add(user);
        return "OK";
    }

    @GetMapping("/getFlow")
    public List<BaseProcess> getAll(){
        return baseProcessService.getAllProcess();
    }

    @GetMapping("/getProcessById")
    public List<ProcessPO> getProcess(@RequestParam(name = "id") Long processId){
        List<ProcessPO> processById = baseProcessNodeService.getProcessById(processId);
        return processById;
    }
    @GetMapping("getId")
    public Long getId(){
        return idWorker.nextId();
    }

    @GetMapping("/getOrder")
    public List<ApprovalOrderPOExt> getOrder(@RequestParam(name = "userid") Long userid){
        return rtApplyOrderService.getApprovalDetailListByUserId(userid);
    }

    @GetMapping("/getDealList")
    public List<RtApprovalUser> getDealList(@RequestParam(name = "id") Long id){
        return rtApprovalUserService.getRelationByApplyId(id);
    }

    @PostMapping("/approval")
    public int getApproval(@RequestBody ApprovalDealVO approvalDealVO){
        return rtApprovalDetailService.insertApprovalDetail(approvalDealVO);
    }

    @GetMapping("/update")
    public int update(@RequestParam(name = "node") Long node){
        ApprovalOrderTO approvalOrderTO = new ApprovalOrderTO();
        approvalOrderTO.setApplyId(1259680642995879936L);
        approvalOrderTO.setCurrentNode(node);
        return rtApplyOrderService.updateApplyOrderOK(approvalOrderTO);
    }
}
