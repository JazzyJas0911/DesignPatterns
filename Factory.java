package CECS277Lab9;

/*
 * interface called Factory
 */
public interface Factory{
	
	/**
	 * creates a cake based on cakeName
	 * @param cakeName - type of cake selected
	 * @return Cake object
	 */
	Cake createCake(String cakeName);

}
