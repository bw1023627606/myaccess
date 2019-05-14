package com.bw.myaccess.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.myaccess.biz.RoleService;
import com.bw.myaccess.dao.RoleMapper;
import com.bw.myaccess.entity.Role;
@Service
public class RoleServiceImpl implements RoleService {
	
	private RoleMapper roleMapper;
	
	@Autowired
	public void setRoleService(RoleMapper roleMapper) {
		this.roleMapper = roleMapper;
	}


	@Override
	public List<Role> getRoles() {
		return roleMapper.getRoles();
	}
	
}
