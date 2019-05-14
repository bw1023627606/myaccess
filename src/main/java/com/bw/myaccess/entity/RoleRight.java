package com.bw.myaccess.entity;

import java.io.Serializable;

public class RoleRight implements Serializable {
    private Long trrId;

    private Long roleId;

    private Long rightId;

    private Short rightType;

    public Long getTrrId() {
        return trrId;
    }

    public void setTrrId(Long trrId) {
        this.trrId = trrId;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    public Long getRightId() {
        return rightId;
    }

    public void setRightId(Long rightId) {
        this.rightId = rightId;
    }

    public Short getRightType() {
        return rightType;
    }

    public void setRightType(Short rightType) {
        this.rightType = rightType;
    }
}