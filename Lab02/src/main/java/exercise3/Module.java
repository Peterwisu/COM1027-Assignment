package exercise3;

public class Module {

		private Assessment assessment1;
		private Assessment assessment2;
		
		
		public Module(Assessment assessment1,Assessment assessment2) {
			
			this.assessment1= assessment1;
			this.assessment2= assessment2;
			
		}
		public double calculateAverage() {
			 Double average;
		   average=(this.assessment1.getMark()*0.2)+(this.assessment2.getMark()*0.8);
			return average;
		}
		@Override
		public String toString() {
			return "COM1027 Average = "+this.calculateAverage()+"% ["+this.assessment1.getName()+"(20%) = "+this.assessment1.getMark()+ "% ,"+this.assessment2.getName()+"(80%) = "+this.assessment2.getMark()+"% ]";
		
}
}