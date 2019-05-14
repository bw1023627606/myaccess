package com.bw.myaccess.dao;

import java.util.List;

import com.bw.myaccess.entity.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(Long trId);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(Long trId);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
    
    List<Role> getRoles();
}