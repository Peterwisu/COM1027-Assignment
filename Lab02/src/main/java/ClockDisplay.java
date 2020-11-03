import java.text.DecimalFormat;

public class ClockDisplay {
		private NumberInfo hours ;
		private NumberInfo minute ;
		
		public ClockDisplay() {	
			this.hours= new NumberInfo(12);
			this.minute= new NumberInfo(60);
		}
		public void timeTick() {
			
			minute.increment();
			if(minute.getValue()==0) {
				
				hours.increment();
			}
		}
		@Override
		public String toString() {
			
			DecimalFormat style = new DecimalFormat("00"); 
			return ( style.format(this.hours.getValue()) +":" + style.format(this.minute.getValue()) );
		}
}
