package com.gome.arch.config.swagger2;

import io.swagger.jaxrs.config.BeanConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.annotation.PostConstruct;

/**
 * @Classname RestSwagger2AutoConfiguration
 * @Description TODO
 * @Date 2020/6/18 6:20 PM
 * @Created by nihui
 */
@Configuration
@ConditionalOnClass(BeanConfig.class)
@ConditionalOnProperty(prefix = "arch.support.swagger2", name = "enabled", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties(RestSwagger2Properties.class)
@EnableSwagger2
public class RestSwagger2AutoConfiguration {

    @Autowired
    private RestSwagger2Properties restSwagger2Properties;

    @PostConstruct
    public void beanConfig(){
        BeanConfig config = new BeanConfig();
        config.setConfigId(restSwagger2Properties.getConfigId());
        config.setTitle(restSwagger2Properties.getTitle());
        config.setVersion(restSwagger2Properties.getVersion());
        config.setContact(restSwagger2Properties.getContact());
        config.setSchemes(restSwagger2Properties.getSchemes());
        config.setBasePath(restSwagger2Properties.getBasePath());
        config.setResourcePackage(restSwagger2Properties.getResourcePackage());
        config.setPrettyPrint(restSwagger2Properties.isPrettyPrint());
        config.setScan(restSwagger2Properties.isScan());
    }
}
