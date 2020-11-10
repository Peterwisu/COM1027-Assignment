package lab6_exercise3;

import java.util.Arrays;

public class MedalTable {
	
	private int[][] medals ;
	
	
	public MedalTable() {
		this.medals = new int[Countries.values().length][Medals.values().length];
		
		}
	
	
	public void addMedal(Countries country,Medals medal) {
		switch(country){
		case BRITAIN:   if(medal.equals(Medals.BRONZE)) {
						this.medals[0][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						this.medals[0][1]+=1;	
						}else {
						this.medals[0][2]+=1;
						}
		 				break; 
		case CANADA:    if(medal.equals(Medals.BRONZE)) {
						this.medals[1][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						this.medals[1][1]+=1;	
						}else {
							this.medals[1][2]+=1;
						}
			 			break;
		case CHINA: 
						if(medal.equals(Medals.BRONZE)) {
						this.medals[2][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						this.medals[2][1]+=1;	
						}else {
							this.medals[2][2]+=1;
						}
						break;
		case RUSSIA: 
						if(medal.equals(Medals.BRONZE)) {
						this.medals[3][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						this.medals[3][1]+=1;	
						}else {
						this.medals[3][2]+=1;
						}
						break;
		case FRANCE: if(medal.equals(Medals.BRONZE)) {
						this.medals[4][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						this.medals[4][1]+=1;	
						}else {
						this.medals[4][2]+=1;
						}
						break;
			default:	break;
		}
		
	}

	
	
	public int getEUMedalCount(){
		int count =0;
		for (int i=0 ;i<Countries.values().length;i++)
		{
			
			if(i == 0) {
				count+=this.medals[i][0]+this.medals[i][1]+this.medals[i][2];
						
			}else if(i ==4 ) {
				count+=this.medals[i][0]+this.medals[i][1]+this.medals[i][2];
				
			}
			
			
			
			
		}
		
		
		
		return count;
	}

	public int getMedals(Countries country,Medals medal) {
		int count=0;
		
		switch(country) {
		
		case  BRITAIN:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[0][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[0][1];	
						}else {
						count+=this.medals[0][2];}
		
				break;
		case   CANADA:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[1][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[1][1];	
						}else {
						count+=this.medals[1][2];}
			
			break;
		case    CHINA:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[2][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[2][1];	
						}else {
						count+=this.medals[2][2];}
			
			break;
		case   RUSSIA:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[3][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[3][1];	
						}else {
						count+=this.medals[3][2];}
			
			break;
		case   FRANCE:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[4][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[4][1];	
						}else {
						count+=this.medals[4][2];}		
			break;
			
		
		}
		
		
		
		return count;
		
	}

	@Override
	public String toString() {
		
		
		
		return "MedalTable [medals=" + Arrays.toString(medals) + "]";
	}
		
		
	
	
}

