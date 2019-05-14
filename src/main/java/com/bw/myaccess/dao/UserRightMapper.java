package com.bw.myaccess.dao;

import com.bw.myaccess.entity.UserRight;

public interface UserRightMapper {
    int deleteByPrimaryKey(Long turId);

    int insert(UserRight record);

    int insertSelective(UserRight record);

    UserRight selectByPrimaryKey(Long turId);

    int updateByPrimaryKeySelective(UserRight record);

    int updateByPrimaryKey(UserRight record);
}