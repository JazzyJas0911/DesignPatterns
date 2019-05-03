package CECS277Lab9;

/*
 * class called CakeFactory that implements Factory
 */
public class CakeFactory implements Factory{
	
	/**
	 * Creates a cake based on what choice(A, B, or C) was chosen
	 */
	public Cake createCake(String cakeName){
		Cake cake = null;
		if(cakeName.equals("A"))
			cake = new CakeA();
		else if(cakeName.equals("B"))
			cake = new CakeB();
		else if(cakeName.equals("C"))
			cake = new CakeC();
		return cake;
	}

}
