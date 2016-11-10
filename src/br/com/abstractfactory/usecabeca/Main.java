package br.com.abstractfactory.usecabeca;


/**
 * O Padrao Factory Method define uma interface para criar uma interface para
 * criar um objeto, mas permite as classes decidir qual classe instanciar. O
 * Factory Method permite a uma classe deferir a instanciacao para subclasses.
 * */
public class Main {

	public static void main(String[] args) {
		
		final PizzaStore nyStore = new NyStylePizzaStore();
		final Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("Ethan ordered a " + pizza.getName());

	}

}
