package com.gome.arch.config;

import lombok.Getter;
import lombok.Setter;
import org.apache.ibatis.session.ExecutorType;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Classname MyBatisProperties
 * @Description TODO Mybatis相关配置
 * @Date 2020/4/20 11:41 AM
 * @Created by nihui
 */
@ConfigurationProperties(prefix = "arch.support.mybatis")
@Getter
@Setter
public class MyBatisProperties {
    private boolean enabled;

    private String[] mapperSqlXmls;
    private String mapperBeanPackages;
    private ExecutorType executorType;
    private String mapperInterfacePackages;
}
