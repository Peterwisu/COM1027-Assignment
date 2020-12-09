package lab10_exercise2;



/**
 * Interface 
 * 
 * @author Wish Suharitdamrong
 *
 */
public interface IGuest {
	
	/**
	 *  Add a new charge to a charge arraylist. 
	 */
	public abstract void addCharge(Service service,double charge) ;
	/**Calculate total charge without VAT
	 * 
	 * @return a charge without VAT
	 */
	public  abstract double calculateTotalChargeWithoutVAT();
	/**Calculate total charge with VAT
	 * 
	 * @return charge with VAT
	 */
	double calculateVATChargeAtRate(VATRate rate);
		
	/** Display a detail of guest in sepecific format.
	 * 
	 * @return a String value of a detail of guest in specific format.
	 */
	public abstract String toString() ;

	
	
	

}
