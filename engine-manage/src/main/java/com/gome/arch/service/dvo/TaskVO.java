package com.gome.arch.service.dvo;

import com.gome.arch.service.dvo.base.BaseVO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname TaskVO
 * @Description TODO 提交任务视图对象
 * @Date 2020/5/6 4:02 PM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskVO extends BaseVO {
    private String applyDetail;
}
