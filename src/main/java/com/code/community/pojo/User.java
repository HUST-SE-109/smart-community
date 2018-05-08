package com.code.community.pojo;

import java.util.Date;

public class User {
    private Long id;

    private String name;

    private Boolean gender;

    private String card;

    private String nation;

    private Long roomId;

    private Integer politicalStatus;

    private String phone;

    private String company;

    private String companyLocation;

    private Date checkInTime;

    private Boolean hasMarried;

    private Integer relation;

    private Date createTime;

    private Date updateTime;

    private Boolean isDelete;

    public User(Long id, String name, Boolean gender, String card, String nation, Long roomId, Integer politicalStatus, String phone, String company, String companyLocation, Date checkInTime, Boolean hasMarried, Integer relation, Date createTime, Date updateTime, Boolean isDelete) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.card = card;
        this.nation = nation;
        this.roomId = roomId;
        this.politicalStatus = politicalStatus;
        this.phone = phone;
        this.company = company;
        this.companyLocation = companyLocation;
        this.checkInTime = checkInTime;
        this.hasMarried = hasMarried;
        this.relation = relation;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
    }

    public User() {
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

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card == null ? null : card.trim();
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation == null ? null : nation.trim();
    }

    public Long getRoomId() {
        return roomId;
    }

    public void setRoomId(Long roomId) {
        this.roomId = roomId;
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

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getCompanyLocation() {
        return companyLocation;
    }

    public void setCompanyLocation(String companyLocation) {
        this.companyLocation = companyLocation == null ? null : companyLocation.trim();
    }

    public Date getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(Date checkInTime) {
        this.checkInTime = checkInTime;
    }

    public Boolean getHasMarried() {
        return hasMarried;
    }

    public void setHasMarried(Boolean hasMarried) {
        this.hasMarried = hasMarried;
    }

    public Integer getRelation() {
        return relation;
    }

    public void setRelation(Integer relation) {
        this.relation = relation;
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