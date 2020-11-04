package lab5_exercise2;
import java.text.DecimalFormat;
public class GasBill {
	private String accountNumber;
	private double amount;
	private Customer customer;
	
	
	public GasBill(String accountNumber,double amount,Customer customer) {
		this.accountNumber =accountNumber;
		this.amount =amount;
		this.customer = customer;
		 }
	
	public String getAccountNumber() {
		return accountNumber;
	}

	
	public boolean checkAccountAccuracy() {
	boolean match= accountNumber.matches("[(0-9)]{4}"+"-"+"[(0-9)]{4}"+"-"+"[(0-9)]{4}");
	
	return match;
	}
	
	

	public String getCustomer() {

		return customer.toString();
	}
	
	public String displayAmountDue() {
		double due;
		String format;
		DecimalFormat style = new DecimalFormat("#.00");
		due=amount;
		format = style.format(due);
		return format;
		}
	
	public String displayAccountDetails() {
		String display;
		if(!checkAccountAccuracy()) {
			display= "Gas Bill\n" + " Account Number:Invalid Account\n" + " Customer:"+this.customer.toString()+"\n" + " Amount due:"+this.displayAmountDue();
		}else {
			display= "Gas Bill\n" + " Account Number:"+this.getAccountNumber()+"\n" + " Customer:"+this.customer.toString()+"\n" + " Amount due:"+this.displayAmountDue();
		}
		return display;

			
		
	}
	
}
