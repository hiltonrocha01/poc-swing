package br.com.aevc.pocswing.model;

import java.util.List;

public class VendaLocal extends Venda {

	public VendaLocal(Usuario usuario, Comprador comprador, List<Produto> produtos) {
		super(usuario, comprador, produtos);
	}
	
	public void vender(){
		System.out.println("Realizando venda local");
	}
	
}
