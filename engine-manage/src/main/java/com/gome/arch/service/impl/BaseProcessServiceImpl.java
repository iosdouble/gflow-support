package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.BaseProcess;
import com.gome.arch.dao.bean.BaseProcessExample;
import com.gome.arch.dao.mapper.BaseProcessMapper;
import com.gome.arch.service.BaseProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Classname BaseProcessServiceImpl
 * @Description TODO
 * @Date 2020/5/6 2:01 PM
 * @Created by nihui
 */
@Service
public class BaseProcessServiceImpl implements BaseProcessService {

    @Autowired
    private BaseProcessMapper baseProcessMapper;

    @Override
    public List<BaseProcess> getAllProcess() {
        BaseProcessExample baseProcessExample =  new BaseProcessExample();
        BaseProcessExample.Criteria criteria = baseProcessExample.createCriteria();
        criteria.andIdIsNotNull();
        List<BaseProcess> baseProcesses = baseProcessMapper.selectByExample(baseProcessExample);
        return baseProcesses;
    }
}
