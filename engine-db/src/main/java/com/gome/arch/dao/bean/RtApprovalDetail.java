package com.gome.arch.dao.bean;

import java.util.Date;

public class RtApprovalDetail {
    private Long id;

    private Long currentNodeDealId;

    private Integer currentProcessId;

    private Long applyOrderId;

    private Long approvalPersonId;

    private Date createTime;

    private Date lastUpdateTime;

    private String approvalPersonNote;

    public RtApprovalDetail(Long id, Long currentNodeDealId, Integer currentProcessId, Long applyOrderId, Long approvalPersonId, Date createTime, Date lastUpdateTime, String approvalPersonNote) {
        this.id = id;
        this.currentNodeDealId = currentNodeDealId;
        this.currentProcessId = currentProcessId;
        this.applyOrderId = applyOrderId;
        this.approvalPersonId = approvalPersonId;
        this.createTime = createTime;
        this.lastUpdateTime = lastUpdateTime;
        this.approvalPersonNote = approvalPersonNote;
    }

    public RtApprovalDetail() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCurrentNodeDealId() {
        return currentNodeDealId;
    }

    public void setCurrentNodeDealId(Long currentNodeDealId) {
        this.currentNodeDealId = currentNodeDealId;
    }

    public Integer getCurrentProcessId() {
        return currentProcessId;
    }

    public void setCurrentProcessId(Integer currentProcessId) {
        this.currentProcessId = currentProcessId;
    }

    public Long getApplyOrderId() {
        return applyOrderId;
    }

    public void setApplyOrderId(Long applyOrderId) {
        this.applyOrderId = applyOrderId;
    }

    public Long getApprovalPersonId() {
        return approvalPersonId;
    }

    public void setApprovalPersonId(Long approvalPersonId) {
        this.approvalPersonId = approvalPersonId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getApprovalPersonNote() {
        return approvalPersonNote;
    }

    public void setApprovalPersonNote(String approvalPersonNote) {
        this.approvalPersonNote = approvalPersonNote == null ? null : approvalPersonNote.trim();
    }
}