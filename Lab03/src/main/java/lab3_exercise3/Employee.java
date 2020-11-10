package lab3_exercise3;

public class Employee {
	private String forename;
	private String surname;
	private int id;
	private Position companyPosition;
	private AnnualSalary salary;

	public Employee(int id,String forename,String surname,AnnualSalary salary,Position companyPosition) {
	super();
	this.id =id;
	this.forename = forename;
	this.surname = surname;
	this.salary = salary;
	this.companyPosition =companyPosition;
	}
	public int getId() {
		return id;
	}

	public String getForename() {
		return forename;
	}

	public String getSurname() {
		return surname;
	}

	public double getSalary() {
		return this.salary.getSalary();
	}
	
	public String getPositionName() {
		return this.companyPosition.getRoleName();
	}
	
	
	
	
	////////////////////////////////////////////////////////////
	
	
	
	public String displayEmployeeName() {
		String Fullname;
		Fullname = this.surname + ", "+this.forename;
		return Fullname;
	}
	public boolean eligibleForBonus() {
		boolean a;
		if(this.salary.getSalary()>=40000) {
			a=true;
		}
		else
		{
			a=false;
		}
		return a;		
	}
	@Override
	public String toString() {
		String display = null;
		if(eligibleForBonus()==true) {
			
			 display=this.displayEmployeeName()+" ("+this.getId()+"): "+this.companyPosition.getRoleName()+" at £"+this.salary.getSalary()+" (£"+this.salary.calculateTax()+" tax) and is eligible for bonus.";
			
			}else if (eligibleForBonus()==false){
				display=this.displayEmployeeName()+" ("+this.getId()+"): "+this.companyPosition.getRoleName()+" at £"+this.salary.getSalary()+" (£"+this.salary.calculateTax()+" tax) and is not eligible for bonus.";
			}
		return display;
	}
}
