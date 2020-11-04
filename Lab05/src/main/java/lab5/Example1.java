package lab5;
/**
 * Example1.java
 */

/**
 * A simple class used to explore arrays and loops.
 * 
 * @author Stella Kazamia
 */
public class Example1 {

	/**
	 * Main entry point: this is the first method that is run.
	 * 
	 * @param args The command line arguments.
	 */
	public static void main(String[] args) {
		// declaration of new array with 3 elements of type String
		String[] names = new String[3];
		names[0] = "Stella";
		names[1] = "Junaid";
		names[2] = "Mariyah";

		// declaration of new array with 3 elements of type double
		double[] grades = new double[3];
		grades[0] = 50;
		grades[1] = 60;
		grades[2] = 75;

		// print all elements within the names array
		for(int i=0;i<=2;i++) {
		System.out.println(names[i]);
		}
		// Start a new line for the next set of elements
		System.out.println();
		for(int i=0;i<=2 ;i++) {
		// print all elements within the grades array
		System.out.println(grades[i]);
		}
		// empty line
		System.out.println();

		// print combination of two arrays
		for(int i=0;i<=2 ;i++) {
		System.out.println(names[i] + " achieved " + grades[i] + "%");
		}
	}
}