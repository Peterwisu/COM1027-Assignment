package lab10_exercise2;

import java.util.ArrayList;
import java.util.List;
/**
 * This class implement a interface class IGuest
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Guest  implements IGuest{
	//first name of a guest
	private String forename=null;
	//last name of a guest
	private String surname=null;
	//address of a guest
	private String address=null;
	//telephone number of guess
	private String telephone=null;
	//list of charge
	private List<Charge> charges;
	/**
	 * 
	 * @param forename
	 * @param surname
	 * @param address
	 * @param telephone
	 */
	public Guest(String forename,String surname, String address, String telephone) {
		
		this.forename = forename;
		this.surname = surname;
		this.address = address;
		this.telephone =telephone;
		//define arraylist
		this.charges = new ArrayList<Charge>();
		
	}
	/**
	 * 
	 * @return
	 */
	public String getForename() {
		return forename;
	}
	/**
	 * 
	 * @return
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * 
	 * @return
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * 
	 * @return
	 */
	public String getTelephone() {
		return telephone;
	}
	/**
	 * 
	 * @return
	 */
	public List<Charge> getCharges() {
		return charges;
	}
	/**
	 *  Add a new charge to a charge arraylist.
	 *  
	 */
	@Override
	public void addCharge(Service service, double charge) {
		
		Charge newcharge = new Charge(service,charge);
		this.charges.add(newcharge);
		
	}
	

	/**Calculate total charge without VAT
	 * 
	 * @return a charge without VAT
	 */
	@Override
	public double calculateTotalChargeWithoutVAT() {
		double total=0;
		return total;
	}
	
	
	/**Calculate total Vat charge 
	 * 
	 * @return VAT Charge
	 */
	@Override
	public double calculateVATChargeAtRate(VATRate rate) {
		double charge =0;
		return charge;
	}
	
	/** Display a detail of guest in sepecific format.
	 * 
	 * @return a String value of a detail of guest in specific format.
	 */
	@Override
	public String toString() {
		return "Guest [forename=" + forename + ", surname=" + surname + ", address=" + address + ", telephone="
				+ telephone + ", charges=" + charges + "]";
	}
	
	

	
	
	
}
