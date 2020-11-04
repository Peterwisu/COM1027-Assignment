package lab4_exercise2;



public class Day {

	private String name;
	private Session[] sessions;
	
	
	private int noofModuleperday;
	
	public Day(String name) {
		this.name = name;
		this.sessions=new Session[4];
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSession(int index,String moduleName,int startTime,int endTime) {
		
		this.noofModuleperday=index+1;
		this.sessions[index] = new Session(moduleName,startTime,endTime);
		
	}
	
	@Override
	public String toString() {
		String display="";
		int i=0;
		while(i<this.noofModuleperday) {
			

			
		display+= this.sessions[i].getSessionName()+": "+this.sessions[i].getStartTime()+" - "+this.sessions[i].getEndTime()+"\n";
		i++;}
		
		return display;
	}
	
	public void display() {
		
		
		System.out.println(this.sessions.toString());
		
	}
	
}
