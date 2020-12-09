package lab11_exercise2;
/**
 * Define a detail of an each ingredients. 
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public interface IItem {
	/**
	 * Add an ingredient to a list.
	 * 
	 * @param ingredeint
	 */
	public abstract void addIngredient(Ingredient ingredeint);
	/**
	 * Calculate a total weight of all ingredient in list.
	 * 
	 * @return
	 */
	public abstract double getTotalWeight();
	/**
	 * Calculate a total calories of all ingredient in list.
	 * 
	 * @return
	 */
	public abstract double getTotalCalories();
	/**
	 * Calculate a total fat of all ingredient in list.
	 * 
	 * @param type
	 * @return
	 */
	public abstract double getTotalFat(IngredientType type);
	/**
	 * Calculate a total sodium of all ingredient in list.
	 * 
	 * @param type
	 * @return
	 */
	public abstract double getTotalSodium(IngredientType type);
}
