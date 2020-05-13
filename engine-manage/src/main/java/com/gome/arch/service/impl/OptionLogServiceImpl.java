package com.gome.arch.service.impl;

import com.gome.arch.dao.bean.OptionLog;
import com.gome.arch.dao.mapper.OptionLogMapper;
import com.gome.arch.dpo.LogPO;
import com.gome.arch.service.OptionLogService;
import com.gome.arch.uuid.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Classname OptionLogServiceImpl
 * @Description TODO
 * @Date 2020/5/12 11:19 AM
 * @Created by nihui
 */
@Service
public class OptionLogServiceImpl implements OptionLogService {

    @Autowired
    private OptionLogMapper optionLogMapper;

    @Autowired
    private IdWorker idWorker;
    @Override
    public int addOptionLog(LogPO logTO) {
        OptionLog optionLog = new OptionLog();
        optionLog.setId(idWorker.nextId());
        optionLog.setLastUpdatetiem(new Date());
        optionLog.setLogCreateTime(logTO.getCreateTime());
        optionLog.setLogLevel(logTO.getOptionLevel());
        optionLog.setLogText(logTO.getOptionContent());
        optionLogMapper.insert(optionLog);
        return 0;
    }
}
