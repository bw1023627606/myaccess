package com.bw.myaccess.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.myaccess.biz.OrganService;
import com.bw.myaccess.dao.OrganMapper;
import com.bw.myaccess.entity.Organ;

@Service
public class OrganServiceImpl implements OrganService {

	private OrganMapper organMapper;
	
	@Autowired
	public void setOrganMapper(OrganMapper organMapper) {
		this.organMapper = organMapper;
	}


	@Override
	public List<Organ> getOrgans() {
		
		return organMapper.getOrgans();
	}


	@Override
	public Organ getOrganByToId(Long toId) {
		return organMapper.selectByPrimaryKey(toId);
	}

}
