package lab4_exercise1;

/**
 * A simple class used to demonstrate deficiencies in arrays.
 * 
 * @author Stella Kazamia
 * 
 */
public class Neighbourhood {
   
	private House[] houses = new House[3];
	
	
	 public Neighbourhood() {
		 this.houses[0]= new House(3,4);
		 this.houses[1]= new House(5,1);
		 this.houses[2]= new House(7,2);
	 }
	
	 
	public House getHouses(int i) {
		return this.houses[i];
	
	}



	public void setHouses(int i,int numberOfHouse,int numberBottles) {
		this.houses[i].setNumberOfHouse(numberOfHouse);
		this.houses[i].setNumberBottles(numberBottles);
	}
	
	public int calculateTotal() {
		int Total=0;
		for(int i=0; i<= 2 ;i++) 
		{
			Total=Total+ houses[i].getNumberBottles();
		}
		return Total;
	}
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
