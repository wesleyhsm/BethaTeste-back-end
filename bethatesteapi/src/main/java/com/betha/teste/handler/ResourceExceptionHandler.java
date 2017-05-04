package com.betha.teste.handler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.betha.teste.domain.ErroDetalhado;
import com.betha.teste.services.exceprions.ProdutoException;

@ControllerAdvice
public class ResourceExceptionHandler {
	
	@ExceptionHandler(ProdutoException.class)
	public ResponseEntity<ErroDetalhado> handlerFuncionarioException(ProdutoException e, HttpServletRequest request){
		
		ErroDetalhado erro = new ErroDetalhado();
		erro.setTitulo("O produto não encontrado.");
		erro.setStatus(404L);
		erro.setMensagemDesenvolvedor("http://erros.produto.com.br/404");
		erro.setTimestamp(System.currentTimeMillis());
		
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(erro);
	}
}
