package com.gome.arch.core.engine.runtime;

import com.github.pagehelper.PageInfo;
import com.gome.arch.dpo.ApprovalOrderPOExt;

/**
 * @Classname RuntimeService
 * @Description TODO 运行时服务，表示流程执行的过程，相对于流程来讲
 * @Date 2020/4/23 10:47 AM
 * @Created by nihui
 */
public interface RuntimeService {
    PageInfo<ApprovalOrderPOExt> pageOrderApplies(Long userid,int offset, int limit);
}
