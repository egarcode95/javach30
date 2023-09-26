package org.generation.hello.app.entity;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String firstname;
	private String lastname;
	private int cohorte;
	
	public User(String firstname, String lastname, int cohorte) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.cohorte = cohorte;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getCohorte() {
		return cohorte;
	}

	public void setCohorte(int cohorte) {
		this.cohorte = cohorte;
	}

	public static User createJohnDoe() {
		return new User("John", "Doe", 1);
	}
	
	public static List<User> usersMock(){
		List<User> users = new ArrayList<>();
		users.add( new User("Esteban", "Castro", 30));
		users.add( new User("Aline", "Pool", 30));
		users.add( new User("Pax", "Betancourt", 22));
		users.add( new User("Tan", "Gayosso", 2));
		users.add( new User("Margarita", "Zatarain", 18));		
		
		return users;
	}

}
