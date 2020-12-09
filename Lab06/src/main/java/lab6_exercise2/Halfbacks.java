package lab6_exercise2;
/**
 * 
 * This Class indicate a players of a Rugby team whose position is  SCRUMHALF and FLYHALF and show an details of a player
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Halfbacks {
	//array of list player whose postion are halfback.
	private Player[] halfback;
	/**
	 * Constructor to initialize array Player of in an object.
	 */
	public Halfbacks() {
		this.halfback = new Player[2];
	}
	
	/**
	 * 
	 * Assign value of player whose position are SCRUMHALF or FLYHALF.
	 * 
	 * @param player of a rugby team.
	 */
	public void assignHalfback(Player player) {

		//if position of player is SCRUMHALF
		if(player.getPosition()==RugbyPosition.SCRUMHALF) {
			//initialize a player in a array at index 0.
			this.halfback[0]= player;
			//if array at index 1 is null
			if(this.halfback[1]==null) {
				//initialize new player whose value are null at index 1.
				this.halfback[1]= new Player("",null);
			}
			//if position of player is FLYHALF).
		} else if(player.getPosition()==RugbyPosition.FLYHALF){
			//initialize a player in a array at index 1.
			this.halfback[1]= player;
			//if array at index 0 is null.
			if(this.halfback[0]==null) {
				//initialize new player whose value are null at index 0.
				this.halfback[0]= new Player("",null);
			}
		}	
	}
	/**
	   * Really bad way of extracting detail from an internally managed
	   * array. We should never ask for the array index as this is
	   * implementation detail.
	   *
	   * @param number index into array - DO NOT DO THIS
	   * @return the name of the player at the specified array index.
	   */
	public String getPlayerBad(int number) {
		StringBuffer buffer = new StringBuffer();
		if(number==0) {
			buffer.append(this.halfback[0].getName());
		}
		if(number==1) {
			buffer.append(this.halfback[1].getName());		
			}
		return buffer.toString();
	}
		
	/**
	 * Method to show all player in an array with name and position.
	 * 
	 * @return Display string value of detail an rugby player with name and position.
	 */
	public String displayElements() {
		//create StringBuffer name buffer.
		StringBuffer buffer = new StringBuffer();
		
	for(int i =0;i<halfback.length;i++) {
		//if player position is SCRUMHALF  or FLYHALF.
	if(this.halfback[i].getPosition()== RugbyPosition.SCRUMHALF || this.halfback[i].getPosition()==RugbyPosition.FLYHALF) {
				//add value to StringBuffer name buffer with name and position.
					buffer.append(i);
					buffer.append(" ");
					buffer.append("-");
					buffer.append(" ");
					buffer.append(halfback[i].getName());
					buffer.append(" ");
					buffer.append(halfback[i].getPosition());
					buffer.append("\n");
				} else {
					
					//add value to StringBuffer name buffer  without name and position.
						buffer.append(i);
						buffer.append(" ");
						buffer.append("-");
						buffer.append(" ");
						buffer.append("\n");
					 }
			
			
			}
			String display = buffer.toString();
			
			return display;
			}
		
	/**
	 * Method to get a player which have a same position as an input parameter.
	 * 
	 * @param position of  player in Rugby team.
	 * @return name of a player.
	 */
	public String getPlayer(RugbyPosition position) {
		String name = null;
		//use getNumber method from RugbyPosition class which will return an index value of an enum values to compare with a case in switch case condition.
		switch(position.getNumber()){
		case 9: name= this.halfback[0].getName();
		break;
		case 10: name = this.halfback[1].getName();
		break;
		
		}
		
		return name;
	}


}

