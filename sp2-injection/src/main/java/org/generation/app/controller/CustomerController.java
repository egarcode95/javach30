package org.generation.app.controller;

import java.util.Map;

import org.generation.app.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CustomerController {
	
	//@Autowired 
	Customer customer;
	

	@GetMapping("api/customers")
	public Customer getCustomerById() {
		customer.setFirstName("Pato");
		customer.setLastName("Donald");
		customer.setEmail("pato@gmail.com");
		
		return customer;
	}
	
	/*
	 *  @GetMapping con Path Variable
	 *  Path Variavle vincula un valor de una variable URL
	 *  a un parámetro del método.
	 *  Permite capturar datos dinámicos presentes en la URL 
	 */
	@GetMapping("api/v1/customers/{id}") // localhost:8080/api/customers/100
	public Customer customerPathVariable(@PathVariable("id") int idCustomer) {
		Map<Integer, Customer> customers = Customer.usersMock();
		return customers.get(idCustomer);
	}
	
	/*
	 *  Request Param
	 *  Vincula los parámetros de una solicitud HTTP con los
	 *  parámetros del método.
	 *  Permite extraer los valores de los marámetros de 
	 *  la consulta (query parameters).
	 *  Si no se proporciopna los valores, se genera la excepción
	 *  MissingServletRequestParametersException
	 *  
	 */
	@GetMapping("api/v1/customers/query") 
	// localhost:8080/api/v1/customers/query?id=1&first_name=pato
	public Customer customerRequestVariable(
			@RequestParam(name="id") int idCustomer
			) {
		Map<Integer, Customer> customers = Customer.usersMock();
		return customers.get(idCustomer);	
	}
	
	
}
