package CECS277Lab9;

/*
 * class called CakeC that extends Cake
 */
public class CakeC extends Cake{
	
	/**
	 * constructor for CakeC
	 */
	public CakeC(){
		setName("Mocha Java Cake");
		setType("butter");
		setPrice(18);
	}
	
	/**
	 * output the recipe for CakeC
	 */
	public void recipe(){
		System.out.println("Making the Mocha Java Cake");
	}
	
	/**
	 * output the comments for CakeC
	 */
	public void comments(){
		System.out.println("Comments: Enjoyed by everyone!");
	}

}
