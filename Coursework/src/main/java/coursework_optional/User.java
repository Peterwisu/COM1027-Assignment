package coursework_optional;


/**
 * User.java
 * 
 * This class define a name attribute in the constructor of a class  
 * 
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */


public interface  User {
	
	
	
	/**
	 * @return only first name of an User
	 */
	public abstract String getName();

	
	/*
	 * @return a value of toString method from Buyer or Seller class
	 */
	@Override
	public abstract String toString();

		
}
