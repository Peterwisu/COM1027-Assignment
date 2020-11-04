package lab5_exercise3;

public class Customer {

	private String name;
	private String surname;
	
	
	public Customer(String name,String surname) {
		this.name = name;
		this.surname = surname;
		
		
	}

	public char getName() {
		char nameshort;
		nameshort=name.charAt(0);
		return nameshort;
	}

	public String getSurname() {
		return surname;
	}

	@Override
	public String toString() {
		String display;
		display=  getName() + ". " + getSurname() ;
		return display;
	}

	


	
}
