package com.bw.myaccess.biz;

import java.util.List;

import com.bw.myaccess.entity.Organ;



public interface OrganService {
	
	public List<Organ> getOrgans();
	
	public Organ getOrganByToId(Long toId);
}
