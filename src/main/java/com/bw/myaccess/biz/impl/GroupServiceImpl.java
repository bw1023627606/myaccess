package com.bw.myaccess.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.myaccess.biz.GroupService;
import com.bw.myaccess.dao.GroupMapper;
import com.bw.myaccess.entity.Group;
@Service
public class GroupServiceImpl implements GroupService {
	
	private GroupMapper groupMapper;
	
	@Autowired
	public void setGroupService(GroupMapper groupMapper) {
		this.groupMapper = groupMapper;
	}


	@Override
	public List<Group> getGroups() {
		return groupMapper.getGroups();
	}
	
}
