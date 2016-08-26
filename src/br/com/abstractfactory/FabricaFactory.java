package br.com.abstractfactory;

import java.util.HashMap;
import java.util.Map;

public abstract class FabricaFactory {
	
	private final Map<TipoProduto, Produto> produtosFabricado;
	
	public FabricaFactory() {
		super();
		produtosFabricado = new HashMap<>();
	}

	public void adicionarProdutosFabricados(final Produto produto){
		produtosFabricado.put(produto.getTipoProduto(), produto);
	}

	public abstract Produto getInstance(final TipoProduto tipoProduto);

	public Map<TipoProduto, Produto> getProdutosFabricado() {
		return produtosFabricado;
	}

}
