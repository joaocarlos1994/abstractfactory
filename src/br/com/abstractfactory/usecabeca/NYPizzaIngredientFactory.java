package br.com.abstractfactory.usecabeca;

import br.com.abstractfactory.usecabeca.ingredient.Cheese;
import br.com.abstractfactory.usecabeca.ingredient.Clam;
import br.com.abstractfactory.usecabeca.ingredient.Dough;
import br.com.abstractfactory.usecabeca.ingredient.FreshClams;
import br.com.abstractfactory.usecabeca.ingredient.Garlic;
import br.com.abstractfactory.usecabeca.ingredient.MarinaraSauce;
import br.com.abstractfactory.usecabeca.ingredient.Pepperoni;
import br.com.abstractfactory.usecabeca.ingredient.ReggianoCheese;
import br.com.abstractfactory.usecabeca.ingredient.Sauce;
import br.com.abstractfactory.usecabeca.ingredient.SlicedPepperoni;
import br.com.abstractfactory.usecabeca.ingredient.ThinCrustDough;
import br.com.abstractfactory.usecabeca.ingredient.Veggies;

public class NYPizzaIngredientFactory implements PizzaIndredientFactory {

	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}

	@Override
	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	@Override
	public Veggies[] createVeggies() {
		final Veggies[] veggies = {new Garlic()};
		return veggies;
	}

	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	@Override
	public Clam createClam() {
		return new FreshClams();
	}

}
