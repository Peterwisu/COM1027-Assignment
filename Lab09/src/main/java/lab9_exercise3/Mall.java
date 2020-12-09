package lab9_exercise3;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Mall {
	//Hashmap for shop and shop number
	private Map<Integer,Shop> shops;
	
	/**
	 * Default constructor
	 */
	public Mall() {
		//define hashmap
		this.shops = new HashMap<Integer,Shop>();
	}
	
	
	/**Add shop to the HashMap shop.
	 * 
	 * @param number of a shop
	 * @param shop
	 */
	public void addShop(int number,Shop shop) {
		if(number<0||shop==null) {
			throw new NullPointerException();
		}
		
		this.shops.put(number, shop);
			
	}
	
	/**Display detail of all shop in a HashMap
	 * 
	 * @return String value contain detail of all shop in a HashMap
	 */
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
