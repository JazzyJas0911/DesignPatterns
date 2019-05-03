package CECS277Lab9;

/*
 * class called Pepperoni that extends PizzaDecorator
 */
public class Pepperoni extends PizzaDecorator{
	
	/**
	 * argument constructor
	 * @param p - pizza object
	 */
	public Pepperoni(Pizza p){
		super(p);
	}
	
	/**
	 * method to make the pizza 
	 * @return message saying pizza with Pepperoni is being made
	 */
	public String makePizza(){
		return specialPizza.makePizza() + " with Pepperoni";
	}

}
