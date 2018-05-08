package com.code.community.pojo;

import java.util.Date;

public class Charge {
    private Long id;

    private Long roomId;

    private Integer type;

    private Double amount;

    private Date chargeTime;

    private Date expireTime;

    private Long operatorId;

    private Integer payStyle;

    private Integer status;

    private Date createTime;

    private Date updateTime;

    private Boolean isDelete;

    public Charge(Long id, Long roomId, Integer type, Double amount, Date chargeTime, Date expireTime, Long operatorId, Integer payStyle, Integer status, Date createTime, Date updateTime, Boolean isDelete) {
        this.id = id;
        this.roomId = roomId;
        this.type = type;
        this.amount = amount;
        this.chargeTime = chargeTime;
        this.expireTime = expireTime;
        this.operatorId = operatorId;
        this.payStyle = payStyle;
        this.status = status;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
    }

    public Charge() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getChargeTime() {
        return chargeTime;
    }

    public void setChargeTime(Date chargeTime) {
        this.chargeTime = chargeTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Integer getPayStyle() {
        return payStyle;
    }

    public void setPayStyle(Integer payStyle) {
        this.payStyle = payStyle;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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