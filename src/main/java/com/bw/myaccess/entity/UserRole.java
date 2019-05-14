package com.bw.myaccess.entity;

import java.io.Serializable;

public class UserRole implements Serializable {
    private Long turId;

    private Long userId;

    private Long roleId;

    public Long getTurId() {
        return turId;
    }

    public void setTurId(Long turId) {
        this.turId = turId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}