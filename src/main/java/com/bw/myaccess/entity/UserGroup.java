package com.bw.myaccess.entity;

import java.io.Serializable;

public class UserGroup implements Serializable {
    private Long tugId;

    private Long userId;

    private Long groupId;

    public Long getTugId() {
        return tugId;
    }

    public void setTugId(Long tugId) {
        this.tugId = tugId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }
}