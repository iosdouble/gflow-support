package com.gome.arch.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ApplyDetailTO
 * @Description TODO
 * @Date 2020/5/12 4:15 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApplyDetailTO {
    private Long applyId;
    private String applyOrderDetail;
}
