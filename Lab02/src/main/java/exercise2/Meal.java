package exercise2;

public class Meal {
	
		private Food MainCourse ;
		private Food Dessert ;
		
		
		public Meal(Food MainCourse,Food Dessert) {
			super();
			 this.MainCourse= MainCourse ;
			this.Dessert = Dessert;
			
		}
		 
		
		public double calculateTotalSugarLevel() {
			
			return MainCourse.getAmountofSugar()+ Dessert.getAmountofSugar(); 
			
		}



		@Override
		public String toString() {
			return "Meal [mainCourse = " + MainCourse.getName() + ", dessert = " + Dessert.getName() + "]";
		}

		
		
}
