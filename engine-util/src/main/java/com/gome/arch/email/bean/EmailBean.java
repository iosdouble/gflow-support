package com.gome.arch.email.bean;

import lombok.Getter;
import lombok.Setter;

/**
 * @Classname EmailBean
 * @Description TODO
 * @Date 2020/4/23 11:35 AM
 * @Created by nihui
 */
@Getter
@Setter
public class EmailBean {
    private String title;	//标题
    private String msg;		//正文

    private String[] to;	//接受者

    private String[] cc;	//抄送者
    private String[] bc;
}
