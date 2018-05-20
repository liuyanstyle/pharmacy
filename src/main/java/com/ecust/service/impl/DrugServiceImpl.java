package com.ecust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecust.mapper.DrugMapper;
import com.ecust.pojo.Drug;
import com.ecust.service.DrugService;

@Service
public class DrugServiceImpl  implements DrugService{
    @Autowired
    DrugMapper DrugMapper;

    @Override
    public List<Drug> searchEffect(String effect){
        return DrugMapper.searchEffect(effect);
    }

    @Override
    public List<Drug> searchName(String name) {
        return DrugMapper.searchName(name);
    }


    @Override
    public Drug get(int id) {
        return DrugMapper.get(id);
    }

    @Override
    public List<Drug> showDrug() {
        return DrugMapper.showDrug();
    }



}