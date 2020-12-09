package lab8_exercise3;
/**
 * An exception class used to indicate an invalid Surname.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class InvalidSurnameException  extends Exception{
	
	
  /** serialVersionUID */
	private static final long serialVersionUID = -956705286400984022L;

	/**
	 * Default constructor: fill in the message automatically.
	 */
	public InvalidSurnameException() {
		
		super("Invalid surname format");
		
		
	}
	
	/**
	 * Allow a specific message to be included.
	 * 
	 * @param message The specific message.
	 */
	public InvalidSurnameException(String surname) {
		
		super(surname);
	}
	
	
	
	
	

}
