package com.gome.arch.email.http.exception;

/**
 * @Classname EmailSendErrorException
 * @Description TODO
 * @Date 2020/4/23 11:43 AM
 * @Created by nihui
 */
public class EmailSendErrorException extends RuntimeException{
    public EmailSendErrorException(String message, Throwable cause) {
        super(message, cause);
    }
}
