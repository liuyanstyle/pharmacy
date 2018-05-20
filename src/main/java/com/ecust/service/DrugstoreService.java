package com.ecust.service;

import java.util.List;

import com.ecust.pojo.Drugstore;

public interface DrugstoreService {

    List<Drugstore> searchName(String name);

}
