package com.bw.myaccess.dao;

import java.util.List;

import com.bw.myaccess.entity.Group;

public interface GroupMapper {
    int deleteByPrimaryKey(Long tgId);

    int insert(Group record);

    int insertSelective(Group record);

    Group selectByPrimaryKey(Long tgId);

    int updateByPrimaryKeySelective(Group record);

    int updateByPrimaryKey(Group record);
    
    List<Group> getGroups();
}