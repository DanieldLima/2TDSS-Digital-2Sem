package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	// Metodo para atender uma requisi��o
	@RequestMapping("/home")
	public String home() {
		//Retorn a view (pasta e arquivo)
		return "home/index";
	}
	
	
	

}
