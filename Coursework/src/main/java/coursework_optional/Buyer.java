package coursework_optional;
/**
 *  Buyer.java
 *  
 *  This class validate a details and attribute of a Buyer and define it in a constructorand convert a name of Buyer in specific format.
 *  This class extends to abstract class User.java .
 *  
 * @author Wish Suharitdamrong
 *
 */
public class Buyer implements User {
	//Age of a buyer.
		private int age;
		//Fullname of buyer.
		private String fullname;
		//Regular expression for a validation of buyer name.
		private static final String regEX ="([A-Z]{1}[a-z]*) ([A-Z]{1}[a-z]*)";
		/**
		 * Constructor required name of a buyer.
		 * @param name of buyer
		 * @param age of buyer
		 * @throws IllegalArgumentException
		 */
		public Buyer(String name, int age)throws IllegalArgumentException {
			super();
			/** Validation **/
			//if name doesn't match regular expression throw IllegalArgumentException.
			if(!(name.matches(regEX))) {
			throw new IllegalArgumentException();
			}else if(age<18) {//if age less than 18  throw IllegalArgumentException.
				throw new IllegalArgumentException();
			}else
			{	
			//if value pass both validation value is initialize.
			this.fullname =name;
			this.age = age;
			}
		}

	public int getAge() {
		return age;
	}

	/**
	 * @return only first name of an User
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
    /**
     * @return The String name in format "(A-Z)***(a-z)"
     * 
     */
	@Override
	public String toString() {
		
		//Create Character to store first letter of the name
		char Firstletter =this.getName().charAt(0);
		//Create Character to store the last letter of the name
		char Lastletter =this.getName().charAt(this.getName().length()-1);
		
		
		return Firstletter+"***"+Lastletter;
	}
	
	
	
	
	
	

}
