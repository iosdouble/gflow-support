package com.gome.arch.flow.feign;

import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import feign.hystrix.FallbackFactory;

import java.util.List;

/**
 * @Classname BaseProcessFeignClientFallbackFactory
 * @Description TODO
 * @Date 2020/6/19 4:33 PM
 * @Created by nihui
 */
public class BaseProcessFeignClientFallbackFactory implements FallbackFactory<BaseProcessFeignClient> {
    @Override
    public BaseProcessFeignClient create(Throwable throwable) {
        BaseProcessFeignClient baseProcessFeignClient = new BaseProcessFeignClient() {
            @Override
            public ResponseEntity<List<ProcessPO>> getProcessMethod(String tag) {
                return null;
            }
        };
        return baseProcessFeignClient;
    }
}
