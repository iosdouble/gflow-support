package com.gome.arch.core.engine;

import com.gome.arch.dao.bean.ProcessPO;

import java.util.List;

/**
 * @Classname ProcessEngine
 * @Description TODO
 * @Date 2020/4/23 11:07 AM
 * @Created by nihui
 */
public interface ProcessEngine {
    public List<ProcessPO> createProcess(Long processId);
}
