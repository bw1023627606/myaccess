package com.bw.myaccess.dao;

import java.util.List;

import com.bw.myaccess.entity.Log;

public interface LogMapper {
    int deleteByPrimaryKey(Long logId);

    int insert(Log record);

    int insertSelective(Log record);

    Log selectByPrimaryKey(Long logId);

    int updateByPrimaryKeySelective(Log record);

    int updateByPrimaryKeyWithBLOBs(Log record);

    int updateByPrimaryKey(Log record);
    
    List<Log> getLogs();
}