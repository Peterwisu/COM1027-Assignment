package lab5;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * 
 */
public class Example2 {

	public static void main(String[] args) {

		// Add your code here
		
		int p;
		for(int i =1 ;i<=6;i++) {
			p=i;
			for(int q=1;q<=4;q=q+1) {
				{
					
					System.out.print(p);
					p+=2;
				}
			}
			System.out.println();
		}
		
	}
}
