package CECS277Lab9;

/*
 * class called CakeA that extends Cake
 */
public class CakeA extends Cake{
	
	/**
	 * constructor for CakeA
	 */
	public CakeA(){
		setName("Strawberry Cheesecake");
		setType("butter");
		setPrice(18);
	}
	
	/**
	 * output the recipe for CakeA
	 */
	public void recipe(){
		System.out.println("Making the Strawberry Cheesecake");
	}
	
	/**
	 * output the comments for CakeA
	 */
	public void comments(){
		System.out.println("Comments: Enjoyed by everyone!");
	}
	
}
