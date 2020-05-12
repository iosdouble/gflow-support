package com.gome.arch.dao.bean;

import java.util.Date;

public class OptionLog {
    private Long id;

    private String logLevel;

    private Date logCreateTime;

    private Date lastUpdatetiem;

    private String logText;

    public OptionLog(Long id, String logLevel, Date logCreateTime, Date lastUpdatetiem, String logText) {
        this.id = id;
        this.logLevel = logLevel;
        this.logCreateTime = logCreateTime;
        this.lastUpdatetiem = lastUpdatetiem;
        this.logText = logText;
    }

    public OptionLog() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogLevel() {
        return logLevel;
    }

    public void setLogLevel(String logLevel) {
        this.logLevel = logLevel == null ? null : logLevel.trim();
    }

    public Date getLogCreateTime() {
        return logCreateTime;
    }

    public void setLogCreateTime(Date logCreateTime) {
        this.logCreateTime = logCreateTime;
    }

    public Date getLastUpdatetiem() {
        return lastUpdatetiem;
    }

    public void setLastUpdatetiem(Date lastUpdatetiem) {
        this.lastUpdatetiem = lastUpdatetiem;
    }

    public String getLogText() {
        return logText;
    }

    public void setLogText(String logText) {
        this.logText = logText == null ? null : logText.trim();
    }
}