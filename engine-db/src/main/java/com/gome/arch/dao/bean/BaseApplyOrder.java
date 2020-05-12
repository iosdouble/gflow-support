package com.gome.arch.dao.bean;

import java.util.Date;

public class BaseApplyOrder {
    private Long id;

    private Long applyOrderDetailId;

    private Date createTime;

    private Long applyUserCode;

    private String systemType;

    public BaseApplyOrder(Long id, Long applyOrderDetailId, Date createTime, Long applyUserCode, String systemType) {
        this.id = id;
        this.applyOrderDetailId = applyOrderDetailId;
        this.createTime = createTime;
        this.applyUserCode = applyUserCode;
        this.systemType = systemType;
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

    public Long getApplyUserCode() {
        return applyUserCode;
    }

    public void setApplyUserCode(Long applyUserCode) {
        this.applyUserCode = applyUserCode;
    }

    public String getSystemType() {
        return systemType;
    }

    public void setSystemType(String systemType) {
        this.systemType = systemType == null ? null : systemType.trim();
    }
}