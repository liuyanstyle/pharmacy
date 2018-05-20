package com.ecust.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecust.mapper.OrderItemMapper;
import com.ecust.pojo.OrderItem;
import com.ecust.service.OrderItemService;

@Service
public class OrderItemServiceImpl  implements OrderItemService{
    @Autowired
    OrderItemMapper OrderItemMapper;

    public void insert(OrderItem orderItem){
        OrderItemMapper.insert(orderItem);
    }


}
