package com.code.community.pojo;

import java.util.Date;

public class Event {
    private Long id;

    private Integer type;

    private Date reportTime;

    private Date handleTime;

    private Integer status;

    private Long operatorId;

    private String detailInfo;

    private Date createTime;

    private Date updateTime;

    private Byte isDelete;

    public Event(Long id, Integer type, Date reportTime, Date handleTime, Integer status, Long operatorId, String detailInfo, Date createTime, Date updateTime, Byte isDelete) {
        this.id = id;
        this.type = type;
        this.reportTime = reportTime;
        this.handleTime = handleTime;
        this.status = status;
        this.operatorId = operatorId;
        this.detailInfo = detailInfo;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.isDelete = isDelete;
    }

    public Event() {
        super();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(Long operatorId) {
        this.operatorId = operatorId;
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