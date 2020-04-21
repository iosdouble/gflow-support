package com.gome.arch.dao.bean;

import lombok.Data;

/**
 * @Classname User
 * @Description TODO
 * @Date 2020/4/20 10:51 AM
 * @Created by nihui
 */
@Data
public class User {
    private Integer id;
    private String username;
    private String password;
    private String email;
}
