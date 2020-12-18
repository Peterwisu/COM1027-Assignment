package coursework_question4;
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
	
	//Number of Automatic gear car sales
	private int Autosales=0;
	//Number of Manual gear car sales
	private int Manualsales=0;
	//Number of car sales
	private int sales=0;
	//Fullname of a seller
	private String fullname=null;
	//Regular expression for a validation of seller name
	private static final String regEX ="([A-Z]{1}[a-z]*) ([A-Z]{1}[a-z]*)";
	/**
	 * Constructor required name of a seller.
	 * 
	 * @param fullname
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
	
	/**This method will use condition statement to check a no. of car sale and provide a Rating Level depending on number of sale.
	 * 
	 * @return a String value containing detail of Rating Level in specific format.
	 */
	public String identifyRating() {
		StringBuffer display = new StringBuffer();
		//Check whether number of sale is equal to 0
		if(this.sales==0) {
			//If equal add a String value in specific format with number of sales and Rating level 0
			display.append("Sales: "+this.sales+", Rating: Level 0");
			//Check whether number of sale is more than 0 but less than equal to 5
		}else if(this.sales>0 &&this.sales<=5) {
			//If equal add a String value in specific format with number of sales and Rating level 1
			display.append("Sales: "+this.sales+", Rating: Level 1");
			//Check whether number of sale is more than equal to 6 but less than equal to 10
		}else if(this.sales>=6 &&this.sales<=10) {
			//If equal add a String value in specific format with number of sales and Rating level 2
			display.append("Sales: "+this.sales+", Rating: Level 2");
			//Check whether number of sale is more than 10
		}else if(this.sales>10) {
			//If equal add a String value in specific format with number of sales and Rating level 3
			display.append("Sales: "+this.sales+", Rating: Level 3");	
		}	
		return display.toString();
	}
	
	/**
	 * @return only first name of a seller
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
	
	
	/**Display a name of a seller in specific format ,example: Kurt C. (Sales: 0 , Rating Level: 0) .
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
				//add . () after the letter at index+1 and in bracket .() put a value of method identifyRating in a bracket
				display.append(". ("+this.identifyRating()+")");
				break;
			}			
		}	
		return display.toString();
	}
	
	
	/////////////////////////////////////////////////
	/*
	 * 
	 * Implement method apart from UML diagram in Question4
	 * 
	 */
	
	/**Increase a number of car sale from seller by 1
	 * 
	 */
	public void addsale() {
		this.sales+=1;
	}
	/**
	 * Increase a number of automatic gear car sale from seller by 1
	 * 
	 */
	public void addCarTypeAutoSold() {
		this.Autosales=this.Autosales+1;
	}
	/**Increase a number of manual gear car sale from seller by 1
	 * 
	 */
	public void  addCarTypeMannualSold() {
		this.Manualsales=this.Manualsales+1;
	}
	/**
	 * 
	 * @return  a number of car sale by seller
	 */
	public int getSales() {
		return sales;
	}
	/**
	 * 
	 * @return a number of automatic gear car sale by seller
	 */
	public int getAutosales() {
		return Autosales;
	}
	/**
	 * 
	 * @return a number of manual gear car sale by seller
	 */
	public int getManualsales() {
		return Manualsales;
	}
	
}