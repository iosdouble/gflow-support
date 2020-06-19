package com.gome.arch.dao.bean;

import java.util.Date;

public class HiApprovalUserFlow {
    private Long id;

    private Long applyOrderDetailId;

    private String submitterId;

    private Integer processId;

    private Long nodeId;

    private String approvalUserName;

    private Integer nodeOrder;

    private String applyUserDomainDccount;

    private String applyUserEmail;

    private Integer approvalState;

    private Date lastUpdateTime;

    public HiApprovalUserFlow(Long id, Long applyOrderDetailId, String submitterId, Integer processId, Long nodeId, String approvalUserName, Integer nodeOrder, String applyUserDomainDccount, String applyUserEmail, Integer approvalState, Date lastUpdateTime) {
        this.id = id;
        this.applyOrderDetailId = applyOrderDetailId;
        this.submitterId = submitterId;
        this.processId = processId;
        this.nodeId = nodeId;
        this.approvalUserName = approvalUserName;
        this.nodeOrder = nodeOrder;
        this.applyUserDomainDccount = applyUserDomainDccount;
        this.applyUserEmail = applyUserEmail;
        this.approvalState = approvalState;
        this.lastUpdateTime = lastUpdateTime;
    }

    public HiApprovalUserFlow() {
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

    public String getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(String submitterId) {
        this.submitterId = submitterId;
    }

    public Integer getProcessId() {
        return processId;
    }

    public void setProcessId(Integer processId) {
        this.processId = processId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public String getApprovalUserName() {
        return approvalUserName;
    }

    public void setApprovalUserName(String approvalUserName) {
        this.approvalUserName = approvalUserName == null ? null : approvalUserName.trim();
    }

    public Integer getNodeOrder() {
        return nodeOrder;
    }

    public void setNodeOrder(Integer nodeOrder) {
        this.nodeOrder = nodeOrder;
    }

    public String getApplyUserDomainDccount() {
        return applyUserDomainDccount;
    }

    public void setApplyUserDomainDccount(String applyUserDomainDccount) {
        this.applyUserDomainDccount = applyUserDomainDccount == null ? null : applyUserDomainDccount.trim();
    }

    public String getApplyUserEmail() {
        return applyUserEmail;
    }

    public void setApplyUserEmail(String applyUserEmail) {
        this.applyUserEmail = applyUserEmail == null ? null : applyUserEmail.trim();
    }

    public Integer getApprovalState() {
        return approvalState;
    }

    public void setApprovalState(Integer approvalState) {
        this.approvalState = approvalState;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }
}