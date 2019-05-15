package com.bw.myaccess.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
		
		Subject currentUser = SecurityUtils.getSubject();
		if (!currentUser.isAuthenticated()) {
        	// 把用户名和密码封装为 UsernamePasswordToken 对象
            UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
            // rememberme
            token.setRememberMe(true);
            try {
            	System.out.println("1. " + token.hashCode());
            	// 执行登录. 
                currentUser.login(token);
            } 
            // ... catch more exceptions here (maybe custom ones specific to your application?
            // 所有认证时异常的父类. 
            catch (AuthenticationException ae) {
                //unexpected condition?  error?
            	System.out.println("登录失败: " + ae.getMessage());
            }
        }
		ModelAndView mView=new ModelAndView();
		User user = new User();
		user.setLoginName(loginName);
		mView.addObject("user", user);
		mView.setViewName("index");
		return mView;
		
		
		
	/*	
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
		*/
	}
	
	
}
