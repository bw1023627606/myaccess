package com.bw.myaccess.dao;

import java.util.List;

import com.bw.myaccess.entity.Organ;

public interface OrganMapper {
    int deleteByPrimaryKey(Long toId);

    int insert(Organ record);

    int insertSelective(Organ record);

    Organ selectByPrimaryKey(Long toId);

    int updateByPrimaryKeySelective(Organ record);

    int updateByPrimaryKey(Organ record);
    
    List<Organ> getOrgans(); 
}