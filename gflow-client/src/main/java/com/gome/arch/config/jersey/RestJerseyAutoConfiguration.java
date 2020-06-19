package com.gome.arch.config.jersey;

import org.glassfish.jersey.servlet.ServletContainer;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname RestJerseyAutoConfiguration
 * @Description TODO
 * @Date 2020/6/18 6:16 PM
 * @Created by nihui
 */
@Configuration
@ConditionalOnClass(value={ServletContainer.class,ServletRegistrationBean.class})
@ConditionalOnProperty(prefix = "arch.support.jersey2", name = "enabled", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties(RestJerseyProperties.class)
public class RestJerseyAutoConfiguration {
    @Autowired
    private RestJerseyProperties restJerseyProperties;

    @Bean
    public ServletRegistrationBean<ServletContainer> jerseyServlet() {

        ServletContainer servletContainer=new ServletContainer();
        String[] urlMappings=restJerseyProperties.getUrlMappings();
        String jaxrsApplicationClass=restJerseyProperties.getJaxrsApplicationClass();

        ServletRegistrationBean<ServletContainer> registration = new ServletRegistrationBean<ServletContainer>(servletContainer, urlMappings);

        registration.addInitParameter(ServletProperties.JAXRS_APPLICATION_CLASS, jaxrsApplicationClass);
        return registration;
    }

}
