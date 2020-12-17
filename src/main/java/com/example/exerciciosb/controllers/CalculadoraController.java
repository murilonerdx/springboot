package com.example.exerciciosb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciosb.model.entities.Cliente;

@RestController()
@RequestMapping(path = "/calculadora")
public class CalculadoraController {

	@GetMapping("/somar/{a}/{b}")
	public Integer obterClientePorId1(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}

	@GetMapping(path = "/subtrair")
	public Integer obterClientePorId2(@RequestParam(name = "a") int a, @RequestParam(name = "b") int b) { // http://localhost:8080/clientes?id=123
		return a - b;
	}
}
