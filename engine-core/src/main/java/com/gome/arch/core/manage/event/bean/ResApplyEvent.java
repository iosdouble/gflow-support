package com.gome.arch.core.manage.event.bean;

import org.springframework.context.ApplicationEvent;

/**
 * @Classname ResApplyEvent
 * @Description TODO
 * @Date 2020/4/23 11:17 AM
 * @Created by nihui
 */
public class ResApplyEvent extends ApplicationEvent {
    /**
     * Create a new ApplicationEvent.
     *
     * @param source the object on which the event initially occurred (never {@code null})
     */
    public ResApplyEvent(Object source) {
        super(source);
    }
}
