package com.gome.arch.service.dvo;

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
public class ApprovalDealVO {

    private Integer processId;
    private Long applyOrderId;
    private Long currentNode;
    //审批意见
    private String opinion;
    //审批处理状态
    private Integer status;
}
