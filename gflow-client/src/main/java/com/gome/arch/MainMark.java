package com.gome.arch;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;


/**
 * @Classname MainMark
 * @Description TODO
 * @Date 2020/4/13 3:35 PM
 * @Created by nihui
 */

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@EnableCircuitBreaker
@EnableTransactionManagement
public class MainMark {
    public static void main(String[] args) {
        SpringApplication.run(MainMark.class,args);
    }
}
