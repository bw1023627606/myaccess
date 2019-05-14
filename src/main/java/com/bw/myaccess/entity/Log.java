package com.bw.myaccess.entity;

import java.io.Serializable;
import java.util.Date;

public class Log implements Serializable {
    private Long logId;

    private Short opType;

    private String content;

    private Date genTime;

    private byte[] userId;

    public Long getLogId() {
        return logId;
    }

    public void setLogId(Long logId) {
        this.logId = logId;
    }

    public Short getOpType() {
        return opType;
    }

    public void setOpType(Short opType) {
        this.opType = opType;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

    public byte[] getUserId() {
        return userId;
    }

    public void setUserId(byte[] userId) {
        this.userId = userId;
    }
}