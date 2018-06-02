package com.ecust.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ecust.pojo.*;
import com.ecust.service.*;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/order")
public class OrderController {

    @Autowired
    DrugService drugService;

    @Autowired
    DrugstoreService drugstoreService;

    @Autowired
    OrderService orderService;

    @Autowired
    OrderItemService orderItemService;

    @RequestMapping("orderItemAdd")
    public ModelAndView orderItemAdd(int pid,int num, HttpSession httpSession){

        ModelAndView mav = new ModelAndView();
        OrderItem oi=new OrderItem();

        oi.setNum(num);
        Drug drug=drugService.get(pid);
        oi.setDid(drug.id);
        oi.setDrug(drug);

        List<OrderItem> ois = (List<OrderItem>) httpSession.getAttribute("ois");
        if (null == ois) {
            ois = new ArrayList<OrderItem>();
            httpSession.setAttribute("ois", ois);
        }
        boolean found = false;
        for (OrderItem orderItem : ois) {
            if (orderItem.getDrug().getId() == oi.getDrug().getId()) {
                orderItem.setNum(orderItem.getNum() + oi.getNum());
                found = true;
                break;
            }
        }
        if (!found)
            ois.add(oi);
        httpSession.setAttribute("ois",ois);
        mav.addObject("searchContent", httpSession.getAttribute("searchContent"));
        mav.addObject("searchName", httpSession.getAttribute("searchName"));
        mav.setViewName("redirect:/drug/search");
        return  mav;
    }

    @RequestMapping("listOrderItem")
    public ModelAndView listOrderItem(HttpSession httpSession){
        ModelAndView mav = new ModelAndView();
        mav.addObject("ios",httpSession.getAttribute("ois"));
        mav.setViewName("listOrderItem");
        return mav;
    }

    @RequestMapping("orderItemDelete")
    public ModelAndView orderItemDelete(int id ,HttpSession httpSession){
        int pid= id;

        List<OrderItem> ois = (List<OrderItem>) httpSession.getAttribute("ois");
        List<OrderItem> oisDelete =new ArrayList<>();
        if(null!=ois){
            for (OrderItem io : ois) {
                if(io.getDrug().getId()==pid){
                    oisDelete.add(io);
                }
            }
        }
        ois.removeAll(oisDelete);
        ModelAndView mav = new ModelAndView();
        mav.addObject(ois);
        mav.setViewName("listOrderItem");
        return mav;
    }



    @RequestMapping("createOrder")
    public ModelAndView createOrder(HttpSession httpSession){
        ModelAndView mav = new ModelAndView();
        Order o=new Order();
        User u=(User)httpSession.getAttribute("user");
        if(null==u){
            mav.setViewName("login");
            return mav;
        }
        else {

            o.setUser(u);
            o.setUid(u.getId());
            System.out.println(u.getId());
            orderService.insert(o);
            int id=o.getId();

            List<OrderItem> ois = (List<OrderItem>) httpSession.getAttribute("ois");
            for (OrderItem oi : ois) {
                oi.setOrder(o);
                oi.setOid(id);
                System.out.println(oi.did);
                System.out.println(oi.num);
                System.out.println(oi.oid);
                orderItemService.insert(oi);
            }

            ois.clear();
            String success = "success";
            mav.addObject("success", success);
            mav.setViewName("success");

            return mav;

        }
    }




}
