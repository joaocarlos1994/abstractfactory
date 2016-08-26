package br.com.abstractfactory;

public class FabricaSaoJose extends FabricaFactory {

	@Override
	public Produto getInstance(TipoProduto tipoProduto) {
		
		if (getProdutosFabricado().containsKey(tipoProduto)) {
			
		}
		
		return null;
	}

}
