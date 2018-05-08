package com.code.community.pojo;

import java.util.Date;

public class Worker {
    private Long id;

    private String account;

    private String password;

    private String name;

    private Boolean gender;

    private String nation;

    private String card;

    private Integer politicalStatus;

    private String phone;

    private String position;

    private Double wage;

    private Date beginTime;

    private Date endTime;

    private Integer status;

    private Date updateTime;

    private Boolean isDelete;

    public Worker(Long id, String account, String password, String name, Boolean gender, String nation, String card, Integer politicalStatus, String phone, String position, Double wage, Date beginTime, Date endTime, Integer status, Date updateTime, Boolean isDelete) {
        this.id = id;
        this.account = account;
        this.password = password;
        this.name = name;
        this.gender = gender;
        this.nation = nation;
        this.card = card;
        this.politicalStatus = politicalStatus;
        this.phone = phone;
        this.position = position;
        this.wage = wage;
        this.beginTime = beginTime;
        this.endTime = endTime;
        this.status = status;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
    }

    public Worker() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public Integer getPoliticalStatus() {
        return politicalStatus;
    }

    public void setPoliticalStatus(Integer politicalStatus) {
        this.politicalStatus = politicalStatus;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position == null ? null : position.trim();
    }

    public Double getWage() {
        return wage;
    }

    public void setWage(Double wage) {
        this.wage = wage;
    }

    public Date getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Date beginTime) {
        this.beginTime = beginTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
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