package CECS277Lab9;

/*
 * class called TestAdapter that implements FullNameInterface
 * converts the interface NameInterface to FullNameInterface
 */
public class TestAdapter implements FullNameInterface{
	
	/**
	 * private variables for simpleName, fist name, and last name
	 */
	private SimpleName n;
	private String firstName;
	private String lastName;
	
	/**
	 * argument constructor
	 * @param sn - simple name object
	 */
	TestAdapter(SimpleName sn){
		n = sn;
		firstName = n.getName().split(" ")[0];
		lastName = n.getName().split(" ")[1];
	}
	
	/**
	 * setter for first name
	 * @param f - first name
	 */
	public void setFirstName(String f){
		firstName = f;
	}
	
	/**
	 * setter for last name
	 * @param l - last name
	 */
	public void setLastName(String l){
		lastName = l;
	}
	
	/**
	 * getter for first name
	 * @return first name
	 */
	public String getFirstName(){
		return firstName;
	}
	
	/**
	 * getter for last name
	 * @return last name
	 */
	public String getLastName(){
		return lastName;
	}

}
