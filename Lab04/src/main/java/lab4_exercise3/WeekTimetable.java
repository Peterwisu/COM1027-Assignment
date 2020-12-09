package lab4_exercise3;
/**
 * A Class display a details of a Time table in a week consist of name of a day ,name of a module ,start time and end time.
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class WeekTimetable {
	
	//Array of a days
	private Day[] days;
	
	
	/**
	 * Constructor to initialized a array of days and details.
	 * 
	 */
	public WeekTimetable() {
		//define array
		this.days = new Day[5]; 
	
		
	}
	
	/**
	 * 
	 * @param index  of array
	 * @param day object
	 */
	public void addDailySessions(int index,Day day){
		
		
	  //initialize a name of a day and day.toString which are string value of details in Array  days at Index from input.
		
		this.days[index] = new Day(day.getName()+"\n"+day.toString());
	}

	/**
	 * A method to return a detail of a Timetable.
	 * 
	 * @return a String value in format which are detail of Week Timetable.
	 */
	public String printTimetable() {
		String display="";
		for(int i=0;i<this.days.length;i++) {  // use loop to get value from all index.
			
			display+= this.days[i].getName()+"\n";
		}
				
				
			return display;	
	}
	
}
