package lab10_exercise1;
/**
 * 
 * This class calculate value of a vat  of a service.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Charge {

	//Service of a charge
	private Service service=null;
	//charge amount
	private double charge=0;
	
	/**
	 * 
	 * @param service
	 * @param charge
	 */
	public Charge(Service service,double charge) {
		super();
		this.service =service;
		this.charge  =charge;
		
	}
	/**
	 * 
	 * @return
	 */
	public Service getService() {
		return service;
	}
	/**
	 * 
	 * @return
	 */
	public double getCharge() {
		return charge;
	}
	/**Calculate a vat
	 * 
	 * @return VAT
	 */
	public double calculateVAT() {
		
		
		
		return  this.service.getRate().getRate();
	}
}
