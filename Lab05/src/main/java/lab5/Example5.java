package lab5;

public class Example5 {
	
	public static void main(String[]args) {
		// Define a reference number which must start with "HO" followed by 4 digits.
		String reference = "HO1234-5678";
		boolean foundMatch = reference.matches("(HO)([0-9]{4})"+"-"+"([0-9]{4})"); {
		if (foundMatch) {
		System.out.println("Reference number is valid");
		}
		else {
		System.out.println("Reference number is NOT valid");
		}
	}}

}
