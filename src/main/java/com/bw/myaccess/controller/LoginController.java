package com.bw.myaccess.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bw.myaccess.biz.UserService;
import com.bw.myaccess.entity.User;

@Controller
public class LoginController {
	
	private UserService userService;
	
	@Autowired
	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("/loginS")
	public ModelAndView loginS(String loginName, String password,@RequestParam("userType") String toId) {
		ModelAndView mv = new ModelAndView();
		User user = new User();
		user.setLoginName(loginName);
		user.setPassword(password);
		user.setToId(Long.parseLong(toId));
		User findUser = userService.findUser(user);
		if(findUser!=null) {
			mv.addObject("user", findUser);
			mv.setViewName("index");
			return mv;
		}else {
			mv.setViewName("error");
			return mv;
		}
	}
}
