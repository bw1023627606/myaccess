package com.bw.myaccess.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.myaccess.biz.LogService;
import com.bw.myaccess.dao.LogMapper;
import com.bw.myaccess.entity.Log;

@Service
public class LogServiceImpl implements LogService{
	private LogMapper logMapper;
	@Autowired
	public void setLogService(LogMapper logMapper) {
		this.logMapper = logMapper;
	}
	@Override
	public List<Log> getLogs() {
		return logMapper.getLogs();
	}
	
	
}
