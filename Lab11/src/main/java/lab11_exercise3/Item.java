package lab11_exercise3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 
 * @author Wish Suharaitdamrong
 *
 */
public class Item implements IItem{
		//List of an ingredeint.
		private List<Ingredient>ingredient;
		
		/**
		 * Initialize an ArrayList in a constructor of a class
		 * 
		 */
		public Item() {
			super();
			//define arraylist
			this.ingredient = new ArrayList<Ingredient>();
		}
		
		
		/**Method to add ingredient to a list.
		 * 
		 * @return
		 */
		@Override
		public void addIngredient(Ingredient ingredeint) {
			
			this.ingredient.add(ingredeint);
			
		}


		/**Method to calculate a total weight of ingredient in a list.
		 * 
		 * @return totalweight
		 */
		@Override
		public double getTotalWeight() {
			double totalweight= 0;
			for(Ingredient i:this.ingredient) {
				totalweight+=i.getCookedWeight();
			}
			return totalweight;
			
		}


		/**Calculate a total calories of all ingredient in list.
		 * 
		 * @return totalcalories
		 */
		@Override
		public double getTotalCalories() {
			double totalcalories= 0;
			for(Ingredient i:this.ingredient) {
				totalcalories+=i.getCalories();
			}
			return totalcalories;
		}


		/**Calculate a total fat of all ingredient in list.
		 * 
		 * @return totalfat
		 */
		@Override
		public double getTotalFat(IngredientType type) {
			double totalfat= 0;
			for(Ingredient i:this.ingredient) {
				//Check a type of ingredient of an index i with input type.
				if(i.getType()==type) {
				//if it matches then add a amount of fat tp totalfat.
				totalfat+=i.getFat();
				}
			}
			
			return totalfat;
		}


		/** Calculate a total sodium of all ingredient in list.
		 * 
		 * @return totalsodium
		 */
		@Override
		public double getTotalSodium(IngredientType type) {
			double totalsodium= 0;
			for(Ingredient i:this.ingredient) {
				//Check a type of ingredient of an index i with input type.
				if(i.getType()==type) {
				//if it matches then add a amount of sodium tp totalsodium.
				totalsodium+=i.getSodium();
				}
			}
			
			return totalsodium;
		}


		
		
}
