package org.generation.app.entity;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
@Component
@Qualifier("customer")
public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private static int counter;
	
	{
		this.id = ++counter;
		System.out.println("Se inicializa el customer id: " + id);
	}
	
	public static Map<Integer,Customer> usersMock(){
		Map<Integer,Customer> customers = new HashMap<>();
		customers.put(100, new Customer(100,"Esteban", "Castro","", ""));
		customers.put(101, new Customer(101,"Aline", "Pool","", ""));
		customers.put(102, new Customer(102,"Pax", "Betancourt","", ""));
		customers.put(103, new Customer(103,"Tan", "Gayosso","", ""));
		customers.put(104, new Customer(104,"Margarita", "Zatarain","", ""));		
		
		return customers;
	}

}
