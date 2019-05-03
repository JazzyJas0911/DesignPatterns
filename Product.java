package CECS277Lab9;

/*
 * interface called Product
 */
public interface Product{
	
	/**
	 * abstract method to accept access to the class OrderVisitor
	 * @param visitor - Object visiting other classes and methods
	 */
	public abstract void accept(OrderVisitor visitor);

}
