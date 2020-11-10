package lab5_exercise3;
import java.util.ArrayList; 
public class Pizza {

	
	
	
	private ArrayList<String> toppings;
	
	public Pizza() {
		this.toppings= new ArrayList<String>();
	}
	
	
	
	
	public void addToppings(String[] toppings) {
		
		if(toppings.length<=10) {
		
			for(int  i=0;i<toppings.length;i++) {
			
				this.toppings.add(toppings[i]);
				
			}
		}
		
}
	
	
	public String printToppings()  {
		String display ="";
		for(int i = 0;i<this.toppings.size();i++) {
			
			display+=toppings.get(i);
			if(i!=this.toppings.size()-1) {
				display+=",";
			}
			
		}
		
		return display;
	}
	
	
	public double calculateCost() {
		double cost = 0 ;
		
			
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

