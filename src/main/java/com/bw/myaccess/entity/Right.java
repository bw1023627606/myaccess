package com.bw.myaccess.entity;

import java.io.Serializable;
import java.util.Date;

public class Right implements Serializable {
    private Long trtId;

    private Long parentTrtId;

    private String rightName;

    private Date genTime;

    private String description;

    public Long getTrtId() {
        return trtId;
    }

    public void setTrtId(Long trtId) {
        this.trtId = trtId;
    }

    public Long getParentTrtId() {
        return parentTrtId;
    }

    public void setParentTrtId(Long parentTrtId) {
        this.parentTrtId = parentTrtId;
    }

    public String getRightName() {
        return rightName;
    }

    public void setRightName(String rightName) {
        this.rightName = rightName == null ? null : rightName.trim();
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