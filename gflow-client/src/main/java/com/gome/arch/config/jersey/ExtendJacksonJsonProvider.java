package com.gome.arch.config.jersey;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.jaxrs.cfg.Annotations;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

/**
 * @Classname ExtendJacksonJsonProvider
 * @Description TODO 序列换成json时,将所有的long变成string，因为js中得数字类型不能包含所有的java long值
 *   用法：ResourceConfig类中initJersey的时候register(ExtendJacksonJsonProvider.class)即可
 * @Date 2020/6/18 6:14 PM
 * @Created by nihui
 */
public class ExtendJacksonJsonProvider extends JacksonJsonProvider {
    private static ObjectMapper objectMapper(){
        ObjectMapper objectMapper=new ObjectMapper();
        /**
         * 序列换成json时,将所有的long变成string
         * 因为js中得数字类型不能包含所有的java long值
         */
        SimpleModule simpleModule = new SimpleModule();
        simpleModule.addSerializer(Long.class, ToStringSerializer.instance);
        simpleModule.addSerializer(Long.TYPE, ToStringSerializer.instance);
        objectMapper.registerModule(simpleModule);

        return objectMapper;
    }

    public ExtendJacksonJsonProvider() {
        this(null, BASIC_ANNOTATIONS);
    }

    public ExtendJacksonJsonProvider(Annotations... annotationsToUse) {
        this(null, annotationsToUse);
    }

    public ExtendJacksonJsonProvider(ObjectMapper mapper, Annotations[] annotationsToUse) {
        super(mapper==null?objectMapper():mapper, annotationsToUse);
    }
}
