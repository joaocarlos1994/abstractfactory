package br.com.abstractfactory.usecabeca;

public class NYStykeCheesePizza extends Pizza {

	public NYStykeCheesePizza(final String name, final PizzaIndredientFactory pizzaIndredientFactory) {
		super(name, pizzaIndredientFactory);
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + getName());
	}
	
	

}
