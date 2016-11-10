package br.com.abstractfactory.usecabeca;

public class ChicagoStylePizzaStore extends PizzaStore {

	private Pizza pizza;
	
	@Override
	protected Pizza createPizza(String type) {
		if (type.equals("cheese")) {
			//Nesse caso deveria ser a fabrica de ingredientes de Chicago, nao de NY
			this.pizza = new ChicagoStyleCheesePizza("Cheese", new NYPizzaIngredientFactory());
		}
		return pizza;
	}

}
