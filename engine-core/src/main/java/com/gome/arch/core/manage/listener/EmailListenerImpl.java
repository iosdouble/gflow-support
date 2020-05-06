package com.gome.arch.core.manage.listener;

import com.gome.arch.core.manage.event.bean.ResApplyEvent;
import com.gome.arch.email.IEmailGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;

import java.util.Map;

/**
 * @Classname EmailListenerImpl
 * @Description TODO
 * @Date 2020/4/23 11:31 AM
 * @Created by nihui
 */
public class EmailListenerImpl {
    @Autowired
    private IEmailGenerator emailGenerator;

    @EventListener
    public void toSendAdminerEmail(ResApplyEvent resApplyEvent){

        emailGenerator.sendMail("Test","Test","Test");
    }
}
