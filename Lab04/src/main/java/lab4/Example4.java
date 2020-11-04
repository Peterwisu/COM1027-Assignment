package lab4;
import java.util.ArrayList;
/**
 * A simple class to introduce ArrayLists
 * 
 * @author Stella Kazamia
 * 
 */

public class Example4 {
	
	// Add a field
		private ArrayList<String> nameList;
		
	// Add a default constructor
		public Example4() {
			super();
			this.nameList = new ArrayList<String>();
			
		}
	public void addNames() {
		// Initialise the array list
		
		nameList.add("Helen");
		nameList.add("Stella");
		
	}

	public  String displayNames() {
		String display="";
		// Loop through the array list
		for (int i=0;i<nameList.size();i++) 
		{
			
			display+= nameList.get(i);
		}
	 return display;
	}
	
	}
	

