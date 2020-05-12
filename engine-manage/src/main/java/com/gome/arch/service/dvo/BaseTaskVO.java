package com.gome.arch.service.dvo;

import com.gome.arch.service.dvo.base.BaseVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname BaseTaskVO
 * @Description TODO
 * @Date 2020/5/12 11:25 AM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseTaskVO extends BaseVO {
    private String systemType;

}
