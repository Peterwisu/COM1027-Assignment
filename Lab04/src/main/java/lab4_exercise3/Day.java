package lab4_exercise3;



/**
 * A class provide a rountine details on a single day
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Day {
	//name of a day
	private String name=null;
	//Array of a session
	private Session[] sessions;
	//number of moudle teach per day.
	private int noofModuleperday=0;
	/**
	 * 
	 * @param name of the day
	 */
	public Day(String name) {
		this.name = name;
		this.sessions=new Session[4]; //define the array in the constructor
	}
	
	/**
	 * 
	 * @return name of a day
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @param name of a day
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 
	 * @param index of an array Session
	 * @param moduleName name of module
	 * @param startTime of session
	 * @param endTime  of session
	 */
	public void setSession(int index,String moduleName,int startTime,int endTime) {
		
		this.noofModuleperday+=1; // increase number of module per day by 1
		this.sessions[index] = new Session(moduleName,startTime,endTime); //Initialise new session object to the Array.
		
	}
	
	/**
	 * @return String value in format of Session name, Start time and End time.
	 */
	@Override
	public String toString() {
		String display="";
		int i=0; //index of a loop
		while(i<this.noofModuleperday)//if a index still less than no. of module perday keep looping until display all module in a day
			{
			

			
		display+= this.sessions[i].getSessionName()+": "+this.sessions[i].getStartTime()+" - "+this.sessions[i].getEndTime()+"\n";
		i++;}
		
		return display;
	}
	
	/**
	 * Method to print of display a toString method to a console.
	 * 
	 *  Print a to Session.toString to the console
	 */
	public void display() {
		
		
		System.out.println(this.sessions.toString());
		
	}
	
}
