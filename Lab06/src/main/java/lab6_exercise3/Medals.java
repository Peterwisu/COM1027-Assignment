package lab6_exercise3;
/**
 * 
 *  This Class contains enumarated types values of Mdeals
 *  
 * @author  Wish Suharitdamrong
 *
 */
public enum Medals {
	//constant enum values
		BRONZE(0),SILVER(1),GOLD(2);
	//index of an enum
	private int index=0;
	/**
	 * 
	 * @param index of an enum
	 */
	private Medals(int index) {
		this.index =index;
	}
	/**
	 * ]
	 * @return of an enum
	 */
	public int getIndex() {
		return index;
	}
	/**
     * Method to return the medals in the correct order for the table.
     *
     * @return an array of the medals in the correct order. 5 */
	public static Medals[] orderedMedals() {
		// Use the index as an array index.
		Medals[] medals = new Medals[Medals.values().length];
		for (Medals medal : Medals.values()) { 
			medals[medal.getIndex()] = medal;
		}
		return medals; }
	
}
