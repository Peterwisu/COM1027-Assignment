package lab4_exercise1;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Wish Suhartidamrong
 * 
 */
public class Neighbourhood {
   //Array of an House object
	private House[] houses = new House[3];
	
	/**
	 * Constructor to initialized a House's oject to Array.
	 * 
	 */
	 public Neighbourhood() {
		 this.houses[0]= new House(3,4);
		 this.houses[1]= new House(5,1);
		 this.houses[2]= new House(7,2);
	 }
	
	 /**
	  * 
	  * @param i index of an Array House
	  * @return House object at index i
	  */
	public House getHouses(int i) {
		return this.houses[i];
	
	}


	/**
	 * 
	 * @param i    i index of an Array House.
	 * @param numberOfHouse  House number.
	 * @param numberBottles the number of milk bottles required.
	 */
	public void setHouses(int i,int numberOfHouse,int numberBottles) {
		this.houses[i].setNumberOfHouse(numberOfHouse);
		this.houses[i].setNumberBottles(numberBottles);
	}
	
	/**
	 * 
	 * @return Total number of milk bottles required.
	 */
	public int calculateTotal() {
		int Total=0;
		for(int i=0; i<= 2 ;i++) 
		{
			Total=Total+ houses[i].getNumberBottles();
		}
		return Total;
	}
	/**
	 * Method to return a value of bottle in each house and to total number of bottles to be delivered.
	 * 
	 * @return a String value which show all a value of a House array in format and show a total number of bottles to be delivered.
	 */
	public String displayArray() {
		String display="";
		for(int i =0;i<this.houses.length;i++ ) 
		{	
			
		display+=("Number of bottles in House number " +houses[i].getNumberOfHouse() + " is " + houses[i].getNumberBottles()+"\n");
		
		}
		display+=("Total number of bottles to be delivered: "+calculateTotal());
		
		return display;
	}
	

		
		



}
