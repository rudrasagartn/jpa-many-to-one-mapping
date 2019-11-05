package com.springboot.jpa;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.model.Order;

public interface OrderDao extends CrudRepository<Order, Integer> {

}
