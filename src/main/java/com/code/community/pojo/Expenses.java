package com.code.community.pojo;

import java.util.Date;

public class Expenses {
    private Long id;

    private String reason;

    private Double amount;

    private Long operatorId;

    private Integer payStyle;

    private Date payTime;

    private Date updateTime;

    private Byte isDelete;

    public Expenses(Long id, String reason, Double amount, Long operatorId, Integer payStyle, Date payTime, Date updateTime, Byte isDelete) {
        this.id = id;
        this.reason = reason;
        this.amount = amount;
        this.operatorId = operatorId;
        this.payStyle = payStyle;
        this.payTime = payTime;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
    }

    public Expenses() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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