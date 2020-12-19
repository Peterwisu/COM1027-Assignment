package coursework_question4;
/**
 * Offer.java
 * 
 * 
 * This class define an attribute of an offer from buyer in a constructor and validate its value.
 * 
 * @author Wish Suharitdamrong
 * 
 */
public class Offer {

	//The value of an offer.
	private double value=0;
	//The type of a user.
	private User buyer=null;
	
	
	/**
	 * @create a offer information for an offer.
	 * 
	 * 
	 * @param buyer 	for user's offer.
	 * 
	 * @param value 	for a an offer.
	 * @throws IllegalArgumentException
	 */
	public Offer(User buyer ,double value) throws IllegalArgumentException{
		super();
		/** Validation **/
		//Check the input values of buyer and value whether it is in incorrect format and range.
		if(buyer==null||value<0) {
			
			//If either buyer or value is in incorrect format or range the IllegalArgumentException is throw
			throw new IllegalArgumentException();
			
		} else  {
		
		//If format and range of the parameter is correct and pass validation the value is initialize.
		this.buyer = buyer;
		this.value = value;
		
		}
		
	}

	
	/**
	 * 
	 * @return The user of this offer
	 */
	public User getBuyer() {
		return buyer;
	}
	
	/**
	 * 
	 * @return The value of this offer
	 */
	public double getValue() {
		return value;
	}

	/**
	 * 
	 * @return the name of a user and value of offer with £ symbol in string format 
	 */
	@Override
	public String toString() {
		return this.buyer+" offered "+ "£"+this.value;
	}

	
	
	
	
}
