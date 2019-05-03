package CECS277Lab9;

/*
 * interface called OrderVisitorInterface
 */
public interface OrderVisitorInterface{
	
	/**
	 * abstract method that visits and outputs information of the BuyPizza object
	 * @param pizza - BuyPizza object
	 */
	public abstract void visit(BuyPizza pizza);
	
	/**
	 * abstract method that visits and outputs information of the BuyCake object
	 * @param cake - BuyCake object
	 */
	public abstract void visit(BuyCake cake);
	
}
