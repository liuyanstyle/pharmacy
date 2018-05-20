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
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("listUser")
    public ModelAndView listUser(){
        ModelAndView mav = new ModelAndView();
        List<User> cs= userService.list();
        mav.addObject("cs", cs);
        mav.setViewName("listUser");
        return mav;
    }
    
    @RequestMapping("login")
    public ModelAndView loginUser(User user,HttpSession httpSession) {
    	ModelAndView mav = new ModelAndView();
    	User cs=userService.login(user);
    	if(cs==null) {
    		mav.setViewName("erro");
    		return mav;
    	}
    	else
    	{
    		httpSession.setAttribute("user",cs);
    		mav.addObject("cs",cs);
    		mav.setViewName("redirect:/");
    		return mav;
    	}
    	
    }
    
    @RequestMapping("addUser")
	public ModelAndView addUser(User user){
		userService.add(user);
		ModelAndView mav = new ModelAndView("redirect:listUser");
	    return mav;
	}	
    
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(User user){
		userService.delete(user.getId());
		ModelAndView mav = new ModelAndView("redirect:listUser");
		return mav;
	}	
	
	@RequestMapping("editUser")
	public ModelAndView editUser(User user){
		User c= userService.get(user.getId());
		ModelAndView mav = new ModelAndView("editUser");
		mav.addObject("c", c);
		return mav;
	}	
	
	@RequestMapping("updateUser")
	public ModelAndView updateUser(User user){
		userService.update(user);
		ModelAndView mav = new ModelAndView("redirect:/user/listUser");
		return mav;
	}	
 
}