package exercise2;
/**
 * 
 * A Class to specify a type of meal and calculate a total amount of sugar
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Meal {
		//Maincourse a type of a Meal.
		private Food MainCourse=null;
		//Dessert a typr of a Meal.
		private Food Dessert=null ;
		
		/**
		 * 
		 * @param MainCourse The food which are MainCourse.
		 * @param Dessert    The food which are Dessert.
		 */
		public Meal(Food MainCourse,Food Dessert) {
			super();
			 this.MainCourse= MainCourse ;
			 this.Dessert = Dessert;
			
		}
		 
		/**
		 * Method to calculate total amount of sugar in a Meal
		 * 
		 * @return a total amount of sugar in both MainCourse and Dessert.
		 */
		public double calculateTotalSugarLevel() {
			
			return MainCourse.getAmountofSugar()+ Dessert.getAmountofSugar(); 
			
		}


		/**
		 * Method to return a detail of a Meal.
		 * 
		 * @return  a string display of MainCourse name and Dessert name in format.
		 */
		@Override
		public String toString() {
			return "Meal [mainCourse = " + MainCourse.getName() + ", dessert = " + Dessert.getName() + "]";
		}

		
		
}
