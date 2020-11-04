package lab4_exercise2;

public class Session {
	
	private String sessionName ;
	private int startTime;
	private int endTime;

		

	public Session(String sessionName,int starTime,int endTime) {
		this.sessionName = sessionName;
		this.startTime = starTime;
		this.endTime =endTime;
	}
	public String getSessionName() {
		return sessionName;
	}
	public void setSessionName(String sessionName) {
		this.sessionName = sessionName;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getEndTime() {
		return endTime;
	}
	public void setEndTime(int endTime) {
		this.endTime = endTime;
	}
	
}
