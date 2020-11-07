package lab6_exercise3;

public enum Countries {

	BRITAIN(0,true),CANADA(1,false),CHINA(2,false),RUSSIA(3,false),FRANCE(4,true);
	
	
	private boolean inEU;
	private int index;
	private Countries(int index,boolean inEU) {
		this.index =index;
		this.inEU = inEU ;
	}
	public int getIndex() {
		return index;
	}
	
	
	
	public boolean isInEU() {
		return inEU;
	}



	
	public boolean isEU() {
		boolean isuk;
		if(this.inEU == true) {
			isuk=true;
		}else {
			isuk=false;
		}
		return isuk;
	}
	
	public static Countries[] orderCountries() {
		
		Countries[] output = new Countries[Countries.values().length];
		for (Countries country : Countries.values()) {
			output[country.getIndex()] = country;
		}
		return output;
	}
		
}
