package lab2;
import java.text.DecimalFormat;

public class ClockDisplay {
		private NumberInfo hours ;
		private NumberInfo minute ;
		
		
		public ClockDisplay() {
			
			this.hours= new NumberInfo(24);
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
			 String display = null;
			
		{DecimalFormat style = new DecimalFormat("00");
			display= style.format(this.hours.getValue()) +":" + style.format(this.minute.getValue()) ;
		}
			return display;
			}
}
