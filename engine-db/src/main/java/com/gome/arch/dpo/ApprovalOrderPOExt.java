package com.gome.arch.dpo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ApprovalOrderPOExt
 * @Description TODO
 * @Date 2020/5/11 10:50 AM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalOrderPOExt extends ApprovalOrderPO {
    private String applyOrderDetail;
}
