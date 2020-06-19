package com.gome.arch.config.jersey;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Classname RestJerseyProperties
 * @Description TODO
 * @Date 2020/6/18 6:15 PM
 * @Created by nihui
 */
@ConfigurationProperties(prefix = "arch.support.jersey2")
@Getter
@Setter
public class RestJerseyProperties {
    private boolean enabled;
    private String jaxrsApplicationClass;
    private String[] urlMappings;
}
