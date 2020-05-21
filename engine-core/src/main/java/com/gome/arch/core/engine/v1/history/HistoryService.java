package com.gome.arch.core.engine.v1.history;

import com.gome.arch.dao.bean.HiApprovalUserFlow;

import java.util.List;

/**
 * @Classname HistoryService
 * @Description TODO 查询历史数据服务
 * @Date 2020/4/23 10:47 AM
 * @Created by nihui
 */
public interface HistoryService {

    /***
     * 获取审批进度
     */
    public List<HiApprovalUserFlow> getApprovalFlow(Long applyId);

}
