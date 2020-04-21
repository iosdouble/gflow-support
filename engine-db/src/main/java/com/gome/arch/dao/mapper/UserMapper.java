package com.gome.arch.dao.mapper;

import com.gome.arch.dao.bean.User;
import org.apache.ibatis.annotations.Mapper;


/**
 * @Classname UserMapper
 * @Description TODO
 * @Date 2020/4/20 10:51 AM
 * @Created by nihui
 */
@Mapper
public interface UserMapper {
    public int addUser(User user);
}
