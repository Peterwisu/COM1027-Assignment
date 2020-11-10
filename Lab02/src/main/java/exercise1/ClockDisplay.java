package exercise1;
import java.text.DecimalFormat;

public class ClockDisplay {
		private NumberInfo hours ;
		private NumberInfo minute ;
		private String am_or_pm="am";
		private Boolean is12;
		
		public ClockDisplay(Boolean is12) {
			if (is12 == true) {
				this.hours= new NumberInfo(12);
				this.minute= new NumberInfo(60);
				this.is12 =is12;
			} else {
			this.hours= new NumberInfo(24);
			this.minute= new NumberInfo(60);
			this.is12 = is12;
			}
		}
		public void timeTick() {
			if(minute.getValue()==59&& hours.getValue()==11&&this.is12) {
				if(this.am_or_pm.equals("am")) {
					this.am_or_pm ="pm";
				}else {
					this.am_or_pm ="am";
				}
			}
			
			minute.increment();
			if(minute.getValue()==0) {
				
				hours.increment();
			}
		}
		@Override
		public String toString() {
			 String display = null;
			 
			if(this.is12) { 
				if(((this.minute.getValue())==0)&&(this.am_or_pm=="am")) {
				DecimalFormat stylemin = new DecimalFormat("00"); 
				DecimalFormat stylehrs = new DecimalFormat("0"); 
			display= stylehrs.format(this.hours.getValue()) +":" + stylemin.format(this.minute.getValue())+this.am_or_pm ;
			}else if(((this.hours.getValue())==0)&&(this.am_or_pm=="pm")) {
				DecimalFormat style = new DecimalFormat("00"); 
				
				display = style.format(this.hours.getValue()+12) +":" + style.format(this.minute.getValue())+this.am_or_pm ;
			}
				else {
					DecimalFormat style = new DecimalFormat("0"); 
					display=  style.format(this.hours.getValue()) +":" + style.format(this.minute.getValue())+this.am_or_pm ;
				} 
				
				
				
				
		}else {DecimalFormat style = new DecimalFormat("00");
			display= style.format(this.hours.getValue()) +":" + style.format(this.minute.getValue()) ;
		}
			return display;
			}
}
