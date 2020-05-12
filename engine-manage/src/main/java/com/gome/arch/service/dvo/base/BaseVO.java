package com.gome.arch.service.dvo.base;

import com.gome.arch.annotation.NullAndRegexValid;
import com.gome.arch.service.dvo.ApprovalUserVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Classname BaseVo
 * @Description TODO 基本上视图对象
 * @Date 2020/5/6 4:06 PM
 * @Created by nihui
 */
@Data
public  class BaseVO {
    //用户ID
    @NullAndRegexValid(paramName="申请用户Code",notNull=true,regex="[0-9]+")
    private Long applyUserCode;

    private String applyDetail;


}
