package com.gome.arch.flow.feign;

import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import feign.hystrix.FallbackFactory;

import java.util.List;

/**
 * @Classname TaskFeignClientFallbackFactory
 * @Description TODO
 * @Date 2020/6/18 3:56 PM
 * @Created by nihui
 */
public class ProcessFeignClientFallbackFactory implements FallbackFactory<ProcessFeignClient> {
    @Override
    public ProcessFeignClient create(Throwable throwable) {
        ProcessFeignClient processFeignClient = new ProcessFeignClient() {

            @Override
            public ResponseEntity<List<ProcessPO>> getProcessMethod(String tag) {
                return null;
            }
        };
        return processFeignClient;
    }
}
