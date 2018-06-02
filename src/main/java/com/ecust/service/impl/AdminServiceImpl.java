package com.ecust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecust.mapper.AdminMapper;
import com.ecust.pojo.Admin;
import com.ecust.service.AdminService;

@Service
public class AdminServiceImpl  implements AdminService{
    @Autowired
    AdminMapper AdminMapper;


    @Override
    public Admin login(Admin Admin) {
        return AdminMapper.login(Admin);
    }

}