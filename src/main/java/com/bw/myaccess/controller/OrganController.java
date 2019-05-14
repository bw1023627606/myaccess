package com.bw.myaccess.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.myaccess.biz.OrganService;
import com.bw.myaccess.entity.Organ;

@Controller
public class OrganController {
	
	private OrganService organService;
	
	@Autowired
	public void setOrganService(OrganService organService) {
		this.organService = organService;
	}

	@RequestMapping("/login/getOption")
	@ResponseBody
	public Map<Long,String> loginOp() {
		//view--ModelAndView Model,ModeMap
		List<Organ> organs = organService.getOrgans();
		Map<Long,String> maps = new HashMap<Long,String>();
		for (Organ organ : organs) {
			maps.put(organ.getToId(), organ.getOgrName());
		}
		return maps;
	}
	
	
	
	
	
}
