package exercise3;
/**
 * A class to calculate and display a value of average mark, marks and name of both assessment
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Module {
		//First Assessment 
		private Assessment assessment1;
		//Second Assessment 
		private Assessment assessment2;
		
		/**
		 * 
		 * @param assessment1 first assessment.
		 * @param assessment2 second assessment.
		 */
		public Module(Assessment assessment1,Assessment assessment2) {
			
			this.assessment1= assessment1;
			this.assessment2= assessment2;
			
		}
		/**
		 * Method to calcualte a Average marks of both assessment.
		 * 
		 * @return average marks of two assessment.
		 */
		public double calculateAverage() {
			 Double average;
		   average=(this.assessment1.getMark()*0.2)+(this.assessment2.getMark()*0.8); //Assessment1 weight 20% and Assessement2 weight 80%
			return average;
		}
		/**
		 * Method to return a details of a module.
		 * 
		 * @return a String format of an module contain module name ,both assessment name and marks. 
		 */
		@Override
		public String toString() {
			return "COM1027 Average = "+this.calculateAverage()+"% ["+this.assessment1.getName()+"(20%) = "+this.assessment1.getMark()+ "% ,"+this.assessment2.getName()+"(80%) = "+this.assessment2.getMark()+"% ]";
		
}
}