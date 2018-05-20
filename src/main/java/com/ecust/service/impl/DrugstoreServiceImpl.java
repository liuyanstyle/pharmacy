package com.ecust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecust.mapper.DrugstoreMapper;
import com.ecust.pojo.Drugstore;
import com.ecust.service.DrugstoreService;

@Service
public class DrugstoreServiceImpl  implements DrugstoreService{
    @Autowired
    DrugstoreMapper DrugstoreMapper;

    @Override
    public List<Drugstore> searchName(String name){
        return DrugstoreMapper.searchName(name);
    }


}