package org.generation.hello.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  @Controller indica que lña clase será un controlador MVC.
 *  
 */

@Controller
@RequestMapping("cohortes")
public class Cohorte {
	
	@GetMapping // localhost:8080/cohortes
	public String getCohorte() {
		return "cohorte.html";
	}

}
