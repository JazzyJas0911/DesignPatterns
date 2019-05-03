package CECS277Lab9;

/*
 * class called PizzaDecorator that implements PizzaInterface
 */
public class PizzaDecorator implements PizzaInterface{
	
	/**
	 * protected variable for specialPizza
	 */
	protected Pizza specialPizza;
	
	/**
	 * argument constructor
	 * @param p - pizza object
	 */
	public PizzaDecorator(Pizza p){
		specialPizza = p;
	}
	
	/**
	 * method to go to class and make the pizza
	 */
	public String makePizza(){
		return specialPizza.makePizza();
	}

}
