package com.gome.arch.config;

import com.gom.arch.flow.config.ExtendJacksonJsonProvider;
import com.gome.arch.resource.BaseProcessResource;
import com.gome.arch.resource.HistoryResource;
import com.gome.arch.resource.RuntimeResource;
import com.gome.arch.resource.TaskResource;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.jaxrs.listing.SwaggerSerializers;
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
public class RestJerseyRegister extends ResourceConfig {
    public RestJerseyRegister() {
        register(RequestContextFilter.class);
        //Jersey2和SpringBoot集成有bug,Jersey无法加载scanPackage获得结果
//		packages("com.juran.example.app.resource");
        registerClasses(findRegisterV1Resources());

    }

    @PostConstruct
    public void initSwagger(){
        register(ApiListingResource.class);
        register(SwaggerSerializers.class);
        register(ExtendJacksonJsonProvider.class);
    }

    private Set<Class<?>> findRegisterV1Resources(){
        Set<Class<?>> registerResources=new HashSet<Class<?>>();
        registerResources.add(BaseProcessResource.class);
        registerResources.add(TaskResource.class);
        registerResources.add(RuntimeResource.class);
        registerResources.add(HistoryResource.class);

        return registerResources;
    }
}
