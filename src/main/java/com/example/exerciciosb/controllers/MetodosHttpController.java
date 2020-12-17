package com.example.exerciciosb.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/metodos")
public class MetodosHttpController {
	
	@GetMapping()
	private String get() {
		return "Resquisição GET";
	}
	
	@PostMapping
	private String post() {
		return "Resquisição POST";
	}
	
	@PutMapping
	private String put() {
		return "Resquisição PUT";
	}
	
	@PatchMapping
	private String patch() {
		return "Resquisição PATH";
	}
	
	@DeleteMapping
	private String delete() {
		return "Resquisição DELETE";
	}
}
