package com.gome.arch.dao.bean;

import java.util.Date;

public class BaseApplyOrder {
    private Long id;

    private Long applyOrderDetailId;

    private Date createTime;

    private String applyUserName;

    private String systemType;

    private Integer dealState;

    public BaseApplyOrder(Long id, Long applyOrderDetailId, Date createTime, String applyUserName, String systemType, Integer dealState) {
        this.id = id;
        this.applyOrderDetailId = applyOrderDetailId;
        this.createTime = createTime;
        this.applyUserName = applyUserName;
        this.systemType = systemType;
        this.dealState = dealState;
    }

    public BaseApplyOrder() {
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }

    public Integer getDealState() {
        return dealState;
    }

    public void setDealState(Integer dealState) {
        this.dealState = dealState;
    }
}