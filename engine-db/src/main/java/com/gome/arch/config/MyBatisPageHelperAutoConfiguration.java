package com.gome.arch.config;

import com.github.pagehelper.PageInterceptor;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

/**
 * @Classname MyBatisPageHelperAutoConfiguration
 * @Description TODO
 * @Date 2020/5/11 11:22 AM
 * @Created by nihui
 */
@Configuration
@ConditionalOnClass(value={DataSource.class,SqlSessionFactory.class,PageInterceptor.class})
//@ConditionalOnBean(name={"mysqlSqlSessionTemplateSelf"})
//@ConditionalOnBean(value = SqlSessionTemplate.class)
@ConditionalOnProperty(prefix = "arch.support.mybatis.pagehelper", name = "enabled", havingValue = "true", matchIfMissing = false)
@AutoConfigureAfter(MybatisAutoConfiguration.class)
@EnableConfigurationProperties(value={MyBatisPageHelperProperties.class})
public class MyBatisPageHelperAutoConfiguration {
    @Autowired
    private MyBatisPageHelperProperties myBatisPageHelperProperties;

    @Autowired
    @Qualifier("mysqlSqlSessionFactory")
    private SqlSessionFactory sqlSessionFactory;

    @PostConstruct
    public void addPageInterceptor(){
        PageInterceptor interceptor = new PageInterceptor();
        interceptor.setProperties(this.myBatisPageHelperProperties.getProperties());
        sqlSessionFactory.getConfiguration().addInterceptor(interceptor);
    }
}
