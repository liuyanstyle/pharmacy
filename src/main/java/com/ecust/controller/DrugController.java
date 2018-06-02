package com.ecust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecust.pojo.*;
import com.ecust.service.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/drug")
public class DrugController {

    @Autowired
    DrugService drugService;

    @Autowired
    DrugstoreService drugstoreService;

    /*show all drug*/
    @RequestMapping("listDrug")
    public ModelAndView listDrug1(){
        ModelAndView mav = new ModelAndView();
        List<Drug> cs= drugService.select();
        mav.addObject("cs", cs);
        mav.setViewName("listDrug2");
        return mav;
    }

    @RequestMapping("search")
    public ModelAndView search(String searchName, String searchContent, HttpSession httpSession) {
        ModelAndView mav = new ModelAndView();
        httpSession.setAttribute("searchContent",searchContent);
        httpSession.setAttribute("searchName",searchName);
        if (searchName.equals("drug")) {
            List<Drug> cs = drugService.searchName(searchContent);
            mav.addObject("cs", cs);
            mav.setViewName("listDrug");
            return mav;
        }
        if (searchName.equals("drugstore") ) {
            List<Drugstore> cs = drugstoreService.searchName(searchContent);
            mav.addObject("cs", cs);
            mav.setViewName("listDrugstore");
            return mav;
        }
        else{
            List<Drug> cs = drugService.searchEffect(searchContent);
            mav.addObject("cs", cs);
            mav.setViewName("listDrug");
            return mav;
        }

    }

}

