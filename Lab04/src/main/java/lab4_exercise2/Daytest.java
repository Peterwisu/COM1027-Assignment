package lab4_exercise2;

public class Daytest {

	
	public static void main(String[]args) {
		
		
		Day day = new Day("MONDAY");
		day.setSession(0, "COM1027", 9, 10);
		
		System.out.println(day.getName());
		
		System.out.println(day.toString());
		
					
	}
	
}
