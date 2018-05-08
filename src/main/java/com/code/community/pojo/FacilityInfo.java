package com.code.community.pojo;

import java.util.Date;

public class FacilityInfo {
    private Long id;

    private String name;

    private String contractor;

    private String phone;

    private String operator;

    private Date deliveryTime;

    private Long facilityAdmin;

    private Double amount;

    private Date createTime;

    private Date updateTime;

    private Boolean isDelete;

    public FacilityInfo(Long id, String name, String contractor, String phone, String operator, Date deliveryTime, Long facilityAdmin, Double amount, Date createTime, Date updateTime, Boolean isDelete) {
        this.id = id;
        this.name = name;
        this.contractor = contractor;
        this.phone = phone;
        this.operator = operator;
        this.deliveryTime = deliveryTime;
        this.facilityAdmin = facilityAdmin;
        this.amount = amount;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
    }

    public FacilityInfo() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContractor() {
        return contractor;
    }

    public void setContractor(String contractor) {
        this.contractor = contractor == null ? null : contractor.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Long getFacilityAdmin() {
        return facilityAdmin;
    }

    public void setFacilityAdmin(Long facilityAdmin) {
        this.facilityAdmin = facilityAdmin;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }
}