package CECS277Lab9;

/*
 * class called BuyPizza that implements Product
 */
public class BuyPizza implements Product{
	
	/**
	 * private variables for title, price, and quantity
	 */
	private String title;
	private double price;
	private int quantity;
	
	/**
	 * argument constructor
	 * @param t - title
	 * @param p - price 
	 * @param q - quantity
	 */
	public BuyPizza(String t, double p, int q){
		title = t;
		price = p;
		quantity = q;
	}
	
	/**
	 * setter for title
	 * @param t - title
	 */
	public void setTitle(String t){
		title = t;
	}
	
	/**
	 * getter for title
	 * @return name of product
	 */
	public String getTitle(){
		return title;
	}
	
	/**
	 * setter for price
	 * @param p - price
	 */
	public void setPrice(double p){
		price = p;
	}
	
	/**
	 * getter for price
	 * @return cost of item
	 */
	public double getPrice(){
		return price;
	}
	
	/**
	 * setter for quantity
	 * @param q - quantity
	 */
	public void setQuantity(int q){
		quantity = q;
	}
	
	/**
	 * getter for quantity
	 * @return number bought for each item
	 */
	public int getQuantity(){
		return quantity;
	}
	
	/**
	 * method to allow visitor to visit methods and information in OrderVisitor
	 */
	public void accept(OrderVisitor visitor){
		visitor.visit(this);
	}

}

