package com.gome.arch.service;

import com.gome.arch.dao.bean.HiApprovalUserFlow;
import com.gome.arch.service.dto.TaskTO;

import java.util.List;

/**
 * @Classname HiApprovalUserFlowService
 * @Description TODO
 * @Date 2020/5/20 11:27 AM
 * @Created by nihui
 */
public interface HiApprovalUserFlowService {


    public int addApprovalFlowRelation(TaskTO taskTO);


    public List<HiApprovalUserFlow> getApprovalFlowHistory(Long  applyId);
}
