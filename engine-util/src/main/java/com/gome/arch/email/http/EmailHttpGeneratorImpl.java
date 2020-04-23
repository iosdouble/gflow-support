package com.gome.arch.email.http;

import com.gome.arch.email.IEmailGenerator;
import com.gome.arch.email.bean.EmailBean;
import com.gome.arch.email.http.exception.EmailSendErrorException;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;
import lombok.Setter;

/**
 * @Classname EmailHttpGeneratorImpl
 * @Description TODO
 * @Date 2020/4/23 11:35 AM
 * @Created by nihui
 */
@Getter
@Setter
@Component
public class EmailHttpGeneratorImpl implements IEmailGenerator {
    protected final transient Logger errorLogger = LoggerFactory.getLogger(EmailHttpGeneratorImpl.class);

    private String mailReqUrl = "http://localhost:8080/email";
    private HttpHeaders headers = null;

    public EmailHttpGeneratorImpl() {
    }

    public EmailHttpGeneratorImpl(String mailReqUrl, HttpHeaders headers) {
        if(StringUtils.isNotBlank(mailReqUrl)) {
            this.mailReqUrl = mailReqUrl;
        }

        if(headers==null) {
            this.headers = new HttpHeaders();
            MediaType type = MediaType.parseMediaType("application/json; charset=UTF-8");
            this.headers.setContentType(type);
            this.headers.add("Accept", MediaType.APPLICATION_JSON.toString());
        }else {
            this.headers = headers;
        }
    }

    @Override
    public boolean sendMail(String toAddresses, String mailSubject, String mailBody) {
        try {
            EmailBean emailBean = new EmailBean();
            emailBean.setMsg(mailBody);
            emailBean.setTitle(mailSubject);
            emailBean.setTo(toAddresses.split(","));
            ObjectMapper objmapper = new ObjectMapper();
            objmapper.setSerializationInclusion(Include.NON_NULL);
            HttpEntity<String> formEntity = new HttpEntity<String>(objmapper.writeValueAsString(emailBean), headers);
            new RestTemplate().postForObject(mailReqUrl, formEntity, String.class);
            return true;
        } catch (Exception e) {
            errorLogger.error("send mail error!--->result:{}", e);
            throw new EmailSendErrorException("邮件发送失败", e);
        }
    }
}
