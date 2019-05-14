package com.bw.myaccess.dao;

import com.bw.myaccess.entity.GroupRole;

public interface GroupRoleMapper {
    int deleteByPrimaryKey(Long tgrId);

    int insert(GroupRole record);

    int insertSelective(GroupRole record);

    GroupRole selectByPrimaryKey(Long tgrId);

    int updateByPrimaryKeySelective(GroupRole record);

    int updateByPrimaryKey(GroupRole record);
}