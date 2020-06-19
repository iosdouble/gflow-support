package com.gome.arch.flow.feign;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.dto.BaseApplyOrderTO;
import com.gome.arch.service.dvo.BaseTaskVO;
import com.gome.arch.service.dvo.TaskVO;
import com.gome.arch.service.dvo.response.ResponseEntity;
import feign.hystrix.FallbackFactory;

import javax.validation.Valid;
import java.util.List;

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
            public ResponseEntity<String> addTask(BaseTaskVO baseTaskVO) {
                return null;
            }

            @Override
            public ResponseEntity<String> startTask(@Valid TaskVO taskVO) {
                return null;
            }


            @Override
            public ResponseEntity<String> endTask(Long applyId) {
                return null;
            }

            @Override
            public ResponseEntity<PageInfo<BaseApplyOrderTO>> getTaskList(String username,Integer offset, Integer limit) {
                return null;
            }

            @Override
            public ResponseEntity<List<ProcessPO>> getProcessMethod(String tag) {
                return null;
            }
        };
        return taskFeignClient;
    }
}
