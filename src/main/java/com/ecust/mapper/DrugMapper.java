package com.ecust.mapper;


import com.ecust.pojo.Drug;
import java.util.List;

public interface DrugMapper {

    public List<Drug> searchEffect(String effect);

    public List<Drug> searchName(String name);

    public Drug get(int id);

    public List<Drug> showDrug();

    public List<Drug>  select();


}
