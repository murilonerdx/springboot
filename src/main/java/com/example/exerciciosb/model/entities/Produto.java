package com.example.exerciciosb.model.entities;

import javax.persistence.Column;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "preco", nullable = false)
	private double preco = 0.0;
	
	@Column(name = "desconto", nullable = false)
	private double desconto = 0.0;
	
	@Column(name="precoDesconto")
	private double precoDesconto = 0.0;

	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		
		this.precoDesconto = preco - (preco * desconto);
		
		if(desconto > 1 || desconto < 0) {
			this.desconto = 0.0;
		}else if(preco < 0) {
			this.preco = 0.0;
		}
	}

	public double getPrecoDesconto() {
		return precoDesconto;
	}

	public void setPrecoDesconto(double precoDesconto) {
		this.precoDesconto = precoDesconto;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
