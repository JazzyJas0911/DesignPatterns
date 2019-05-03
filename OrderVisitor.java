package CECS277Lab9;

/*
 * class called OrderVisitor that implements OrderVisitorInterface
 */
public class OrderVisitor implements OrderVisitorInterface{
	
	/**
	 * private variable for total cost
	 */
	private double totalCost;
	
	/**
	 * method that visits and outputs information of the BuyPizza object
	 * @param pizza - BuyPizza object
	 */
	public void visit(BuyPizza pizza){
		double cost = pizza.getPrice() * pizza.getQuantity();
		totalCost += cost;
		System.out.println(pizza.getTitle() + "\t" + pizza.getQuantity() + "\t\t$" + cost);
	}
	
	/**
	 * method that visits and outputs information of the BuyCake object
	 * @param cake - BuyCake object
	 */
	public void visit(BuyCake cake){
		double cost = cake.getPrice() * cake.getQuantity();
		totalCost += cost;
		System.out.println(cake.getTitle() + "\t" + cake.getQuantity() + "\t\t$" + cost);
	}
	
	/**
	 * getter for total cost of items
	 * @return total of all items bought
	 */
	public double getTotalCost(){
		return totalCost;
	}

}
