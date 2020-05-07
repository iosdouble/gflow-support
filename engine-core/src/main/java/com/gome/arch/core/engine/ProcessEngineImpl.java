package com.gome.arch.core.engine;

import com.gome.arch.dao.bean.BaseProcessNode;
import com.gome.arch.dao.bean.ProcessPO;
import com.gome.arch.service.BaseProcessNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname ProcessEngineImpl
 * @Description TODO
 * @Date 2020/5/7 2:40 PM
 * @Created by nihui
 */
@Service
public class ProcessEngineImpl implements ProcessEngine {

    @Autowired
    private BaseProcessNodeService baseProcessNodeService;

    @Override
    public List<ProcessPO> createProcess(Long processId) {
        return baseProcessNodeService.getProcessById(processId);
    }
}
