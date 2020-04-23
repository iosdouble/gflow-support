package com.gome.arch.core.manage.event.impl;


import com.gome.arch.core.manage.event.AbstractEventPublisher;
import com.gome.arch.core.manage.event.EventPublisher;
import com.gome.arch.core.manage.event.bean.ResApplyEvent;
import org.springframework.scheduling.annotation.Async;

/**
 * @Classname ResApplyCheckingPublisher
 * @Description TODO
 * @Date 2020/4/23 11:20 AM
 * @Created by nihui
 */
public class ResApplyCheckingPublisher extends AbstractEventPublisher {


    @Override
    public void publishEmailMessage(ResApplyEvent resApplyEvent) {
        putEvent(resApplyEvent);
    }

    @Override
    public void publishMeiBanMessage(ResApplyEvent resApplyEvent) {
        putEvent(resApplyEvent);
    }
}
