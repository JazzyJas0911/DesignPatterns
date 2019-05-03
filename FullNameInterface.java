package CECS277Lab9;

/*
 * target interface called FullNameInterface
 */
public interface FullNameInterface{
	
	/**
	 * abstract method to set first name
	 * @param f - first name
	 */
	public abstract void setFirstName(String f);
	
	/**
	 * abstract method to set last name
	 * @param l - last name
	 */
	public abstract void setLastName(String l);
	
	/**
	 * abstract method to get first name
	 * @return first name
	 */
	public abstract String getFirstName();
	
	/**
	 * abstract method to get last name
	 * @return last name
	 */
	public abstract String getLastName();

}

