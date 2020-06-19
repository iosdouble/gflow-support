package com.gome.arch.config.swagger2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Classname RestSwagger2Properties
 * @Description TODO
 * @Date 2020/6/18 6:19 PM
 * @Created by nihui
 */
@ConfigurationProperties(prefix="arch.support.swagger2")
@Getter
@Setter
public class RestSwagger2Properties {
    private boolean enabled;
    private String configId;
    private String title;
    private String version;
    private String contact;
    private String[] schemes;
    private String basePath;
    private String resourcePackage;
    private boolean prettyPrint;
    private boolean scan;
    private String urlPath="/v2/api-docs";
}
