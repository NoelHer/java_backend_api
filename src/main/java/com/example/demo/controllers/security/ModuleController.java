package com.example.demo.controllers.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ejemplo")
public class ModuleController {

	@GetMapping("/hola")
	public String holaMundo() {
		return " <h1>Hola Mundo</h1>";
	}
	
	
	@RequestMapping("/persona")
	public List <Persona>getPersonas(){
		List<Persona>personas=new ArrayList<Persona>();
		Persona p1=new Persona();
		p1.setId(1);
		p1.setNombre("Juan");
		p1.setApellido("Pérez");
		p1.setTelefono("12345678");
		personas.add(p1);
		
		Persona p2=new Persona();
		p2.setId(2);
		p2.setNombre("Jhon");
		p2.setApellido("Constantin");
		p2.setTelefono("123456789");
		personas.add(p2);
		return personas;
	}

}
//  http://localhost:8080/ejemplo/hola

