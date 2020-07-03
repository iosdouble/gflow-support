package com.gome.arch.dao.bean;

public class RtApprovalUser {
    private Long id;

    private Long applyOrderDetailId;

    private String submitterId;

    private Integer processId;

    private Long nodeId;

    private String approvalUserName;

    private Integer nodeOrder;

    public RtApprovalUser(Long id, Long applyOrderDetailId, String submitterId, Integer processId, Long nodeId, String approvalUserName, Integer nodeOrder) {
        this.id = id;
        this.applyOrderDetailId = applyOrderDetailId;
        this.submitterId = submitterId;
        this.processId = processId;
        this.nodeId = nodeId;
        this.approvalUserName = approvalUserName;
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
}