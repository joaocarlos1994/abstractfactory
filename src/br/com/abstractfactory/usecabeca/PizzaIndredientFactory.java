package br.com.abstractfactory.usecabeca;

import br.com.abstractfactory.usecabeca.ingredient.Cheese;
import br.com.abstractfactory.usecabeca.ingredient.Clam;
import br.com.abstractfactory.usecabeca.ingredient.Dough;
import br.com.abstractfactory.usecabeca.ingredient.Pepperoni;
import br.com.abstractfactory.usecabeca.ingredient.Sauce;
import br.com.abstractfactory.usecabeca.ingredient.Veggies;

public interface PizzaIndredientFactory {
	
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Veggies[] createVeggies();
	public Pepperoni createPepperoni();
	public Clam createClam();
	
}
