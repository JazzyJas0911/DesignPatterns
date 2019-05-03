package CECS277Lab9;

/*
 * class called CakeB that extends Cake
 */
public class CakeB extends Cake{
	
	/**
	 * constructor for CakeB
	 */
	public CakeB(){
		setName("Tiramisu");
		setType("butterless");
		setPrice(18);
	}
	
	/**
	 * output the recipe for CakeB
	 */
	public void recipe(){
		System.out.println("Making the Tiramisu");
	}
	
	/**
	 * output the comments for CakeB
	 */
	public void comments(){
		System.out.println("Comments: Enjoyed by everyone!");
	}

}
