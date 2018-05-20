package com.ecust.service;

import java.util.List;

import com.ecust.pojo.User;

public interface UserService {

    List<User> list();

    void delete(int id);

    User get(int id);

    void update(User user);

    void add(User user);
    
    User login(User user);
}