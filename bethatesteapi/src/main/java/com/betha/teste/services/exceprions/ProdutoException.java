package com.betha.teste.services.exceprions;

public class ProdutoException extends RuntimeException {

	private static final long serialVersionUID = 593623720673044742L;

	public ProdutoException(String mensagem) {
		super(mensagem);
	}
	
	public ProdutoException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}
}
