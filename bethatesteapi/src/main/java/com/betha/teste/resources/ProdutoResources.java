package com.betha.teste.resources;

import java.net.URI;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.CacheControl;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.betha.teste.domain.Produto;
import com.betha.teste.services.ProdutoServices;

@RestController
@RequestMapping("/produto")
public class ProdutoResources {
	
	@Autowired
	private ProdutoServices produtoServices;
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Produto>> listar(){	
		CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(produtoServices.listar());
	}
	
	@CrossOrigin
	@RequestMapping(method = RequestMethod.POST, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> salvar(@Valid @RequestBody Produto produto){
		produto = produtoServices.salvar(produto);
		
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(produto.getId()).toUri();
		
		return ResponseEntity.created(uri).build();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<?> buscar(@PathVariable("id") Long id){
		Produto produto = produtoServices.buscar(id);
				
		CacheControl cacheControl = CacheControl.maxAge(20, TimeUnit.SECONDS);
		
		return ResponseEntity.status(HttpStatus.OK).cacheControl(cacheControl).body(produto);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> deletar(@PathVariable("id") Long id){		
		produtoServices.deletar(id);		
		return ResponseEntity.noContent().build();
	}
	
	@CrossOrigin
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Void> atualizar(@RequestBody Produto produto, @PathVariable("id") Long id){
		produto.setId(id);		
		produtoServices.atualizar(produto);		
		return ResponseEntity.noContent().build();
	}
}
