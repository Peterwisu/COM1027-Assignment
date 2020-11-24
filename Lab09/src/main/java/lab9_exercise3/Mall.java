package lab9_exercise3;

import java.util.HashMap;
import java.util.Map;

public class Mall {
	
	private Map<Integer,Shop> shops;
	
	
	public Mall() {
		this.shops = new HashMap<Integer,Shop>();
	}
	
	
	
	public void addShop(int number,Shop shop) {
		if(number<0||shop==null) {
			throw new NullPointerException();
		}
		
		this.shops.put(number, shop);
			
	}
	
	public String displayAllShops() {
		StringBuffer display = new StringBuffer();
		if(!(this.shops.isEmpty())) {
			for(Map.Entry<Integer, Shop> i:this.shops.entrySet()) {
			display.append(i.getKey()+" : ");
			display.append(i.getValue().displayCatalogue());
			
			}
			
		}
		
		
		return display.toString();
	}

}
