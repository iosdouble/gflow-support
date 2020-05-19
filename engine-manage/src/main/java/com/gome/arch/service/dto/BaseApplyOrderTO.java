package com.gome.arch.service.dto;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname BaseApplyOrderTO
 * @Description TODO
 * @Date 2020/5/15 2:25 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseApplyOrderTO {

    private String id;

    private String applyOrderDetailId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long applyUserCode;

    private String systemType;

    private Integer dealState;
}
