package com.springboot.jpa.service;

import java.util.List;

import com.springboot.jpa.model.Order;

public interface OrderService {

	public List<Order> getOrders();
}
