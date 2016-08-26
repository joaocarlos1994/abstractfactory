package br.com.abstractfactory;

public abstract class Produto {
	
	private final TipoProduto tipoProduto;
	private final String Marca;
	private final double valor;
	
	public Produto(TipoProduto tipoProduto, String marca, double valor) {
		super();
		this.tipoProduto = tipoProduto;
		Marca = marca;
		this.valor = valor;
	}

	public TipoProduto getTipoProduto() {
		return tipoProduto;
	}

	public String getMarca() {
		return Marca;
	}

	public double getValor() {
		return valor;
	}
	
	public abstract Produto getInstance();
	
}
