package com.gome.arch.service;

import com.gome.arch.dao.bean.BaseProcess;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname BaseProcessService
 * @Description TODO
 * @Date 2020/5/6 2:01 PM
 * @Created by nihui
 */

public interface BaseProcessService {
    public List<BaseProcess> getAllProcess();
}
