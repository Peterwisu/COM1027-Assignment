package lab3_exercise2;
/**
 * 
 * A class create a salary object to be initialized and return its value and value of a calculated tax of salary.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class AnnualSalary {
	//amount of Salary
	private double salary=0;
	/**
	 * Constructor to allow outside class to create object of AnnualSalary class.
	 * 
	 */
	public AnnualSalary() {
			
	}
	/**
	 * 
	 * @return AnnualSalary .
	 */
	public double getSalary() {
		return salary;
	}
	/**
	 * 
	 * @param amount of Annualsalary.
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}
	/**
	 * A method to return a value Tax to be paid
	 * 
	 * @return value of Tax. 
	 */
	public double calculateTax() {
		double personalAllownace =12509.00;
		double BasicRate =0.2;	
		double HighRate =0.4;
		double Taxable = salary-personalAllownace; 
		double Tax=0.00;
		
		if(salary>=12500.00 &&salary <=50000.00) { //if salary is between 12500 to 50000.
			Tax=(Taxable*BasicRate);    //tax = taxable*0.2.
		}
		else if(salary>=50000.00 && salary<=150000.00) { //if salary is between  50000 to 100000.
			Tax=(37500.00*BasicRate)+((Taxable-37500)*HighRate);	//tax = ((37500.00*0.2)+(taxable-37500)*0.4).
		}
		else if(salary<12500.00){ // if salary below 12500 no tax.
			Tax=0;	
		}
		return Tax;

	}

}
