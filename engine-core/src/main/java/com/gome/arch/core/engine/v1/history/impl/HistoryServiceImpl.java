package com.gome.arch.core.engine.v1.history.impl;

import com.gome.arch.core.engine.v1.history.HistoryService;
import com.gome.arch.dao.bean.HiApprovalUserFlow;
import com.gome.arch.service.HiApprovalUserFlowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname HistoryServiceImpl
 * @Description TODO 历史数据封装
 * @Date 2020/4/23 1:45 PM
 * @Created by nihui
 */
@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private HiApprovalUserFlowService hiApprovalUserFlowService;
    @Override
    public List<HiApprovalUserFlow> getApprovalFlow(Long applyId) {

        List<HiApprovalUserFlow> approvalFlowHistory = hiApprovalUserFlowService.getApprovalFlowHistory(applyId);

        return approvalFlowHistory;
    }
}
