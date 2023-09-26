package com.example.accessingdatajpa.service;

import java.util.List;

import com.example.accessingdatajpa.entity.OrderProduct;

public interface OrderService {

	OrderProduct createOrder(OrderProduct order);
	
	OrderProduct getOrderById(Long id);
	
	List<OrderProduct> getAllOrders();
	
	OrderProduct updateOrder(OrderProduct order, Long id);
	
	void deleteOrder(Long id);
}
