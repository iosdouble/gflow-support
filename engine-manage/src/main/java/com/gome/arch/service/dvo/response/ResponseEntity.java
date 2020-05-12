package com.gome.arch.service.dvo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname ResponseBody
 * @Description TODO
 * @Date 2020/5/12 10:55 AM
 * @Created by nihui
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseEntity<T> {
    private Integer code;
    private String msg;
    private T data;
}
