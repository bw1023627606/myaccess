package com.bw.myaccess.entity;

import java.io.Serializable;
import java.util.Date;

public class Organ implements Serializable {
    private Long toId;

    private Long parentToId;

    private String ogrName;

    private Date genTime;

    private String description;

    public Long getToId() {
        return toId;
    }

    public void setToId(Long toId) {
        this.toId = toId;
    }

    public Long getParentToId() {
        return parentToId;
    }

    public void setParentToId(Long parentToId) {
        this.parentToId = parentToId;
    }

    public String getOgrName() {
        return ogrName;
    }

    public void setOgrName(String ogrName) {
        this.ogrName = ogrName == null ? null : ogrName.trim();
    }

    public Date getGenTime() {
        return genTime;
    }

    public void setGenTime(Date genTime) {
        this.genTime = genTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}