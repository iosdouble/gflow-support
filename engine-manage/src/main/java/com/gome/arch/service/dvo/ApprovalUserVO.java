package com.gome.arch.service.dvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * @Classname ApprovalUserVo
 * @Description TODO 审批人视图对象
 * @Date 2020/5/6 4:03 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalUserVO {

    //处理顺序，默认传入
    private Integer approvalOrder;
    private Long nodeId;
    //审批人ID
    private Long approvalUserId;

    //审批人域账户
    private String approvalUserDomainAccount;
}
