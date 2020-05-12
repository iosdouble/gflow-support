package com.gome.arch.dao.bean;

public class RtApprovalUser {
    private Long id;

    private Long applyOrderDetailId;

    private Long submitterId;

    private Integer processId;

    private Long nodeId;

    private Long approvalUserId;

    private Integer nodeOrder;

    public RtApprovalUser(Long id, Long applyOrderDetailId, Long submitterId, Integer processId, Long nodeId, Long approvalUserId, Integer nodeOrder) {
        this.id = id;
        this.applyOrderDetailId = applyOrderDetailId;
        this.submitterId = submitterId;
        this.processId = processId;
        this.nodeId = nodeId;
        this.approvalUserId = approvalUserId;
        this.nodeOrder = nodeOrder;
    }

    public RtApprovalUser() {
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

    public Long getSubmitterId() {
        return submitterId;
    }

    public void setSubmitterId(Long submitterId) {
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

    public Long getApprovalUserId() {
        return approvalUserId;
    }

    public void setApprovalUserId(Long approvalUserId) {
        this.approvalUserId = approvalUserId;
    }

    public Integer getNodeOrder() {
        return nodeOrder;
    }

    public void setNodeOrder(Integer nodeOrder) {
        this.nodeOrder = nodeOrder;
    }
}