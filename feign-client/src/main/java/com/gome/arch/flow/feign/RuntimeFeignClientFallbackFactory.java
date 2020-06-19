package com.gome.arch.flow.feign;

import com.gome.arch.dao.bean.RtApplyOrderDetail;
import com.gome.arch.dao.bean.RtApprovalDetail;
import com.gome.arch.service.dvo.ApprovalDealVO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import feign.hystrix.FallbackFactory;

import java.util.List;

/**
 * @Classname RuntimeFeignClientFallbackFactory
 * @Description TODO
 * @Date 2020/6/19 11:01 AM
 * @Created by nihui
 */
public class RuntimeFeignClientFallbackFactory implements FallbackFactory<RuntimeFeignClient> {
    @Override
    public RuntimeFeignClient create(Throwable throwable) {

        RuntimeFeignClient runtimeFeignClient = new RuntimeFeignClient() {

            @Override
            public ResponseEntity getOrder(String userName, Integer offset, Integer limit) {
                return null;
            }

            @Override
            public ResponseEntity<String> approvalTask(String dealName, ApprovalDealVO approvalDealVO) {
                return null;
            }

            @Override
            public ResponseEntity<List<RtApprovalDetail>> getApprovalDetail(Long applyId) {
                return null;
            }

            @Override
            public ResponseEntity<RtApplyOrderDetail> getApplyOrderDetail(Long applyId) {
                return null;
            }

            @Override
            public ResponseEntity<String> endApprovalProcess(Long applyId) {
                return null;
            }
        };
        return runtimeFeignClient;
    }
}
