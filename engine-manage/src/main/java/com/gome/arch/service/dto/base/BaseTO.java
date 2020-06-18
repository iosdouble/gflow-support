package com.gome.arch.service.dto.base;

import com.gome.arch.annotation.NullAndRegexValid;
import com.gome.arch.service.dvo.ApprovalUserVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Classname BaseTo
 * @Description TODO
 * @Date 2020/5/6 4:36 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BaseTO {
    //工单号
    private Long applyId;
    private Integer processId;
    private List<ApprovalUserVO> approvalUserVoList;
    //用户ID
    @NullAndRegexValid(paramName="申请用户Code",notNull=true,regex="[0-9]+")
    private String applyUserName;
    //申请时间
    private String applyTime;
}
