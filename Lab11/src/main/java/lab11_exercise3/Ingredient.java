package lab11_exercise3;
/**
 * 
 * This class obtain a detail of a Indgredient and calculate a weight of ingredient after cooked.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Ingredient {
	//Name of a Ingredient.
	private String name=null;
	//Type of ingredient.
	private IngredientType type=null;
	//Supplier of an ingredient.
	private Supplier supplier=null;
	//Raw weight of a ingredient.
	private double rawWeight=0;
	//Calories of an ingredient.
	private double calories=0;
	//Fat of an of ingredient;
	private double fat=0;
	//Sodium of a ingredient;
	private double sodium=0;
	/**
	 * 
	 * @param name
	 * @param type
	 * @param supplier
	 * @param rawWeight
	 * @param calories
	 * @param fat
	 * @param sodium
	 */
	public Ingredient(String name,IngredientType type,Supplier supplier,double rawWeight,double calories,double fat,double sodium) {
		super();
		this.supplier =supplier;
		this.name =name;
		this.type =type;
		this.rawWeight =rawWeight;
		this.calories =calories;
		this.fat =fat;
		this.sodium =sodium;
		
	}
	/**Getter for name
	 * 
	 * @return name of ingredient.
	 */
	public String getName() {
		return name;
	}
	/**Getter for type
	 * 
	 * @return type of ingredient.
	 */
	public IngredientType getType() {
		return type;
	}
	/**Getter for suplier
	 * 
	 * @return supplier of ingredient.
	 */
	public Supplier getSupplier() {
		return supplier;
	}
	/**Getter for raw weight
	 * 
	 * @return raw weight of ingredient.
	 */
	public double getRawWeight() {
		return rawWeight;
	}
	/**Getter for calories
	 * 
	 * @return calories in ingredient.
	 */
	public double getCalories() {
		return calories;
	}
	/**Getter for fat
	 * 
	 * @return fat in ingredient.
	 */
	public double getFat() {
		return fat;
	}
	/**Getter for sodium
	 * 
	 * @return sodium iningredient.
	 */
	public double getSodium() {
		return sodium;
	}
	/**Calculate a cooked weight of a ingredient which is 80% of its raw weight.
	 * 
	 * @return
	 */
	public double getCookedWeight() {
		
		return this.rawWeight*0.8;
	}
	
}
