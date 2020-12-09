/**
 * 
 */
package lab4_exercise1;

/**
 * @author Wish Suharitdamrong
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		House[] houses = new House[3];
		houses[0]= new House(3,4);
		houses[1]= new House(5,1);
		houses[2]= new House(7,2);
		Neighbourhood n1= new Neighbourhood();
		for(int i=0; i<= 2 ;i++) 
		{	
			
		System.out.println("Number of bottles in House number " +houses[i].getNumberOfHouse() + " is " + houses[i].getNumberBottles());
		
		}
		System.out.println("Total number of bottles to be delivered: "+n1.calculateTotal());
	}

}
