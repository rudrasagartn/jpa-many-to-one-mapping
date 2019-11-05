package com.springboot.jpa.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.jpa.model.Order;
import com.springboot.jpa.service.OrderService;

@RestController
public class OrderControler {

	@Autowired
	OrderService oService;

	@RequestMapping(value = "/get/orders")
	public void getOrders() {

		List<Order> orders = oService.getOrders();
		for (Order order : orders) {
			System.out.println(order.getOrderName());
		}

	}
}
