package com.gome.arch.email;

/**
 * @Classname IEmailGenerator
 * @Description TODO
 * @Date 2020/4/23 11:34 AM
 * @Created by nihui
 */
public interface IEmailGenerator {
    public boolean sendMail(String toAddresses, String mailSubject, String mailBody);
}
