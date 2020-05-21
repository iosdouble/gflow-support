package com.gome.arch.core.engine.v1;

import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.service.BaseProcessNodeService;
import com.gome.arch.service.BaseProcessService;
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


    @Autowired
    private BaseProcessService  baseProcessService;

    @Override
    public List<ProcessPO> createProcess(Long processId) {
        return baseProcessNodeService.getProcessById(processId);
    }

    @Override
    public List<ProcessPO> createProcess() {
        return baseProcessNodeService.getProcess();
    }

    @Override
    public Integer changProcessIsUseAble(Long processId,Boolean isUseaable) {
        Integer useNumber = baseProcessService.checkAvailableProcess();

        if (isUseaable==true){
            if (useNumber==1){
                return 1;
            }else {
                baseProcessService.updateProcessUseAble(processId);
            }
        }else if (isUseaable==false){
            baseProcessService.updateProcessUnuseAble(processId);
        }
        return 0;
    }


}
