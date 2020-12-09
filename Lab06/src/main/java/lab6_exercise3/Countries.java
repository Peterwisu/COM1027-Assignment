package lab6_exercise3;
/**
 *  This Class contains enumarated types values of each countries
 * 
 * @author Wish Suharitdamrong
 *
 */
public enum Countries {
	//constant enumerated values 
	BRITAIN(0,true),CANADA(1,false),CHINA(2,false),RUSSIA(3,false),FRANCE(4,true);
	
	//boolean of a countires which in are inEU or not
	private boolean inEU=false;
	//index number of an enum value
	private int index=0;
	/**
	 * 
	 * @param index of an enum
	 * @param inEU boolean value 
	 */
	private Countries(int index,boolean inEU) {
		this.index =index;
		this.inEU = inEU ;
	}
	/**
	 * 
	 * @return index of an enum
	 */
	public int getIndex() {
		return index;
	}
	/**
	 * 
	 * @return boolean whether countries is in EU or not
	 */
	public boolean isInEU() {
		return inEU;
	}
	/**
	 * 
	 * @return boolean whether countries is in EU or not
	 */
	public boolean isEU() {
		boolean isuk;
		if(this.inEU == true) {
			isuk=true;
		}else {
			isuk=false;
		}
		return isuk;
	}
	/**
     * Method to return the countries in the correct order.
     *
     * @return an array of the countries in the correct order. 
     *  */
	public static Countries[] orderCountries() {
		// Use the index as an array index.
		Countries[] output = new Countries[Countries.values().length];
		for (Countries country : Countries.values()) {
			output[country.getIndex()] = country;
		}
		return output;
	}
		
}
