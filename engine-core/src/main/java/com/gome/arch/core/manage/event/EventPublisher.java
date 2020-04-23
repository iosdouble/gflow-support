package com.gome.arch.core.manage.event;

import com.gome.arch.core.manage.event.bean.ResApplyEvent;

/**
 * @Classname EventPublisher
 * @Description TODO 事件发布器接口
 * @Date 2020/4/23 11:15 AM
 * @Created by nihui
 */
public interface EventPublisher {

    public void publishEmailMessage(ResApplyEvent resApplyEvent);

    public void publishMeiBanMessage(ResApplyEvent resApplyEvent);
}
