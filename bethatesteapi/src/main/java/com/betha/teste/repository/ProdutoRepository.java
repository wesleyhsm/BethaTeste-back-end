package com.betha.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.betha.teste.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
