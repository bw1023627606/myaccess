package com.bw.myaccess.biz;

import java.util.List;

import com.bw.myaccess.entity.User;



public interface UserService {
	
	public User getUser(long id);
	/**
	 * 查询
	 * @param map
	 * @return
	 */
//	public List<User> getUsers(Map<String, Object> map);
	
	public User addUser(User user);
	
	public User findUser(User user);
	
	public List<User> getUsers();
	
	public List<User> selectByToId(Long toId);
	
	public User selectByLoginName(String loginName);
}
