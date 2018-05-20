package com.ecust.mapper;

import java.util.List;
import com.ecust.pojo.User;

public interface UserMapper {

    public void add(User User);

    public void delete(int id);

    public User get(int id);

    public void update(User User);

    public List<User> list();

    public User login(User user);
}