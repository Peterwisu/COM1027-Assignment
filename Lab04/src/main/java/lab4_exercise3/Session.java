package lab4_exercise3;
/**
 * 
 * A Class allow to create a details of a Session contains name ,start time and end time;
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Session {
	//Name of a module
	private String sessionName =null;
	//Start time of session
	private int startTime=0;
	//End time of Session
	private int endTime=0;

		
	/**
	 * 
	 * @param sessionName  Name of a module
	 * @param starTime     Start time of session
	 * @param endTime	   End time of Session
	 */
	public Session(String sessionName,int starTime,int endTime) {
		this.sessionName = sessionName;
		this.startTime = starTime;
		this.endTime =endTime;
	}
	
	/**
	 * 
	 * @return Name of a module
	 */
	public String getSessionName() {
		return sessionName;
	}
	/**
	 * 
	 * @param sessionName   
	 */
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	/**
	 * 
	 * @return  Start time of session
	 */
	public int getStartTime() {
		return startTime;
	}
	/**
	 * 
	 * @param startTime of session
	 */
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	/**
	 * 
	 * @return End time of Session
	 */
	public int getEndTime() {
		return endTime;
	}
	/**
	 * 
	 * @param endTime of Session
	 */
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
}

