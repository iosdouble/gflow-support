package com.gome.arch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @Classname MainMark
 * @Description TODO
 * @Date 2020/4/13 3:35 PM
 * @Created by nihui
 */

@SpringBootApplication
//@MapperScan("com.gome.arch.dao")
public class MainMark {
    public static void main(String[] args) {
        SpringApplication.run(MainMark.class,args);
    }
}
