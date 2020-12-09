package lab6_exercise3;

import java.util.Arrays;
/**
 * 
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class MedalTable {
	//2 dimension array of medal 
	private int[][] medals ;
	
	/**
	 * initialize array in a constructor
	 */
	public MedalTable() {
		//define 2 dimension(2D) array [number of counteries][number of types of medals].
		this.medals = new int[Countries.values().length][Medals.values().length];
		
		}
	
	/**
	 * Add a medal to a Medal table in 2 dimensional Array
	 * 
	 * @param country that received medal
	 * @param medal type to be add
	 */
	public void addMedal(Countries country,Medals medal) {
		//use switch case to select countries
		switch(country){
		//Countries would be in first array box start from 0 to 4 for 5 countries
		//Medal type Bronze, Silver, and Gold will be in second array box at index 0 to 2 for 3 types respectively
		//If country is Britian first array box would be at index 0
		case BRITAIN:   if(medal.equals(Medals.BRONZE)) {
						//if medal is Bronze add 1 in index 0
						this.medals[0][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						//if medal is Silver add 1 in index 1
						this.medals[0][1]+=1;	
						}else {
						//if medal is Gold add 1 in index 2
						this.medals[0][2]+=1;
						}
		 				break; 
		//If country is CANADA first array box would be at index 0
		case CANADA:    if(medal.equals(Medals.BRONZE)) {
						//if medal is Bronze add 1 in index 0
						this.medals[1][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						//if medal is Silver add 1 in index 1	
						this.medals[1][1]+=1;	
						}else {
						//if medal is Gold add 1 in index 2
						this.medals[1][2]+=1;
						}
			 			break;
		//If country is CHINA first array box would be at index 0		 			
		case CHINA: 
						if(medal.equals(Medals.BRONZE)) {
						//if medal is Bronze add 1 in index 0
						this.medals[2][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						//if medal is Silver add 1 in index 1	
						this.medals[2][1]+=1;	
						}else {
						//if medal is Gold add 1 in index 2
						this.medals[2][2]+=1;
						}
						break;
		//If country is RUSSIA first array box would be at index 0
		case RUSSIA: 
						if(medal.equals(Medals.BRONZE)) {
						//if medal is Bronze add 1 in index 0	
						this.medals[3][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						//if medal is Silver add 1 in index 1		
						this.medals[3][1]+=1;	
						}else {
						//if medal is Gold add 1 in index 2	
						this.medals[3][2]+=1;
						}
						break;
		//If country is FRANCE first array box would be at index 0
		case FRANCE: if(medal.equals(Medals.BRONZE)) {
						//if medal is Bronze add 1 in index 0	
						this.medals[4][0]+=1;
						}else if(medal.equals(Medals.SILVER)){
						//if medal is Silver add 1 in index 1			
						this.medals[4][1]+=1;	
						}else {
						//if medal is Gold add 1 in index 2		
						this.medals[4][2]+=1;
						}
						break;
		//IF country does not match
			default:	break;
		}
		
	}

	
	/**
	 * Get a total number of medal from only EU countries
	 * 
	 * @return number of medal from countries in EU
	 */
	public int getEUMedalCount(){
		int count =0;
		for (int i=0 ;i<Countries.values().length;i++)
		{
			//if country is Britian add a number of medal into count
			if(i == 0) {
				count+=this.medals[i][0]+this.medals[i][1]+this.medals[i][2];
			//if country is France add a number of medal into count
			}else if(i ==4 ) {
				count+=this.medals[i][0]+this.medals[i][1]+this.medals[i][2];	
			}		
		}
		return count;
	}

	/**Get a value of medal from a specific country.
	 * 
	 * @param country
	 * @param medal
	 * @return 
	 */
	public int getMedals(Countries country,Medals medal) {
		int count=0;
		//use switch case to indicate a country
		switch(country) {
		// if country is BRITIAN all value of medal of a country and assign to count
		case  BRITAIN:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[0][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[0][1];	
						}else {
						count+=this.medals[0][2];}
		
				break;
		// if country is CANADA all value of medal of a country and assign to count
		case   CANADA:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[1][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[1][1];	
						}else {
						count+=this.medals[1][2];}
			
				break;
		// if country is CHINA all value of medal of a country and assign to count
		case    CHINA:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[2][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[2][1];	
						}else {
						count+=this.medals[2][2];}
			
				break;
		// if country is RUSSIA all value of medal of a country and assign to count		
		case   RUSSIA:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[3][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[3][1];	
						}else {
						count+=this.medals[3][2];}
				
				break;
		// if country is FRANCE all value of medal of a country and assign to count		
		case   FRANCE:  if(medal.equals(Medals.BRONZE)) {
						count+=this.medals[4][0];
						}else if(medal.equals(Medals.SILVER)){
						count+=this.medals[4][1];	
						}else {
						count+=this.medals[4][2];}		
				break;
		//if country does not match		
		default :		break;
		
		}
		
		
		
		return count;
		
	}
	/**
	 * 
	 * 
	 * @return MedalTable details
	 */
	@Override
	public String toString() {
		
		
		
		return "MedalTable [medals=" + Arrays.toString(medals) + "]";
	}
		
		
	
	
}

