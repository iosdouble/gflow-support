package com.gome.arch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;


/**
 * @Classname MainMark
 * @Description TODO
 * @Date 2020/4/13 3:35 PM
 * @Created by nihui
 */

@SpringBootApplication
//@MapperScan("com.gome.arch.dao")
@EnableTransactionManagement
public class MainMark {
    public static void main(String[] args) {
        SpringApplication.run(MainMark.class,args);
    }
}
