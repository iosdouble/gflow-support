package com.gome.arch.service.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname BaseTaskTO
 * @Description TODO
 * @Date 2020/5/12 1:56 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseTaskTO {
    private Long applyId;
    private Long applyUserCode;
    private String systemType;
    private String applyContentDetail;
}
