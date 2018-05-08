package com.code.community.pojo;

import java.util.Date;

public class FacilityMaintain {
    private Long id;

    private Long facilityId;

    private String operator;

    private String phone;

    private Date maintainTime;

    private Double amount;

    private Long maintainAdmin;

    private String detailInfo;

    private Date createTime;

    private Date updateTime;

    private Byte isDelete;

    public FacilityMaintain(Long id, Long facilityId, String operator, String phone, Date maintainTime, Double amount, Long maintainAdmin, String detailInfo, Date createTime, Date updateTime, Byte isDelete) {
        this.id = id;
        this.facilityId = facilityId;
        this.operator = operator;
        this.phone = phone;
        this.maintainTime = maintainTime;
        this.amount = amount;
        this.maintainAdmin = maintainAdmin;
        this.detailInfo = detailInfo;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
    }

    public FacilityMaintain() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFacilityId() {
        return facilityId;
    }

    public void setFacilityId(Long facilityId) {
        this.facilityId = facilityId;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public Date getMaintainTime() {
        return maintainTime;
    }

    public void setMaintainTime(Date maintainTime) {
        this.maintainTime = maintainTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getMaintainAdmin() {
        return maintainAdmin;
    }

    public void setMaintainAdmin(Long maintainAdmin) {
        this.maintainAdmin = maintainAdmin;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo == null ? null : detailInfo.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}