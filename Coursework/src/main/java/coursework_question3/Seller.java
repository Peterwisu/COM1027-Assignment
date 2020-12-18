package coursework_question3;
/**
 *  Seller.java
 *  
 *  This class validate a details and attribute of a Seller and define it in a constructorand convert a name of Seller in specific format.
 *  This class extends to abstract class User.java .
 *  
 * @author Wish Suharitdamrong
 *
 */
public class Seller extends User{
	//Full name of a seller.
	private String fullname;
	//Regular expression for a validation of seller name
	private static final String regEX ="([A-Z]{1}[a-z]*) ([A-Z]{1}[a-z]*)";
	/**
	 * Constructor required name of a seller.
	 * 
	 * @param fullname of buyer
	 * @throws IllegalArgumentException
	 */
	public Seller(String fullname)throws IllegalArgumentException{
		super();
		/** Validation **/
		//if name is null or doesn't match regular expression throw IllegalArgumentException.
		if(fullname==null ||!(fullname.matches(regEX))) {
			throw new IllegalArgumentException();
		}else {
		//if name is not null and match regular expression the value of name is initialize.
		this.fullname = fullname;
		}
	}
	
	
	
	/**Display a name of a seller in specific format ,example: Kurt C. () .
	 * 
	 * @return name of a seller in a format.
	 */
	@Override
	public String toString() {
		StringBuffer display = new StringBuffer();
		for(int i=0;i<this.fullname.length();i++) {
			//while the character value in at index i of a fullname is not empty or black space add a value to Stringbuffer object.
			if(this.fullname.charAt(i)!=' ') {
				display.append(this.fullname.charAt(i));
				
			}else {//if the value in at index i of a fullname is empty or blank space
				
				display.append(" ");
				//add a character at index  i+1 which will be fisrt letter of surname according to regular expression
				display.append((this.fullname.charAt(i+1)));
				//add . () after the letter at index+1
				display.append(". ()");
				break;
			}
			
		}	
		return display.toString();
	}
	
	
	/**Method to get only first name of a Seller
	 * 
	 * @return firstname of a seller
	 */
	@Override
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
}
