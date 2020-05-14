package com.gome.arch.service;


import com.gome.arch.dpo.ProcessPO;

import java.util.List;

/**
 * @Classname BaseProcessNodeService
 * @Description TODO
 * @Date 2020/5/6 2:32 PM
 * @Created by nihui
 */
public interface BaseProcessNodeService {

    public List<ProcessPO> getProcessById(Long processId);

    public List<ProcessPO> getProcess();

}
