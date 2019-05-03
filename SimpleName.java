package CECS277Lab9;

/*
 * adaptee class called SimpleName that implements NameInterface
 */
public class SimpleName implements NameInterface{
	
	/**
	 * private variable for name
	 */
	private String name;
	
	/**
	 * argument constructor
	 * @param n - name
	 */
	public SimpleName(String n){
		setName(n);
	}
	
	/**
	 * setter for name
	 * @param n - name
	 */
	public void setName(String n){
		name = n;
	}
	
	/**
	 * getter for name
	 * @return name
	 */
	public String getName(){
		return name;
	}

}
