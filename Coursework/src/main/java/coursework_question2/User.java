package coursework_question2;
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


public class User {
	//The full name of an user.
	private String fullname=null;
	
	//A Regular Expression for a first name and surname.
	private static final String regEX ="([A-Z]{1}[a-z]*) ([A-Z]{1}[a-z]*)";
	
	/**
	 * Create an user information.
	 * 
	 * @param fullname 	The full name of an user.
	 * @throws IllegalArgumentException
	 */
	public User(String fullname) throws IllegalArgumentException{
		super();
		/** Validation **/
		//If Else condition to check whether does the input parameter fullname has matches the regular expression.
		if(fullname.matches(regEX)) {
			
			//If the condition is true the value of a parameter will be initialize .
			
			this.fullname = fullname;
			
		}else  { 
			
			//If condition is false the IllegalArgumentException is throw
			
			throw new IllegalArgumentException();
			
		}
	}

	
	/**
	 * @return only first name of an User
	 */
	public String getName() {
		
		//StringBuffer is create to store value of each character of first name.
		StringBuffer firstname = new StringBuffer();
		
		//Loop a through all the value of array character stored in String fullname.
		for(int i=0;i<this.fullname.length();i++) {
			
			//Condition Statement to check whether the character at index i is not equal to empty space.
			if(this.fullname.charAt(i)!=' ') {
				
				//If the condition is true the character at index i is add to StringBuffer firstname.
				firstname.append(this.fullname.charAt(i));
				
			}else {
				
				//If the condition is false exit the loop.
				break;
				
			}
			
		}	
		//Return a String value by using .toString method to convert StringBuffer value to String literal
		return firstname.toString();
	}

	
	/*
	 * @return a value of fullname.
	 */
	@Override
	public String toString() {
		return  fullname ;
	}

		
}
