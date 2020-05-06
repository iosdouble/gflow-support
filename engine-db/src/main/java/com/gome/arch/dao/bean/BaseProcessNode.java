package com.gome.arch.dao.bean;

public class BaseProcessNode {
    private Long id;

    private Long processId;

    private Long nodeId;

    private Integer nodeOrder;

    public BaseProcessNode(Long id, Long processId, Long nodeId, Integer nodeOrder) {
        this.id = id;
        this.processId = processId;
        this.nodeId = nodeId;
        this.nodeOrder = nodeOrder;
    }

    public BaseProcessNode() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getProcessId() {
        return processId;
    }

    public void setProcessId(Long processId) {
        this.processId = processId;
    }

    public Long getNodeId() {
        return nodeId;
    }

    public void setNodeId(Long nodeId) {
        this.nodeId = nodeId;
    }

    public Integer getNodeOrder() {
        return nodeOrder;
    }

    public void setNodeOrder(Integer nodeOrder) {
        this.nodeOrder = nodeOrder;
    }
}