package coursework_question3;
/**
 * User.java
 * 
 * This class is an abstract class of Buyer and Seller Class  
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
	 * Method to get only first name of an User.
	 * 
	 * @return only first name of an User.
	 */
	public abstract String getName();

	
	/*Display a name of an User in specific format.
	 * 
	 * @return a value of toString method from Buyer or Seller class.
	 */
	@Override
	public abstract String toString();

		
}
