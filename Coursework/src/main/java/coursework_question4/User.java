package coursework_question4;
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


public abstract class User {
	
	//The full name of an user.
	private String fullname=null;
	
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
