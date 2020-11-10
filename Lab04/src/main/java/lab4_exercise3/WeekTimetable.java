package lab4_exercise3;

public class WeekTimetable {
	
	private Day[] days;
	private Day[] details;
	public WeekTimetable() {
		
		this.days = new Day[5];
		this.details = new Day[5];
		
	}
	public void addDailySessions(int index,Day day){
		
		this.details[index] = new Day(day.toString());
		
		
		this.days[index] = new Day(day.getName());
		
	}

	
	public String printTimetable() {
		String display="";
		for(int i=0;i<this.days.length;i++) {
			
			display+= this.days[i].getName()+"\n"+this.details[i].getName()+"\n";
			
		}
				
				
			return display;	
	}
	
}
