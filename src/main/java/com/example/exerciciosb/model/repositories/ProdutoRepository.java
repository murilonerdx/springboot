package com.example.exerciciosb.model.repositories;



import org.springframework.data.repository.CrudRepository;


import com.example.exerciciosb.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>{
	
}
