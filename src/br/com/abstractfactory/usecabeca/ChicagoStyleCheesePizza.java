package br.com.abstractfactory.usecabeca;

public class ChicagoStyleCheesePizza extends Pizza {
	
	public ChicagoStyleCheesePizza(String name, PizzaIndredientFactory pizzaIndredientFactory) {
		super(name, pizzaIndredientFactory);
	}

	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing" + getName());
		
	}

}
