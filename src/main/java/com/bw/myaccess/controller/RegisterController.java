package com.bw.myaccess.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.bw.myaccess.biz.OrganService;
import com.bw.myaccess.biz.UserService;
import com.bw.myaccess.entity.Organ;
import com.bw.myaccess.entity.User;

@Controller
@RequestMapping("/register")
public class RegisterController {

	private UserService userService;
	private OrganService organService;

	@Autowired
	public void setOrganService(OrganService organService) {
		this.organService = organService;
	}

	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value = "/page", method = RequestMethod.GET)
	public String page() {
		return "user/register";
	}

	@RequestMapping("/add")
	public ModelAndView add(String loginName, String password, @RequestParam("retypePassWord") String retypePassWord,
			@RequestParam("userType") String toId, @RequestParam(value = "flag", defaultValue = "off") String flag) {

		ModelAndView mv = new ModelAndView();
		User addUser = null;
		if ("on".equalsIgnoreCase(flag)) {
			if (password.equals(retypePassWord)) {
				User user = new User();
				user.setToId(Long.parseLong(toId));
				user.setLoginName(loginName);
				user.setPassword(password);
				user.setVsername("游客");
				user.setGenTime(new Date());
				user.setCount(0L);
				addUser = userService.addUser(user);
				mv.addObject("user", addUser);
			}
		}
		if (addUser == null) {
			mv.setViewName("error");
		} else {
			mv.setViewName("user/seccess");
		}

		return mv;
	}

	@RequestMapping("/getOption")
	@ResponseBody
	public Map<Long, String> registerOp() {
		// view--ModelAndView Model,ModeMap
		List<Organ> organs = organService.getOrgans();
		Map<Long, String> maps = new HashMap<Long, String>();
		for (Organ organ : organs) {
			maps.put(organ.getToId(), organ.getOgrName());
		}
		return maps;
	}

}
