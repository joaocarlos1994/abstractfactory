package br.com.abstractfactory.usecabeca;

public class NyStylePizzaStore extends PizzaStore {
	
	private Pizza pizza;
	private static final PizzaIndredientFactory 
				pizzaIndredientFactory = new NYPizzaIngredientFactory();

	@Override
	protected Pizza createPizza(String type) {
		
		if (type.equals("cheese")) {
			this.pizza = new NYStykeCheesePizza("Cheese", pizzaIndredientFactory);
		} 
		
		return pizza;
	}
	
	
	
}
