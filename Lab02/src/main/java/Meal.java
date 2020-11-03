
public class Meal {
	
		private Food MainCourse ;
		private Food Dessert ;
		
		double totalsugar ;
		
		public void CalculateTotalSugar() {
			
			totalsugar= MainCourse.getAmountofSugar()+ Dessert.getAmountofSugar();
			return  ;
			
		}

		@Override
		public String toString() {
			return "Meal [MainCourse=" + MainCourse + ", Dessert=" + Dessert + ", totalsugar=" + totalsugar + "]";
		}
			
}
