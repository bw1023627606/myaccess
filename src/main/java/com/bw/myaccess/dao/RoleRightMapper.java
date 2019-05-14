package com.bw.myaccess.dao;

import com.bw.myaccess.entity.RoleRight;

public interface RoleRightMapper {
    int deleteByPrimaryKey(Long trrId);

    int insert(RoleRight record);

    int insertSelective(RoleRight record);

    RoleRight selectByPrimaryKey(Long trrId);

    int updateByPrimaryKeySelective(RoleRight record);

    int updateByPrimaryKey(RoleRight record);
}