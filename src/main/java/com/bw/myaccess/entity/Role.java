package com.bw.myaccess.entity;

import java.io.Serializable;
import java.util.Date;

public class Role implements Serializable {
    private Long trId;

    private Long parentTrId;

    private String roleName;

    private Date genTime;

    private String description;

    public Long getTrId() {
        return trId;
    }

    public void setTrId(Long trId) {
        this.trId = trId;
    }

    public Long getParentTrId() {
        return parentTrId;
    }

    public void setParentTrId(Long parentTrId) {
        this.parentTrId = parentTrId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName == null ? null : roleName.trim();
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