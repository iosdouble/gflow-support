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
public class BaseVO {
    //流程ID
    private Integer processId;
    //工单号
    private Long applyId;

}
