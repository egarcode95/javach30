package org.generation.app.controller;

import org.generation.app.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	@Qualifier("customerVIP")
	Customer customer;
	
	@GetMapping("api/users")
	public Customer getUserById() {
		customer.setFirstName("Winnie");
		customer.setLastName("Pooh");
		customer.setEmail("pooh@gmail.com");
		
		return customer;
	}
}
