package com.gome.arch.config;

import com.gome.arch.utils.ResourceUtil;
import org.apache.ibatis.session.ExecutorType;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.PathResource;
import org.springframework.core.io.Resource;

import javax.sql.DataSource;

/**
 * @Classname MybatisConfig
 * @Description TODO 自动配置Mybatis相关配置
 * @Date 2020/4/20 11:24 AM
 * @Created by nihui
 */
@Configuration
@ConditionalOnClass(value={DataSource.class,SqlSessionFactory.class})
@ConditionalOnProperty(prefix = "arch.support.mybatis", name = "enabled", havingValue = "true", matchIfMissing = false)
@EnableConfigurationProperties(MyBatisProperties.class)
public class MybatisAutoConfiguration {

    /**
     * 注入自动配置项
     */
    @Autowired
    private MyBatisProperties myBatisProperties;

    /**
     * 注入数据源
     */
    @Autowired(required=false)
    @Qualifier("standaloneMysqlDataSource")
    private DataSource standaloneMysqlDataSource;


    /**
     * 添加MybatisSession Bean 如果已经存在则不再执行，也就是说在其他地方没有对应配置。
     * @return
     */
    @Bean(name = "mysqlSqlSessionFactory")
    @ConditionalOnMissingBean(name = { "mysqlSqlSessionFactory" })
    @Primary
    public SqlSessionFactory sqlSessionFactory() {
        DataSource  dataSource=standaloneMysqlDataSource;

        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        sqlSessionFactoryBean.setTypeAliasesPackage(myBatisProperties.getMapperBeanPackages());// bean

        Resource[] mapperLocations=ResourceUtil.resolveLocationsToResource(myBatisProperties.getMapperSqlXmls());
        sqlSessionFactoryBean.setMapperLocations(mapperLocations);// xml

        try {
//			sqlSessionFactoryBean.getObject().getConfiguration().addMappers(myBatisProperties.getMapperInterfacePackages());
            return sqlSessionFactoryBean.getObject();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Mysql Session 的Templates配置
     * @return
     */
    @Bean(name = "mysqlSqlSessionTemplate")
    @ConditionalOnMissingBean(name = { "mysqlSqlSessionTemplate" })
    @Primary
    public SqlSessionTemplate sqlSessionTemplate() {
        SqlSessionFactory sqlSessionFactory=sqlSessionFactory();
        ExecutorType executorType = this.myBatisProperties.getExecutorType();
        if (executorType != null) {
            return new SqlSessionTemplate(sqlSessionFactory, executorType);
        } else {
            return new SqlSessionTemplate(sqlSessionFactory);
        }
    }
}
