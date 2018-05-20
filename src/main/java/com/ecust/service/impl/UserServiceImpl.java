package com.ecust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecust.mapper.UserMapper;
import com.ecust.pojo.User;
import com.ecust.service.UserService;

@Service
public class UserServiceImpl  implements UserService{
    @Autowired
    UserMapper UserMapper;

    public List<User> list(){
        return UserMapper.list();
    }
    
    @Override
    public void delete(int id) {
    	UserMapper.delete(id);
    }
    
    @Override
    public User get(int id) {
    	return UserMapper.get(id);
    }
    
    @Override
    public void update(User user) {
    	UserMapper.update(user);
    }
    
    @Override
    public void add(User user) {
    	UserMapper.add(user);
    }
    
    @Override
    public User login(User user) {
    	return UserMapper.login(user);
    }

}