package com.gome.arch.dpo;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;
}
