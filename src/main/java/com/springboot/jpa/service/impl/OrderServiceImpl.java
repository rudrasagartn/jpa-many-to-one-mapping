package com.springboot.jpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.jpa.OrderDao;
import com.springboot.jpa.model.Order;
import com.springboot.jpa.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	OrderDao oDao;
	
	
	public List<Order> getOrders(){
	
		return  (List<Order>) oDao.findAll();
	}
}
