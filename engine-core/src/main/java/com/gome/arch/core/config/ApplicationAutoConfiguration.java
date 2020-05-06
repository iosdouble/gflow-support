package com.gome.arch.core.config;

import com.gome.arch.core.manage.event.bean.ResApplyEvent;
import com.gome.arch.core.manage.event.impl.ResApplyCheckingPublisher;
import com.gome.arch.core.manage.listener.EmailListenerImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Classname ApplicationAutoConfiguration
 * @Description TODO
 * @Date 2020/4/23 11:32 AM
 * @Created by nihui
 */
@Configuration
public class ApplicationAutoConfiguration {

    @Bean
    public EmailListenerImpl emailListenerImpl() {
        EmailListenerImpl emailListenerImpl = new EmailListenerImpl();
        return emailListenerImpl;
    }

    @Bean
    public ResApplyCheckingPublisher resApplyCheckingPublisher() {
        ResApplyCheckingPublisher ResApplyCheckingPublisher = new ResApplyCheckingPublisher();
        return ResApplyCheckingPublisher;
    }

    @Bean
    public ResApplyEvent resApplyEvent(){
        return  new ResApplyEvent("Hello World");
    }
}
