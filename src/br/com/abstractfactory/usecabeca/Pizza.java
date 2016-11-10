package br.com.abstractfactory.usecabeca;

import br.com.abstractfactory.usecabeca.ingredient.Cheese;
import br.com.abstractfactory.usecabeca.ingredient.Clam;
import br.com.abstractfactory.usecabeca.ingredient.Dough;
import br.com.abstractfactory.usecabeca.ingredient.Pepperoni;
import br.com.abstractfactory.usecabeca.ingredient.Sauce;
import br.com.abstractfactory.usecabeca.ingredient.Veggies;

public abstract class Pizza {
	
	private final String name;
	private final Dough dought;
	private final Sauce sauce;
	private final Veggies[] veggies;
	private final Cheese cheese;
	private final Pepperoni pepperoni;
	private final Clam clam;
	
	protected Pizza(final String name, final PizzaIndredientFactory pizzaIndredientFactory) {
		super();
		this.name = name;
		this.dought = pizzaIndredientFactory.createDough();
		this.sauce = pizzaIndredientFactory.createSauce();
		this.veggies = pizzaIndredientFactory.createVeggies();
		this.cheese = pizzaIndredientFactory.createCheese();
		this.pepperoni = pizzaIndredientFactory.createPepperoni();
		this.clam = pizzaIndredientFactory.createClam();
	}
	
	protected void addToppings(final String topping){
		this.addToppings(topping);
	}
	
	public abstract void prepare();
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName(){
		return this.name;
	}
	
}
