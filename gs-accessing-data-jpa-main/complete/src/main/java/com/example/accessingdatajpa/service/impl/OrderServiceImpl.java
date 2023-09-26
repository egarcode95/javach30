package com.example.accessingdatajpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.accessingdatajpa.entity.OrderProduct;
import com.example.accessingdatajpa.repository.OrderRepository;
import com.example.accessingdatajpa.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public OrderProduct createOrder(OrderProduct order) {				
		return saveOrder(order);
	}
	
	public OrderProduct saveOrder(OrderProduct order) {
		return orderRepository.save(order);
	}

	@Override
	public OrderProduct getOrderById(Long id) {
		return orderRepository.findById(id)
				.orElseThrow( ()-> new IllegalStateException("Order does not exist with id "+ id) );
	}

	@Override
	public List<OrderProduct> getAllOrders() {
		return (List<OrderProduct>) orderRepository.findAll();
	}

	@Override
	public OrderProduct updateOrder(OrderProduct order, Long id) {
		OrderProduct existingOrder = getOrderById(id);
		existingOrder.setTotalAmount(  order.getTotalAmount()   );
		return saveOrder( existingOrder );
	}

	@Override
	public void deleteOrder(Long id) {
		OrderProduct existingOrder = getOrderById(id);
		orderRepository.delete(existingOrder);
	}

}
