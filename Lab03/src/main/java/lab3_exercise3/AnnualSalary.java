package lab3_exercise3;

public class AnnualSalary {
	
	private double salary;
	
	public AnnualSalary() {
		super();	
		
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public double calculateTax() {
		double personalAllownace =12509.00;
		double BasicRate =0.2;
		double HighRate =0.4;
		double Taxable = salary-personalAllownace;
		double Tax=0.00;
		if(salary>=12500.00 &&salary <=50000.00) {
			Tax=(Taxable*BasicRate);
		}
		else if(salary>=50000.00 && salary<=150000.00) {
			Tax=(37500.00*BasicRate)+((Taxable-37500)*HighRate);	
		}
		else if(salary<12500.00){
			Tax=0;	
		}
		return Tax;

	}

}
