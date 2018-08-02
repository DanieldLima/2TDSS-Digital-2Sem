package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/contato")
public class ContatoController {
	
	@GetMapping("enviar")
	public String contato() {
		return "contato/form";
	}
	
	// Metodo que recupera as informa��es do formu��rio
	@PostMapping("enviar")
	public String contato(String name, String mensagem) {
		System.out.println(name + " " + mensagem);
		return "contato/form";
	}

}
