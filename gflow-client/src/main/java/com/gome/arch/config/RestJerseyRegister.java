package com.gome.arch.config;

import com.gome.arch.resource.TaskResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.RequestContextFilter;

import javax.annotation.PostConstruct;
import java.util.HashSet;
import java.util.Set;

/**
 * @Classname RestJerseyRegister
 * @Description TODO
 * @Date 2020/6/18 4:01 PM
 * @Created by nihui
 */
@Configuration
public class RestJerseyRegister extends ResourceConfig {
    public RestJerseyRegister() {
        register(RequestContextFilter.class);
        //Jersey2和SpringBoot集成有bug,Jersey无法加载scanPackage获得结果
//		packages("com.juran.example.app.resource");
        registerClasses(findRegisterV1Resources());

    }

    @PostConstruct
    public void initSwagger(){
    }

    private Set<Class<?>> findRegisterV1Resources(){
        Set<Class<?>> registerResources=new HashSet<Class<?>>();
        registerResources.add(TaskResource.class);
        return registerResources;
    }
}
