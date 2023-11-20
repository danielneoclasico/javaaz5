package com.miempresa.javaazure5.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SaludoControlador {
	
	@GetMapping("/saluda")
	public String saludar() {
		return "saludo";
	}

}
