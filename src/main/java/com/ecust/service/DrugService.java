package com.ecust.service;

import java.util.List;

import com.ecust.pojo.Drug;

public interface DrugService {

    List<Drug> searchEffect(String effect);
    List<Drug> searchName(String name);
    Drug get(int id);
    List<Drug> showDrug();
    List<Drug> select();

}
