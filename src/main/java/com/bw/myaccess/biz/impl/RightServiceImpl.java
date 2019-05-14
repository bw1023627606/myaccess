package com.bw.myaccess.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.myaccess.biz.RightService;
import com.bw.myaccess.dao.RightMapper;
import com.bw.myaccess.entity.Right;
@Service
public class RightServiceImpl implements RightService{

	private RightMapper rightMapper;
	@Autowired
	public void setRightService(RightMapper rightMapper) {
		this.rightMapper = rightMapper;
	}

	@Override
	public List<Right> getRights() {
		return rightMapper.getRights();
	}

}
