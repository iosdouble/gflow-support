package com.gome.arch.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.support.TransactionTemplate;

import javax.sql.DataSource;

/**
 * @Classname MysqlDataSourceStandaloneAutoConfiguration
 * @Description TODO 自动配置数据源
 * @Date 2020/4/20 11:43 AM
 * @Created by nihui
 */
@Configuration
@ConditionalOnClass(value={DataSource.class,DruidDataSource.class})
@ConditionalOnProperty(prefix = "arch.support.mysql.standalone", name = "enabled", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties(value={MysqlDateSourceStandaloneProperties.class})
@EnableTransactionManagement(proxyTargetClass = true)
public class MysqlDataSourceStandaloneAutoConfiguration {

    /**
     * 加入数据源相关的配置项
     */
    @Autowired
    private MysqlDateSourceStandaloneProperties mysqlDateSourceStandaloneProperties;

    /**
     * 标准单一数据源
     * @return
     */
    @Bean(name = { "standaloneMysqlDataSource" })
    @Primary
    @ConditionalOnMissingBean(name = { "standaloneMysqlDataSource" })
    public DataSource standaloneMysqlDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(mysqlDateSourceStandaloneProperties.getDriverClassName());
        druidDataSource.setUrl(mysqlDateSourceStandaloneProperties.getUrl());
        druidDataSource.setUsername(mysqlDateSourceStandaloneProperties.getUsername());
        druidDataSource.setPassword(mysqlDateSourceStandaloneProperties.getPassword());
        druidDataSource.setMaxActive(mysqlDateSourceStandaloneProperties.getMaxActive());
        druidDataSource.setInitialSize(mysqlDateSourceStandaloneProperties.getInitialSize());
        return druidDataSource;
    }

    /**
     *事务管理器
     * @param dataSource
     * @return
     */
    @Bean(name = { "standaloneMySqlTransactionManager" })
    @Primary
    @ConditionalOnMissingBean(name = { "standaloneMySqlTransactionManager" })
    public DataSourceTransactionManager annotationDrivenTransactionManager(
            @Qualifier("standaloneMysqlDataSource") DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager=new DataSourceTransactionManager(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean(name = "standaloneMySqlTransactionTemplate")
    @Primary
    public TransactionTemplate transactionTemplate(
            @Qualifier("standaloneMySqlTransactionManager") DataSourceTransactionManager dataSourceTransactionManager) {
        return new TransactionTemplate(dataSourceTransactionManager);
    }

}
