package lab9_exercise1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
/**
 * This class display a detail of a product in a shop.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Shop {
	
	//list of an items
	private List<IItem> items =null;
	/**
	 * Default constructor to define Arraylist
	 */
	public Shop() {
		super();
		//define ArrayList
		this.items = new ArrayList<IItem>();
	}
	/**Method to add item to a item Arraylist.
	 * 	
	 * @param item
	 */
	public void addItem(IItem item) {
			
			this.items.add(item);	
		}
	/**Display a shop catalogue
	 * 	
	 * @return String value of display of catalogue.
	 */
	public String displayCatalogue() {
			StringBuffer display = new StringBuffer();
			DecimalFormat format =new DecimalFormat(".00");
			display.append("Shop Catalogue\n\n"+"Item		Price	Sale Price\n"); 
			for(IItem i:this.items) {
			display.append(i.getName()+"	£"+format.format(i.getPrice())+"	£"+format.format(i.calculateSalePrice())+"\n" + "");
			}
			
			return display.toString();
		}
}
