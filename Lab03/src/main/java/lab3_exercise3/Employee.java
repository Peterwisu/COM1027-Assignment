package lab3_exercise3;
/**
 * 
 * A Class to show all a detail of employee name, position ,salary and tax.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Employee {
	//First name of an employee
	private String forename=null;
	//Surname of an employee
	private String surname=null;
	//id of employee
	private int id=0;
	//position of employee
	private Position companyPosition=null;
	//salary of an employee
	private AnnualSalary salary=null;

	/**
	 * 
	 * @param id of a employee
	 * @param forename of an employee
	 * @param surname of an employee
	 * @param salary of an employee
	 * @param companyPosition of an employee
	 */
	public Employee(int id,String forename,String surname,AnnualSalary salary,Position companyPosition) {
	super();
	this.id =id;
	this.forename = forename;
	this.surname = surname;
	this.salary = salary;
	this.companyPosition =companyPosition;
	}
	/**
	 * 
	 * @return id of employee.
	 */
	public int getId() {
		return id;
	}
	/**
	 * 
	 * @return first name of a employee.
	 */
	public String getForename() {
		return forename;
	}
	/**
	 * 
	 * @return last name of of a employee.
	 */
	public String getSurname() {
		return surname;
	}
	/**
	 * 
	 * @return salary of a employee.
	 */
	public double getSalary() {
		return this.salary.getSalary();
	}
	/**
	 * 
	 * @return position of a employee.
	 */
	public String getPositionName() {
		return this.companyPosition.getRoleName();
	}
	
	
	
	
	
	
	/**
	 * 
	 * Method to return a fullname of employee.
	 * 
	 * @return a full name of employee.
	 */
	public String displayEmployeeName() {
		String Fullname;
		Fullname = this.surname + ", "+this.forename;
		return Fullname;
	}
	/**
	 * Method to check whether employee is eligible for bonus or not.
	 * 
	 * @return	boolean value whether employee is eligible for bonus or not.
	 */
	public boolean eligibleForBonus() {
		boolean bonus;
		if(this.salary.getSalary()>=40000) { // if salary is more than 40000 initialize bonus to true.
			bonus=true;
		}
		else
		{
			bonus=false;
		}
		return bonus;		
	}
	/**
	 * 
	 * Method to return a details of employee.
	 * 
	 * @return a String format containing employee name,id,position,salary,and tax.
	 */
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
