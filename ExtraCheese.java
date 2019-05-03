package CECS277Lab9;

/*
 * class called Pepperoni that extends PizzaDecorator
 */
public class ExtraCheese extends PizzaDecorator{
	
	/**
	 * argument constructor
	 * @param p - pizza object
	 */
	public ExtraCheese(Pizza p){
		super(p);
	}
	
	/**
	 * method to make the pizza 
	 * @return message saying pizza with extra cheese is being made
	 */
	public String makePizza(){
		return specialPizza.makePizza() + " with Extra Cheese";
	}

}
