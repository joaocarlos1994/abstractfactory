package br.com.abstractfactory;

public class Notebook extends Produto {

	public Notebook() {
		super(TipoProduto.NOTEBOOK, "SANSUMG", 1000);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Produto getInstance() {
		// TODO Auto-generated method stub
		return this;
	}
	
	
	
}
