package com.gome.arch.dpo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ApprovalOrderPO
 * @Description TODO
 * @Date 2020/5/11 10:35 AM
 * @Created by nihui
 */
@Deprecated
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApprovalOrderPO {

    private String applyOrderDetailId;
    private String submitterId;
    private Integer processId;
    private Integer currentNodeId;
    private Integer nextNodeId;
    private Integer processFinishStatus;
    private Integer processNodeTotalnumber;
}
