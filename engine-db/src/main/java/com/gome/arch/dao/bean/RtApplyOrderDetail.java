package com.gome.arch.dao.bean;

public class RtApplyOrderDetail {
    private Long id;

    private Long applyOrderDetailId;

    private String applyOrderDetail;

    public RtApplyOrderDetail(Long id, Long applyOrderDetailId, String applyOrderDetail) {
        this.id = id;
        this.applyOrderDetailId = applyOrderDetailId;
        this.applyOrderDetail = applyOrderDetail;
    }

    public RtApplyOrderDetail() {
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

    public String getApplyOrderDetail() {
        return applyOrderDetail;
    }

    public void setApplyOrderDetail(String applyOrderDetail) {
        this.applyOrderDetail = applyOrderDetail == null ? null : applyOrderDetail.trim();
    }
}