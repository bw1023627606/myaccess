package com.bw.myaccess.dao;

import java.util.List;

import com.bw.myaccess.entity.User;

public interface UserMapper {
    int deleteByPrimaryKey(Long tuId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long tuId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    User getUser(User user);
    
    List<User> getUsers();
    
    List<User> selectByToId(Long toId);
    
//    List<User> selectUsers(Map<String, Object> map);
    
    
}