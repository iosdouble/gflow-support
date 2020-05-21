package com.gome.arch.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ApprovalOrderTO
 * @Description TODO
 * @Date 2020/5/11 5:23 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalOrderTO {
    private Long applyId;
    private Long currentNode;
    private Long nextNode;
}
