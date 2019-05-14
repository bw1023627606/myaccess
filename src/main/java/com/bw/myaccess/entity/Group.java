package com.bw.myaccess.entity;

import java.io.Serializable;
import java.util.Date;

public class Group implements Serializable{
    private Long tgId;

    private String groupName;

    private Long parentTgId;

    private Date genTime;

    private String description;

    public Long getTgId() {
        return tgId;
    }

    public void setTgId(Long tgId) {
        this.tgId = tgId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    public Long getParentTgId() {
        return parentTgId;
    }

    public void setParentTgId(Long parentTgId) {
        this.parentTgId = parentTgId;
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