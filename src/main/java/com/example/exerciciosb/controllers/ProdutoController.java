package com.example.exerciciosb.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.exerciciosb.model.entities.Produto;
import com.example.exerciciosb.model.repositories.ProdutoRepository;

@RestController()
@RequestMapping("/api/produtos")
public class ProdutoController {
	public Produto produto;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping()
//	public Produto novoProduto(@RequestParam String nome, @RequestParam double preco, @RequestParam double desconto) {
//		Produto produto = new Produto(nome, preco, desconto);
//		produtoRepository.save(produto);
//		return produto;
//	}
	public Produto novoProduto(Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	

}
