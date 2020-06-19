package com.gome.arch.resource;

import com.gome.arch.core.engine.v1.ProcessEngine;
import com.gome.arch.dpo.ProcessPO;
import com.gome.arch.flow.feign.BaseProcessFeignClient;
import com.gome.arch.service.dvo.response.ResponseEntity;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import javax.ws.rs.Path;
import java.util.List;

/**
 * @Classname BaseProcessResource
 * @Description TODO
 * @Date 2020/6/19 4:33 PM
 * @Created by nihui
 */
@Api(value = "基础流程")
@Component
@Path("/v1/baseprocess")
@Slf4j
public class BaseProcessResource implements BaseProcessFeignClient {

    @Autowired
    private ProcessEngine processEngine;

    @Override
    public ResponseEntity<List<ProcessPO>> getProcessMethod(String tag){
        log.info("===== "+tag);
        ResponseEntity responseEntity = new ResponseEntity();
        responseEntity.setCode(200);
        responseEntity.setMsg("numal");
        List<ProcessPO> process = processEngine.createProcess();
        responseEntity.setData(process);
        return responseEntity;
    }
}
