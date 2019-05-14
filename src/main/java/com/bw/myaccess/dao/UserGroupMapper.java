package com.bw.myaccess.dao;

import com.bw.myaccess.entity.UserGroup;

public interface UserGroupMapper {
    int deleteByPrimaryKey(Long tugId);

    int insert(UserGroup record);

    int insertSelective(UserGroup record);

    UserGroup selectByPrimaryKey(Long tugId);

    int updateByPrimaryKeySelective(UserGroup record);

    int updateByPrimaryKey(UserGroup record);
}