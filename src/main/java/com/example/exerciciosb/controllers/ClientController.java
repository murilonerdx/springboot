package com.example.exerciciosb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciosb.model.entities.Cliente;

@RestController()
@RequestMapping(path = "/clientes")
public class ClientController {
	
	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(19, "Murilo", "123.456.789-00");
	}
	
	@GetMapping("/{id}")
	public Cliente obterClientePorId1(@PathVariable int id) { //http://localhost:8080/clientes/123
		return new Cliente(id, "Murilo", "123.456.789-00");
	}
	
	@GetMapping
	public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) { //http://localhost:8080/clientes?id=123
		return new Cliente(id, "Roberto", "123.456.789-00");
	}
}
