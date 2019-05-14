package com.bw.myaccess.entity;

import java.io.Serializable;

public class GroupRight implements Serializable{
    private Long tgrId;

    private Long groupId;

    private Long rightId;

    private Short rightType;

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