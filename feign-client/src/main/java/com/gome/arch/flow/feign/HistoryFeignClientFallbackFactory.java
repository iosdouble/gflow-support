package com.gome.arch.flow.feign;

import com.gome.arch.service.dvo.response.ResponseEntity;
import feign.hystrix.FallbackFactory;

/**
 * @Classname HistoryFeignClientFallbackFactory
 * @Description TODO
 * @Date 2020/6/19 11:02 AM
 * @Created by nihui
 */
public class HistoryFeignClientFallbackFactory implements FallbackFactory<HistoryFeignClient> {
    @Override
    public HistoryFeignClient create(Throwable throwable) {
        HistoryFeignClient historyFeignClient = new HistoryFeignClient() {
            @Override
            public ResponseEntity getApprovalFlowHistory(Long applyId) {
                return null;
            }
        };
        return historyFeignClient;
    }
}
