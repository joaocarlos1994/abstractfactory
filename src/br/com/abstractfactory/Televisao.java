package br.com.abstractfactory;

public class Televisao extends Produto {

	public Televisao() {
		super(TipoProduto.TELEVISAO, "SANSUMG", 2500);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Produto getInstance() {
		// TODO Auto-generated method stub
		return this;
	}

}
