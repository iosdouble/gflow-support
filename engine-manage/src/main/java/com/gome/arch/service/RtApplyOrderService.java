package com.gome.arch.service;

import com.gome.arch.dpo.ApprovalOrderPO;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.dto.TaskTO;

import java.util.List;

/**
 * @Classname RtApplyOrderService
 * @Description TODO
 * @Date 2020/5/7 3:01 PM
 * @Created by nihui
 */
public interface RtApplyOrderService {

    public int insertNewApplyOrder(TaskTO taskTO);

    public List<ApprovalOrderPO> getApprovalListByUserId(Long userid);

    public List<ApprovalOrderPOExt> getApprovalDetailListByUserId(Long userid);
}
