package com.gome.arch.core.manage.event;

import com.gome.arch.core.manage.event.bean.ResApplyEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @Classname AbstractEventPublisher
 * @Description TODO
 * @Date 2020/4/23 11:22 AM
 * @Created by nihui
 */
public abstract class AbstractEventPublisher implements EventPublisher{

    @Autowired
    private ApplicationContext applicationContext;

    @Async
    public void putEvent(ResApplyEvent resApplyEvent){
        applicationContext.publishEvent(resApplyEvent);
    }
}
