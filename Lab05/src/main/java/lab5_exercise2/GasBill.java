package lab5_exercise2;
import java.text.DecimalFormat;
/**
 * 
 * This Class display a details of gas bill of a customer 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class GasBill {
	//account no. of a Gasbill
	private String accountNumber=null;
	//amount of gas bill
	private double amount=0;
	//Cunstomer of gasbill
	private Customer customer=null;
	/**
	 * 
	 * @param accountNumber of a Gasbill
	 * @param amount of a Gasbill
	 * @param customer of a Gasbill
	 */
	public GasBill(String accountNumber,double amount,Customer customer) {
		this.accountNumber =accountNumber;
		this.amount =amount;
		this.customer = customer;
		 }
	/**
	 * 
	 * @return accountNumber of a Gasbill
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * 
	 * @return boolean whether the account number matches a regular expression or not
	 */
	public boolean checkAccountAccuracy() {
		//compare accountNumber to format in regular expression  return boolean value if it matches return true not return false.
	boolean match= accountNumber.matches("[(0-9)]{4}"+"-"+"[(0-9)]{4}"+"-"+"[(0-9)]{4}");
	
	return match;
	}
	/**
	 * 
	 * 
	 * @return The name of a customer
	 */
	public String getCustomer() {

		return customer.toString();
	}
	/**
	 * Method to return and covert a amount to pay for a gas bill on decimal format.
	 * 
	 * @return 
	 */
	public String displayAmountDue() {
		
		String format;
		//create DecimalFormat for two decimal places in a amount value
		DecimalFormat style = new DecimalFormat("#.00");
	
		format = style.format(amount); // use style.format to change a format to .00
		return format;
		}
	/**
	 * Method to return Account Details of a GasBill.
	 * 
	 * @return String value contain detail of a Gasbill consist of amount and account no. and also  name of a customer.
	 */
	public String displayAccountDetails() {
		String display;
		//if checkAccountAccuracy() is false means account nunmber format is invalid
		if(!checkAccountAccuracy()) {
									//Instead of display account number  display "Invalid Account" .
			display= "Gas Bill\n" + " Account Number:Invalid Account\n" + " Customer:"+this.customer.toString()+"\n" + " Amount due:"+this.displayAmountDue();
		}else { 
			display= "Gas Bill\n" + " Account Number:"+this.getAccountNumber()+"\n" + " Customer:"+this.customer.toString()+"\n" + " Amount due:"+this.displayAmountDue();
		}
		return display;

			
		
	}
	
}
