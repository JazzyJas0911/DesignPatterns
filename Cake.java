package CECS277Lab9;

/*
 * abstract class called Cake
 */
public abstract class Cake{
	
	/**
	 * private variables for name, type(butter or butter less), and price
	 */
	private String name;
	private String type;
	private int price;
	
	/**
	 * setter for name
	 * @param n - string value of name
	 */
	public void setName(String n){
		name = n;
	}
	
	/**
	 * getter for name
	 * @return name of cake
	 */
	public String getName(){
		return name;
	}
	
	/**
	 * setter for type
	 * @param t - string value of type
	 */
	public void setType(String t){
		type = t;
	}
	
	/**
	 * getter for type
	 * @return type of cake (butter or butter less)
	 */
	public String getType(){
		return type;
	}
	
	/**
	 * setter for price
	 * @param p - integer value of price
	 */
	public void setPrice(int p){
		price = p;
	}
	
	/**
	 * getter for price
	 * @return the amount the cake costs
	 */
	public int getPrice(){
		return price;
	}
	
	/**
	 * abstract methods for recipe and comments
	 */
	public abstract void recipe();
	public abstract void comments();
	
	/**
	 * output all information on the cake
	 */
	public void aboutCake(){
		System.out.println("Cake Name: " + name + 
				"\nType: " + type +
				"\nPrice: $" + price);
		comments();
		recipe();
	}

}
