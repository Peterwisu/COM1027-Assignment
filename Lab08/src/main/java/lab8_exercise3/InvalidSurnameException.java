package lab8_exercise3;

public class InvalidSurnameException  extends Exception{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -956705286400984022L;

	public InvalidSurnameException() {
		
		super("Invalid surname format");
		
		
	}
	
	public InvalidSurnameException(String surname) {
		
		super(surname);
	}
	
	
	
	
	

}
