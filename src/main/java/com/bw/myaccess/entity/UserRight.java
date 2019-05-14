package com.bw.myaccess.entity;

import java.io.Serializable;

public class UserRight implements Serializable {
    private Long turId;

    private Long userId;

    private Long rightId;

    private Short rightType;

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