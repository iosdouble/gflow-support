package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.ProcessPO;
import com.gome.arch.dao.mapper.BaseProcessNodeMapper;
import com.gome.arch.service.BaseProcessNodeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname BaseProcessNodeServiceImpl
 * @Description TODO
 * @Date 2020/5/6 2:33 PM
 * @Created by nihui
 */
@Service
public class BaseProcessNodeServiceImpl implements BaseProcessNodeService {

    @Autowired
    private BaseProcessNodeMapper baseProcessNodeMapper;

    @Override
    public List<ProcessPO> getProcessById(Long processId) {
        return baseProcessNodeMapper.getProcessById(processId);
    }
}
