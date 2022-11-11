package com.example.demo.controllers.security;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/prueba")
public class Prueba {
	@GetMapping("/git")
	public String holaMundo() {
		return " <h1>Probando git y  github</h1>";
	}
}
// http://localhost:8080/prueba/git