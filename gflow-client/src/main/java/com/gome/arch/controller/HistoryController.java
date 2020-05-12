package com.gome.arch.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname HistoryController
 * @Description TODO
 * @Date 2020/5/11 1:57 PM
 * @Created by nihui
 */
@Api(value = "历史操作管理",description = "历史数据管理")
@RestController
public class HistoryController {

    @GetMapping("/history")
    public String getHistory(){
        return "OK";
    }
}
