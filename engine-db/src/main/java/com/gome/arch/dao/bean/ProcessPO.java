package com.gome.arch.dao.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Process
 * @Description TODO 获取流程传输对象
 * @Date 2020/5/6 2:28 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProcessPO {
    private Integer processId;
    private Integer nodeOrder;
    private Integer nodeId;
    private String nodeName;
}
