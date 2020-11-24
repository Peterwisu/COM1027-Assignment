package lab9_exercise3;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;



public class Shop {
	
	private List<IItem> items;
	
	public Shop() {
		super();
		this.items = new ArrayList<IItem>();
		
		
	}
	
	public void addItem(IItem item) {
		
		this.items.add(item);	
	}
	
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
