package com.ecust.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecust.mapper.OrderMapper;
import com.ecust.pojo.Order;
import com.ecust.service.OrderService;

@Service
public class OrderServiceImpl  implements OrderService{
    @Autowired
    OrderMapper orderMapper;

    public void insert(Order order){
        orderMapper.insert(order);
    }

}
