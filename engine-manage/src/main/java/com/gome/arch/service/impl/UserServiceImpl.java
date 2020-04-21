package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.User;
import com.gome.arch.dao.mapper.UserMapper;
import com.gome.arch.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname UserServiceImpl
 * @Description TODO
 * @Date 2020/4/20 10:57 AM
 * @Created by nihui
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public int add(User user) {
        return userMapper.addUser(user);
    }
}
