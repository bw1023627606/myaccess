package com.bw.myaccess.dao;

import java.util.List;

import com.bw.myaccess.entity.Right;

public interface RightMapper {
    int deleteByPrimaryKey(Long trtId);

    int insert(Right record);

    int insertSelective(Right record);

    Right selectByPrimaryKey(Long trtId);

    int updateByPrimaryKeySelective(Right record);

    int updateByPrimaryKey(Right record);
    
    List<Right> getRights();
}