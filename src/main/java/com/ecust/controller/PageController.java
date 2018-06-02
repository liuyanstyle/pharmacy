package com.ecust.controller;

import com.ecust.pojo.Drug;
import com.ecust.service.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@Controller
@RequestMapping("")
public class PageController {

    @Autowired
    DrugService drugService;

    @RequestMapping("")
    public ModelAndView showDrug() {
        ModelAndView mav = new ModelAndView();
        List<Drug> cs = drugService.showDrug();
        mav.addObject("cs", cs);
        mav.setViewName("index");
        return mav;
    }

    @RequestMapping("login")
    public ModelAndView login(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("login");
        return mav;
    }

    @RequestMapping("regist")
    public ModelAndView regist() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("regist");
        return mav;

    }

    @RequestMapping("admin")
    public ModelAndView admin() {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("loginAdmin");
        return mav;

    }

}