package lab8;

/**
 * A simple class used to test out exceptions.
 * 
 * 
 * @author Stella Kazamia
 */
public class Example2 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 * @throws InvalidAgeException 
	 */
	public static void main(String[] args) throws InvalidAgeException {
		// Create a person object with an invalid age.
		Person person = new Person("joe", "bloggs", -1);
		System.out.println(person);
	}
}
