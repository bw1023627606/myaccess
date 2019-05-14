package com.bw.myaccess.dao;

import com.bw.myaccess.entity.UserRole;

public interface UserRoleMapper {
    int deleteByPrimaryKey(Long turId);

    int insert(UserRole record);

    int insertSelective(UserRole record);

    UserRole selectByPrimaryKey(Long turId);

    int updateByPrimaryKeySelective(UserRole record);

    int updateByPrimaryKey(UserRole record);
}