package com.gome.arch.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname BaseNodeController
 * @Description TODO
 * @Date 2020/5/6 3:26 PM
 * @Created by nihui
 */
@RestController
@Api(value = "基本节点管理",description = "节点管理")
public class BaseNodeController {
    @GetMapping("/addNode")
    public String addNode(){
        return "OK";
    }
}
