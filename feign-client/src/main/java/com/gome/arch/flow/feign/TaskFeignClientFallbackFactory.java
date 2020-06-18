package com.gome.arch.flow.feign;

import com.github.pagehelper.PageInfo;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import feign.hystrix.FallbackFactory;

/**
 * @Classname TaskFeignClientFallbackFactory
 * @Description TODO
 * @Date 2020/6/18 3:56 PM
 * @Created by nihui
 */
public class TaskFeignClientFallbackFactory implements FallbackFactory<TaskFeignClient> {
    @Override
    public TaskFeignClient create(Throwable throwable) {
        TaskFeignClient taskFeignClient = new TaskFeignClient() {
            @Override
            public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(Integer page, Integer limit) {
                return null;
            }

        };
        return taskFeignClient;
    }
}
