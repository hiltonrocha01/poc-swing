package br.com.aevc.pocswing.model;

import java.util.List;

public class Venda {	
	
	private final static String NOME_DA_MINHA_LOJA = "SUPER EDMELIO";
	private static String NOME_DA_MINHA_LOJA_2;
	
	private final Usuario usuario;
	private final Comprador comprador;
	private final List<Produto> produtos;
	
	public Venda(Usuario usuario, Comprador comprador, List<Produto> produtos) {
		this.usuario = usuario;
		this.comprador = comprador;
		this.produtos = produtos;
	}
	
	public void vender() {
		System.out.println("Realizando venda");
	}
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	
	public Comprador getComprador() {
		return comprador;
	}
	
	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	
	
}
