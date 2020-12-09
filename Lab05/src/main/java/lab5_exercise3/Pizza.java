package lab5_exercise3;
import java.util.ArrayList;
import java.util.List; 
/**
 * 
 * A Class use for adding a value and number of topping on pizza and caluculate a price for one pizza depending on topping
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Pizza {

	
	
	// Arraylist of a toppings on pizza
	private List<String> toppings;
	/**
	 * 
	 * Constructor to initialize topping arraylist
	 * 
	 */
	public Pizza() {
		//define arraylist
		this.toppings= new ArrayList<String>();
	}
	
	
	
	/**
	 * Metgod to add a topping of pizza
	 * 
	 * @param toppings array of pizza's topping.
	 */
	public void addToppings(String[] toppings) {
		
		//tooping of pizza should not be more than 10 topping
		if(toppings.length<=10) {
			
			//initilaze value of input array to arraylist of topping in class by using loop
			for(int  i=0;i<toppings.length;i++) {
			
				this.toppings.add(toppings[i]);
				
			}
		}
		
}
	
	/**
	 * Method to return and display topping of pizza.
	 * 
	 * @return a display list string value of topping in a format topping1,topping2,....,lasttopping
	 */
	public String printToppings()  {
		String display ="";
		
		//initialize value of pizza topping from array to display
		for(int i = 0;i<this.toppings.size();i++) {
			
			display+=toppings.get(i);
			
			//if index have have not reach second last index add "," to a display  use -1 because index start from 0 but the size of array count from 1
			if(i!=this.toppings.size()-1) {
				display+=",";
			}
			
		}
		
		return display;
	}
	
	
	/**
	 * Method to get a price according to a number of tooping on a pizza.
	 * 
	 * @return a total cost of pizza according to number of toppings
	 */
	public double calculateCost() {
		double cost = 0 ;
		
			//Use topping.size which a no. of topping add to indicate matching in a switch case example if size =8 it would match case 8 and cost is 12.99
			switch(toppings.size()) {
			
			case 1: cost=8.99;
					break;
			case 2: cost=8.99;
					break;
			case 3: cost=8.99;
					break;
			case 4: cost=8.99;
					break;
			case 5: cost=9.99;
					break;
			case 6: cost=10.99;
					break;
			case 7: cost=11.99;
					break;
			case 8: cost=12.99;
					break;
			case 9: cost=13.99;
					break;
			case 10: cost=14.99;
					break;
			default: 
					break;
			
			}
		
		return cost;
	}
	
	
	
    }

