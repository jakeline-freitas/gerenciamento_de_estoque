package com.principal.estoque.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produtos")
public class ControllerProduto {
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "view/entradaP";
	}
	

}
