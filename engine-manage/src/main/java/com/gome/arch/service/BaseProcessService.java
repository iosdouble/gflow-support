package com.gome.arch.service;

import com.gome.arch.dao.bean.BaseProcess;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname BaseProcessService
 * @Description TODO 基础流程
 * @Date 2020/5/6 2:01 PM
 * @Created by nihui
 */

public interface BaseProcessService {
    public List<BaseProcess> getAllProcess();

    public String updateProcessUseAble(Long currentProcessId,Long useAbleProcessId);
}
