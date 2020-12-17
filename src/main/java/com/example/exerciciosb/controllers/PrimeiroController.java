package com.example.exerciciosb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	
	
	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	public String ola() {
		return "Olá Spring Boot!";
	}
	
	@GetMapping(path ="/ola2")
	public String ola2() {
		return "Saudação amigo!!";
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/")
	public String index() {
		return "Pagina Inicial";
	}
	
	
	
}
