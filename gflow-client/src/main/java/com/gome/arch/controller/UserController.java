package com.gome.arch.controller;

import com.gome.arch.dao.bean.BaseProcess;
import com.gome.arch.dao.bean.User;
import com.gome.arch.dao.bean.ProcessPO;
import com.gome.arch.service.BaseProcessNodeService;
import com.gome.arch.service.BaseProcessService;
import com.gome.arch.service.UserService;
import com.gome.arch.uuid.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
