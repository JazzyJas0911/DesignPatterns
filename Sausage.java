package CECS277Lab9;

/*
 * class called Sausage that extends PizzaDecorator
 */
public class Sausage extends PizzaDecorator{
	
	/**
	 * argument constructor
	 * @param p - pizza object
	 */
	public Sausage(Pizza p){
		super(p);
	}
	
	/**
	 * method to make the pizza 
	 * @return message saying pizza with sausage is being made
	 */
	public String makePizza(){
		return specialPizza.makePizza() + " with Sausage";
	}

}
