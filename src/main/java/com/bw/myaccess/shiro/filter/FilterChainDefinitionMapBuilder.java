package com.bw.myaccess.shiro.filter;


import java.util.LinkedHashMap;

public class FilterChainDefinitionMapBuilder {

	public LinkedHashMap<String, String> buildFilterChainDefinitionMap(){
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		
		map.put("/", "anon");
		map.put("/static/**", "anon");
		map.put("/register/**", "anon");
		map.put("/user/success", "anon");
//		map.put("/static/myjs/**", "anon");
//		map.put("/login.html", "anon");
		map.put("/login", "anon");
		map.put("/login/getOption", "anon");
		map.put("/loginS", "anon");
		map.put("/shiro/logout", "logout");
//		map.put("/user/main", "authc,roles[user]");
		map.put("/admin.jsp", "authc,roles[admin]");
		map.put("/list.jsp", "user");
		
		map.put("/**", "authc");
		
		return map;
	}
	
}
