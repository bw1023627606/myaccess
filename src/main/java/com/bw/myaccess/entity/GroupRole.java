package com.bw.myaccess.entity;

import java.io.Serializable;

public class GroupRole implements Serializable {
    private Long tgrId;

    private Long groupId;

    private Long roleId;

    public Long getTgrId() {
        return tgrId;
    }

    public void setTgrId(Long tgrId) {
        this.tgrId = tgrId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}