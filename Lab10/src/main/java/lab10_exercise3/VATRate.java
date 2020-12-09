package lab10_exercise3;

/**
 * Enum class contain constant a rate of a vat
 * 
 * @author Wish Suharitdamrong
 *
 */
public enum VATRate {
	
	
	
	
	ZERO(0),LOW(5),STANDARD(17.5);
	//rate of vat
	private double vatrate;
	/**
	 * 
	 * @param rate of vat
	 */
	private VATRate(double rate) {
		this.vatrate = rate;
	}
	/**
	 * 
	 * @return rate of vat
	 */
	public double getRate() {
		return vatrate;
	}
	
	
}