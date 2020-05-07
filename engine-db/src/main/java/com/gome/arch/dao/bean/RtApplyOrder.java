package com.gome.arch.dao.bean;

public class RtApplyOrder {
    private Long id;

    private Long applyOrderDetailId;

    private Long currentNodeId;

    private Long nextNodeId;

    private Integer currentNodeFinishStatus;

    private Integer processFinishStatus;

    private Integer porcessId;

    private Long processNodeTotalnumber;

    public RtApplyOrder(Long id, Long applyOrderDetailId, Long currentNodeId, Long nextNodeId, Integer currentNodeFinishStatus, Integer processFinishStatus, Integer porcessId, Long processNodeTotalnumber) {
        this.id = id;
        this.applyOrderDetailId = applyOrderDetailId;
        this.currentNodeId = currentNodeId;
        this.nextNodeId = nextNodeId;
        this.currentNodeFinishStatus = currentNodeFinishStatus;
        this.processFinishStatus = processFinishStatus;
        this.porcessId = porcessId;
        this.processNodeTotalnumber = processNodeTotalnumber;
    }

    public RtApplyOrder() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getApplyOrderDetailId() {
        return applyOrderDetailId;
    }

    public void setApplyOrderDetailId(Long applyOrderDetailId) {
        this.applyOrderDetailId = applyOrderDetailId;
    }

    public Long getCurrentNodeId() {
        return currentNodeId;
    }

    public void setCurrentNodeId(Long currentNodeId) {
        this.currentNodeId = currentNodeId;
    }

    public Long getNextNodeId() {
        return nextNodeId;
    }

    public void setNextNodeId(Long nextNodeId) {
        this.nextNodeId = nextNodeId;
    }

    public Integer getCurrentNodeFinishStatus() {
        return currentNodeFinishStatus;
    }

    public void setCurrentNodeFinishStatus(Integer currentNodeFinishStatus) {
        this.currentNodeFinishStatus = currentNodeFinishStatus;
    }

    public Integer getProcessFinishStatus() {
        return processFinishStatus;
    }

    public void setProcessFinishStatus(Integer processFinishStatus) {
        this.processFinishStatus = processFinishStatus;
    }

    public Integer getPorcessId() {
        return porcessId;
    }

    public void setPorcessId(Integer porcessId) {
        this.porcessId = porcessId;
    }

    public Long getProcessNodeTotalnumber() {
        return processNodeTotalnumber;
    }

    public void setProcessNodeTotalnumber(Long processNodeTotalnumber) {
        this.processNodeTotalnumber = processNodeTotalnumber;
    }
}