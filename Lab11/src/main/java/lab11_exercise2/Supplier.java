package lab11_exercise2;
/**
 * This Class provide a validatipn for a input phone number of a supplier 
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Supplier {
	//name of a supplier.
	private String name;
	//phone number of a supplier.
	private String phone;
	//regular expression for a phone number.
	private String reg="[0]{1}[0-9]{10}";
	/**
	 * Constructor helps to validate a format of phone number.
	 * 
	 * @param name of a supplier
	 * @param phone of a supplier
	 * @throws IllegalArgumentException
	 */
	public Supplier(String name,String phone) throws IllegalArgumentException{
		super();
		//if the phone number matches regular expression. 
		if(phone.matches(reg)) {
			//assign value from input parameter to a field.
			this.name =name;
			this.phone=phone;
		}else if(!(phone.matches(reg))){
			//if not match throw IllegalArgumentException.
			throw new IllegalArgumentException();
		}else	if(this.name==null|| this.phone==null){
		
			//if either phone of name is null throw IllegalArgumentException.
			throw new IllegalArgumentException();
			}
	}
	/**Getter for name of a supplier.
	 * 
	 * @return name of a supplier.
	 */
	public String getName() {
		return name;
	}
	/**Getter for phone number of a supplier.
	 * 
	 * @return phone number of a supplier.
	 */
	public String getPhone() {
		return phone;
	}
	
	
	
	
	
}
