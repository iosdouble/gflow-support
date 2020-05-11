package com.gome.arch.core.engine.runtime.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gome.arch.core.engine.runtime.RuntimeService;
import com.gome.arch.dpo.ApprovalOrderPO;
import com.gome.arch.dpo.ApprovalOrderPOExt;
import com.gome.arch.service.RtApplyOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname RuntimeServiceImpl
 * @Description TODO 关于运行时操作封装
 * @Date 2020/4/23 1:46 PM
 * @Created by nihui
 */
@Service
public class RuntimeServiceImpl implements RuntimeService {
    @Autowired
    private RtApplyOrderService applyOrderService;
    @Override
    public PageInfo<ApprovalOrderPOExt> pageOrderApplies(Long userid, int offset, int limit) {
        PageHelper.offsetPage(offset, limit);
        List<ApprovalOrderPOExt> listByUserId = applyOrderService.getApprovalDetailListByUserId(userid);
        PageInfo<ApprovalOrderPOExt> pageInfo = new PageInfo<ApprovalOrderPOExt>(listByUserId);
        return pageInfo;
    }
}
