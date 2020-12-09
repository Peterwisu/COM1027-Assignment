package lab5_exercise3;
/**
 * This Class display a name of charater in specific format example K. Cobain
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Customer {
	//name of customer
	private String name=null;
	//surname of customer
	private String surname=null;
	
	/**
	 * 
	 * @param name of customer
	 * @param surname of customer
	 */
	public Customer(String name,String surname) {
		this.name = name;
		this.surname = surname;
	}
	/**
	 * 
	 * @return first letter of the name of customer
	 */
	public char getName() {
		char nameshort;
		nameshort=name.charAt(0); // get a charcater value  at index 0 from String(Array of Charcter) name.
		return nameshort;
	}
	/**
	 * 
	 * 
	 * @return surname of customer
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * 
	 *  @return String value in a format [first letter of the name of customer]. [surname]
	 */
	@Override
	public String toString() {
		String display;
		display=  this.getName() + ". " + this.getSurname() ;
		return display;
	}

	


	
}
