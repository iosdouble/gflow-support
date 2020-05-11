package com.gome.arch.controller;

import com.github.pagehelper.PageInfo;
import com.gome.arch.core.engine.runtime.RuntimeService;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Classname RuntimeController
 * @Description TODO
 * @Date 2020/5/11 11:33 AM
 * @Created by nihui
 */
@RestController
public class RuntimeController {

    @Autowired
    private RuntimeService runtimeService;

    @GetMapping("/getOrderList")
    public PageInfo<ApprovalOrderPOExt> getOrder(@RequestParam(name = "userid") Long userid){
        return runtimeService.pageOrderApplies(userid,2,5);
    }


}
