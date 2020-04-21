package com.gome.arch.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Classname MysqlDateSourceStandaloneProperties
 * @Description TODO 数据源配置文件
 * @Date 2020/4/20 11:44 AM
 * @Created by nihui
 */
@ConfigurationProperties(prefix="arch.support.mysql.standalone")
public class MysqlDateSourceStandaloneProperties {
    private boolean enabled;
    private String driverClassName;
    private String url;
    private String username;
    private String password;
    private int maxActive=10;
    private int initialSize=3;


    public boolean isEnabled() {
        return enabled;
    }
    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
    public String getDriverClassName() {
        return driverClassName;
    }
    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getMaxActive() {
        return maxActive;
    }
    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }
    public int getInitialSize() {
        return initialSize;
    }
    public void setInitialSize(int initialSize) {
        this.initialSize = initialSize;
    }
}