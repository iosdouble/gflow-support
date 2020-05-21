package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.BaseProcess;
import com.gome.arch.dao.bean.BaseProcessExample;
import com.gome.arch.dao.mapper.BaseProcessMapper;
import com.gome.arch.service.BaseProcessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Classname BaseProcessServiceImpl
 * @Description TODO
 * @Date 2020/5/6 2:01 PM
 * @Created by nihui
 */
@Transactional(rollbackFor = RuntimeException.class)
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

    @Override
    public String updateProcessUseAble(Long useAbleProcessId) {
        changeUseable(useAbleProcessId);
        return "OK";
    }

    @Override
    public Integer checkAvailableProcess() {
        return baseProcessMapper.getAvailableProcess();
    }

    @Override
    public String updateProcessUnuseAble(Long currentProcessId) {
        changeUnuseable(currentProcessId);
        return "OK";
    }

    private void changeUnuseable(Long currentProcess) {
        BaseProcess baseProcess = new BaseProcess();
        BaseProcessExample baseProcessExample = new BaseProcessExample();
        BaseProcessExample.Criteria criteria = baseProcessExample.createCriteria();
        criteria.andProcessIdEqualTo(currentProcess);
        baseProcess.setProcessIsuseable(0);
        baseProcessMapper.updateByExampleSelective(baseProcess,baseProcessExample);
    }
    private void changeUseable(Long userAbleProcess) {
        BaseProcess baseProcess = new BaseProcess();
        BaseProcessExample baseProcessExample = new BaseProcessExample();
        BaseProcessExample.Criteria criteria = baseProcessExample.createCriteria();
        criteria.andProcessIdEqualTo(userAbleProcess);
        baseProcess.setProcessIsuseable(1);
        baseProcessMapper.updateByExampleSelective(baseProcess,baseProcessExample);
    }


}
