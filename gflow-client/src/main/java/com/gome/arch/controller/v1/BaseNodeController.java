package com.gome.arch.controller.v1;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.annotations.ApiIgnore;

/**
 * @Classname BaseNodeController
 * @Description TODO
 * @Date 2020/5/6 3:26 PM
 * @Created by nihui
 */
@RestController
@Api(value = "基本节点管理",description = "节点管理，暂时没有提供对应的方法实现",tags = {"基本节点管理"})
@ApiIgnore
public class BaseNodeController {
    @GetMapping("/addNode")
    public String addNode(){
        return "OK";
    }
}
