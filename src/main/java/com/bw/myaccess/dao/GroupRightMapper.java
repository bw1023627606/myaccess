package com.bw.myaccess.dao;

import com.bw.myaccess.entity.GroupRight;

public interface GroupRightMapper {
    int deleteByPrimaryKey(Long tgrId);

    int insert(GroupRight record);

    int insertSelective(GroupRight record);

    GroupRight selectByPrimaryKey(Long tgrId);

    int updateByPrimaryKeySelective(GroupRight record);

    int updateByPrimaryKey(GroupRight record);
}