package com.gome.arch.dao.bean;

public class BaseProcess {
    private Integer id;

    private Long processId;

    private String processName;

    private String processContent;

    private String processType;

    private Integer processIsuseable;

    private Integer processNodeTotalnumber;

    public BaseProcess(Integer id, Long processId, String processName, String processContent, String processType, Integer processIsuseable, Integer processNodeTotalnumber) {
        this.id = id;
        this.processId = processId;
        this.processName = processName;
        this.processContent = processContent;
        this.processType = processType;
        this.processIsuseable = processIsuseable;
        this.processNodeTotalnumber = processNodeTotalnumber;
    }

    public BaseProcess() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName == null ? null : processName.trim();
    }

    public String getProcessContent() {
        return processContent;
    }

    public void setProcessContent(String processContent) {
        this.processContent = processContent == null ? null : processContent.trim();
    }

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String processType) {
        this.processType = processType == null ? null : processType.trim();
    }

    public Integer getProcessIsuseable() {
        return processIsuseable;
    }

    public void setProcessIsuseable(Integer processIsuseable) {
        this.processIsuseable = processIsuseable;
    }

    public Integer getProcessNodeTotalnumber() {
        return processNodeTotalnumber;
    }

    public void setProcessNodeTotalnumber(Integer processNodeTotalnumber) {
        this.processNodeTotalnumber = processNodeTotalnumber;
    }
}