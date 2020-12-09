package lab10_exercise3;
/**
 * 
 * This class validate a detail of a service
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Service {

	//code of a service
	String code=null;
	//name of service
	String name=null;
	private VATRate rate=null;
	//Standard charge 
	private double standardCharge=0;
	//regular expression of for a code of a service
	private static final String regex="[A-Z]{4}[0-9]{4}";
	
	public Service (String code, String name,VATRate rate, double standardCharge)throws IllegalArgumentException{
		/**Validation for code of service*/
		
		//if code is null
		if(code==null) {
			//throw NullPointerException
			throw new NullPointerException();
		}
		//if code doesn't matches
		if(!code.matches(regex)) {
			//throw IllegalArgumentException
			throw new IllegalArgumentException();
		}
		/**Validation for code of service*/
		//if name is null
		if(name==null) {
			//throw NullPointerException
			throw new NullPointerException();
		}
		/**Validation for standard charge of service*/
		if(standardCharge<0) {
			//throw IllegalArgumentException
			throw new IllegalArgumentException();
		}
		
		this.code =code;
		this.name =name;
		this.rate =rate;
		this.standardCharge = standardCharge;
		
		
			
	}

	/**
	 * 
	 * @return
	 */
	public String getCode() {
		return code;
	}

	/**
	 * 
	 * @return
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return
	 */
	public VATRate getRate() {
		return rate;
	}
	/**
	 * 
	 * @return
	 */
	public double getStandardCharge() {
		return standardCharge;
	}


	
}
