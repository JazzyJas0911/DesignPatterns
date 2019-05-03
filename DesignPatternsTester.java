package CECS277Lab9;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * tester to test a design using 4 different design patterns
 * Adapter Pattern
 * Decorator Pattern
 * Factory Pattern
 * Visitor Pattern
 */
public class DesignPatternsTester{

	public static void main(String[] args){

		int choice = 0;
		int nPizza = 0;
		int nCake = 0;
		Scanner keyboard = new Scanner(System.in);
		Scanner userInput = new Scanner(System.in);
		Cake c = null;
		CakeFactory cf = new CakeFactory();
		
		System.out.println("Welcome to our resturant! What is your name?");
		String name = keyboard.nextLine();
		SimpleName s = new SimpleName(name);
		TestAdapter d = new TestAdapter(s);
		
		while(choice != 3){
			System.out.println("Menu" +
					"\n1. Buy Pizza" +
					"\n2. Buy Cake" +
					"\n3. Checkout");
			choice = keyboard.nextInt();
			switch(choice){
				case 1:
					System.out.println("Pizza Menu:" +
							"\n0. Pepperoni" +
							"\n1. Sausage" +
							"\n2. Extra Cheese");
					choice = keyboard.nextInt();
					switch(choice){
						case 0:
							PizzaInterface pepperoni = new Pepperoni(new Pizza());
							System.out.println(pepperoni.makePizza());
							nPizza++;
							break;
						case 1:
							PizzaInterface sausage = new Sausage(new Pizza());
							System.out.println(sausage.makePizza());
							nPizza++;
							break;
						case 2:
							PizzaInterface extraCheese = new ExtraCheese(new Pizza());
							System.out.println(extraCheese.makePizza());
							nPizza++;
							break;
						default:
							System.out.println("Error! Invalid input!"); 
							break;
					}
					break;
				case 2:
					System.out.println("Cake Menu:" +
							"\nA: Strawberry Cheesecake" +
							"\nB: Tiramisu" +
							"\nC: Mocha Java Cake");
					String input = userInput.nextLine();
					c = cf.createCake(input);
					c.aboutCake();
					nCake++;
					break;
				case 3:
					System.out.println("Name: " + d.getFirstName() + " " + d.getLastName());
					List<Product> shoppingCart = new ArrayList<Product>();
					OrderVisitor visitor = new OrderVisitor();
					
					shoppingCart.add(new BuyPizza("Pizza", 10.00, nPizza));
					shoppingCart.add(new BuyCake("Cake", 18.00, nCake));
					
					System.out.println("Items\tQuantity\tPrice" + 
							"\n----------------------------------");
					for(Product p: shoppingCart){
						p.accept(visitor);
					}
					System.out.println("----------------------------------" +
							"\nCheckout total: $" + visitor.getTotalCost());
					break;
				default:
					System.out.println("Error! Please enter a valid option.");
					break;
			}
		}

	}

}
