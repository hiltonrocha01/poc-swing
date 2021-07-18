package br.com.aevc.pocswing.model;

import java.util.List;

public class VendaOnline extends Venda {

	private List<String> carrinhoDeCompras;
	
	public VendaOnline(Usuario usuario, Comprador comprador, List<Produto> produtos) {
		super(usuario, comprador, produtos);
	}
	
	@Override
	public void vender() {
		// TODO Auto-generated method stub
//		super.vender();
		System.out.println("Realizando venda online");
	}

	public List<String> getCarrinhoDeCompras() {
		return carrinhoDeCompras;
	}

	public void setCarrinhoDeCompras(List<String> carrinhoDeCompras) {
		this.carrinhoDeCompras = carrinhoDeCompras;
	}
	
	
	
}
