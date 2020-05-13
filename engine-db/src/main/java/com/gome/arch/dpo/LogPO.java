package com.gome.arch.dpo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @Classname LogPO
 * @Description TODO
 * @Date 2020/5/13 4:54 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LogPO {
    private Date createTime;
    private String optionContent;
    private String optionLevel;
}
