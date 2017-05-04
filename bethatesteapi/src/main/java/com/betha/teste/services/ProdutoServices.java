package com.betha.teste.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.betha.teste.domain.Produto;
import com.betha.teste.repository.ProdutoRepository;
import com.betha.teste.services.exceprions.ProdutoException;

@Service
public class ProdutoServices {

	@Autowired
	private ProdutoRepository produtoRepository;
	
	public List<Produto> listar(){		
		return produtoRepository.findAll();
	}
	
	public Produto salvar(Produto produto){
		produto.setId(null);
		return produtoRepository.save(produto);		
	}
	
	public Produto buscar(Long id){
		Produto produto = produtoRepository.findOne(id);
		
		if(produto == null){
			throw new ProdutoException("Produto não existe.");
		}
		
		return produto;
	}
	
	public void deletar(Long id){
		try{
			produtoRepository.delete(id);
		}catch (EmptyResultDataAccessException e) {
			throw new ProdutoException("Produto não existe.");
		}
	}
	
	public void atualizar(Produto produto){
		verificaExistencia(produto);
		produtoRepository.save(produto);
	}
	
	private void verificaExistencia(Produto produto){
		buscar(produto.getId());
	}
}
