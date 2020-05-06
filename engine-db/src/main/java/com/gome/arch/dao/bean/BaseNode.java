package com.gome.arch.dao.bean;

public class BaseNode {
    private Integer id;

    private Integer nodeId;

    private String nodeName;

    private String nodeDesc;

    public BaseNode(Integer id, Integer nodeId, String nodeName, String nodeDesc) {
        this.id = id;
        this.nodeId = nodeId;
        this.nodeName = nodeName;
        this.nodeDesc = nodeDesc;
    }

    public BaseNode() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getNodeId() {
        return nodeId;
    }

    public void setNodeId(Integer nodeId) {
        this.nodeId = nodeId;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName == null ? null : nodeName.trim();
    }

    public String getNodeDesc() {
        return nodeDesc;
    }

    public void setNodeDesc(String nodeDesc) {
        this.nodeDesc = nodeDesc == null ? null : nodeDesc.trim();
    }
}