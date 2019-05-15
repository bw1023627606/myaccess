package com.bw.myaccess.biz.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.myaccess.biz.UserService;
import com.bw.myaccess.dao.UserMapper;
import com.bw.myaccess.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private UserMapper userMapper;

	@Autowired
	public void setUserMapper(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

//	@Override
//	public List<User> getUsers(Map<String, Object> map) {
//		return userMapper.selectUsers(map);
//	}

//	@Cacheable(value = "aboutUser", key = "'tu_'+#id")
	@Override
	public User getUser(long id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public User addUser(User user) {
		int insert = userMapper.insert(user);
		if (insert > 0) {
			return user;
		}
		return null;
	}

	@Override
	public User findUser(User user) {
		return userMapper.getUser(user);
	}

//	@Cacheable(value = "aboutUser")
	@Override
	public List<User> getUsers() {
		return userMapper.getUsers();
	}

	@Override
	public List<User> selectByToId(Long toId) {
		return userMapper.selectByToId(toId);
	}

	@Override
	public User selectByLoginName(String loginName) {
		return userMapper.selectByLoginName(loginName);
	}

}
