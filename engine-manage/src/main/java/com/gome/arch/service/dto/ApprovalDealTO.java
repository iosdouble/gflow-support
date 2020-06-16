package com.gome.arch.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ApprovalDealVO
 * @Description TODO 审批操作视图对象
 * @Date 2020/5/11 2:26 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalDealTO {

    private Integer processId;
    private String dealUserName;
    private Long applyOrderId;
    private Long currentNode;
    private Long nextNode;
    //审批意见
    private String opinion;
    //审批处理状态
    private Integer status;
}
