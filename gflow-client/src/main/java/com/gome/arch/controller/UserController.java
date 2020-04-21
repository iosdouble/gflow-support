package com.gome.arch.controller;

import com.gome.arch.dao.bean.User;
import com.gome.arch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Classname UserController
 * @Description TODO
 * @Date 2020/4/20 10:59 AM
 * @Created by nihui
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

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
}
