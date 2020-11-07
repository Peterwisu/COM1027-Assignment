package lab6_exercise2;

public class Halfbacks {
	
	private Player[] halfback;
	public Halfbacks() {
		halfback = new Player[2];
	}
	
	public void assignHalfback(Player player) {

	
		if(player.getPosition()==RugbyPosition.SCRUMHALF) {
			this.halfback[0]= player;
			if(this.halfback[1]==null) {
				this.halfback[1]= new Player("",null);
			}
			
		} else if(player.getPosition()==RugbyPosition.FLYHALF){
			this.halfback[1]= player;
			if(this.halfback[0]==null) {
				this.halfback[0]= new Player("",null);
			}
			
			
		
}
		
		
	}
	
	public String getPlayerBad(int number) {
		String result="";
		if(number==0) {
			result =this.halfback[0].getName();
		}
		if(number==1) {
			result= this.halfback[1].getName();		
			}
		return result;
	}
		
	
	public String displayElements() {
		
		StringBuffer buffer = new StringBuffer();
		
	for(int i =0;i<halfback.length;i++) {
	if(this.halfback[i].getPosition()== RugbyPosition.SCRUMHALF || this.halfback[i].getPosition()==RugbyPosition.FLYHALF) {
	
					buffer.append(i);
					buffer.append(" ");
					buffer.append("-");
					buffer.append(" ");
					buffer.append(halfback[i].getName());
					buffer.append(" ");
					buffer.append(halfback[i].getPosition());
					buffer.append("\n");
				} else {
					
					
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
		
	
	public String getPlayer(RugbyPosition position) {
		String name = null;
		switch(position.getNumber()){
		case 9: name= this.halfback[0].getName();
		break;
		case 10: name = this.halfback[1].getName();
		break;
		
		}
		
		return name;
	}


}

