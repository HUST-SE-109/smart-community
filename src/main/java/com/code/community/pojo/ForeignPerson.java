package com.code.community.pojo;

import java.util.Date;

public class ForeignPerson {
    private Long id;

    private String name;

    private Byte gender;

    private String card;

    private Integer age;

    private Date comeTime;

    private String reason;

    private Date updateTime;

    private Long operatorId;

    private Byte isDelete;

    public ForeignPerson(Long id, String name, Byte gender, String card, Integer age, Date comeTime, String reason, Date updateTime, Long operatorId, Byte isDelete) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.card = card;
        this.age = age;
        this.comeTime = comeTime;
        this.reason = reason;
        this.updateTime = updateTime;
        this.operatorId = operatorId;
        this.isDelete = isDelete;
    }

    public ForeignPerson() {
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

    public Byte getGender() {
        return gender;
    }

    public void setGender(Byte gender) {
        this.gender = gender;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getComeTime() {
        return comeTime;
    }

    public void setComeTime(Date comeTime) {
        this.comeTime = comeTime;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }
}