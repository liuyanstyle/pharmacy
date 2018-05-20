package com.ecust.mapper;

import com.ecust.pojo.Drugstore;

import java.util.List;

public interface DrugstoreMapper {
    public List<Drugstore> searchName(String name);
}
