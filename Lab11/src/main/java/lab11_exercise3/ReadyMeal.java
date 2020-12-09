package lab11_exercise3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class ReadyMeal {
	//name of a meal.
	private String name=null;
	//type of a meal.
	private ProductType type=null;
	//factory of a meal.
	private Factory factory=null;
	//Date of prduction of a meal.
	private Date productionDate=null;
	//List of an item in a meal.
	private List<IItem> item;
	
	/**
	 * 
	 * @param name of a meal
	 * @param type of a meal
	 * @param factory of a meal
	 */
	public ReadyMeal(String name, ProductType type, Factory factory) {
		super();
		//define a production date.
		this.productionDate= new Date();
		//define a list of item in counstructor.
		this.item = new ArrayList<IItem>();
		this.name =name;
		this.type =type;
		this.factory =factory;
	}
	
	/**
	 * 
	 * @return name of a meal
	 */
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @return type of a meal
	 */
	public ProductType getType() {
		return type;
	}

	/**
	 * 
	 * @return factory of a meal
	 */
	public Factory getFactory() {
		return factory;
	}

	/**Add item into a Arraylist item.
	 * 
	 * @param item
	 */
	public void addItem(Item item) {
		this.item.add(item);
	}
	/**Display a details of a meals and its contents such as name ,weight ,type,nutrients contains and address of factory.
	 * 
	 * @return detail of a meal in specific format.
	 */
	public String printContent() {
		StringBuffer print=new StringBuffer();
		double weight=0;
		double calorlies=0;
		double fat=0;
		double sodium=0;
		
		for(IItem i:this.item) {
			weight+=i.getTotalWeight();
			calorlies+=i.getTotalCalories();
			fat+=i.getTotalFat(IngredientType.MEAT);
			sodium+=i.getTotalSodium(IngredientType.VEGETABLE);
		}
		
		print.append(this.type.getName()+" "+this.name+" Ready Meal "+weight+" g\n");
		print.append("\n");
		print.append("Contents\n");
		print.append("Calories: "+calorlies+"kcal\n"); 
		print.append("Meat (fat): "+fat+"g\n");
		print.append("Vegetable (sodium): "+sodium+"g\n");
		print.append("\n");  
		print.append(this.factory.getAddress());
		
		return print.toString();
	}
	
	
}
