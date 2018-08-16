package br.com.fiap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.fiap.spring.model.Apresentacao;

@Controller
@RequestMapping("apresentacao")
public class ApresentacaoController {

	@GetMapping("cadastrar") // URL: apresenta��o/cadastrar
	public String formApresentacao() {
		return "apresentacao/form";
	}
	
	@PostMapping("cadastrar")
	public ModelAndView cadastrarApresentacao(Apresentacao apresentacao) {
		ModelAndView modelView = new ModelAndView("apresentacao/form");
		modelView.addObject("msg", "Apresenta��o cadastrada com sucesso");
		return modelView;
	}
	
	
}
