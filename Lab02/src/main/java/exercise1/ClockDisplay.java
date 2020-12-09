package exercise1;
import java.text.DecimalFormat;
/**
 *  A class to model and format two type of a ClockDisplay that is 12 hours and 24 hours clock and display its.
 * 
 * @author wish Suharitdamrong
 *
 */
public class ClockDisplay {
	
		//Number of hours in clock
		private NumberInfo hours=null;
		//Number of minutes in clock
		private NumberInfo minute=null;
		//Time period to indicate day and night
		private String am_or_pm="am";
		//Boolean value for indicating whether the clock is 12 or 24
		private Boolean is12;
		
		/**
		 * 
		 * @param is12 boolean vaue to check the clock is 12 hours or 24 hours clock.
		 */
		public ClockDisplay(Boolean is12) {
			super();
			  //if is12 is true , hours is initialized to 12 hours.
			if (is12 == true) {
				//set a clock display hours with max hours in clock display is 12 hours.
				this.hours= new NumberInfo(12);
				//set a limit of minutes in a clock display to 60 minutes
				this.minute= new NumberInfo(60);
				//set a type of clock whether it it a 12 or 24 hours clock if its value is true it is 12 hours clock.
				this.is12 =is12;
			} //if is12 is false , hours is initialized to 24 hours.
			else {
				//set a clock display hours with max hours in clock display is 24 hours.
				this.hours= new NumberInfo(24);
				//set a limit of minutes in a clock display to 60 minutes
				this.minute= new NumberInfo(60);
				//set a type of clock whether it it a 12 or 24 hours clock if its value is false it is 24 hours clock.
				this.is12 = is12;
			}
		}
		
		
		/**
		 *  This method would increase a value of minute and hours and set whether it is am or pm
		 * 
		 */
		public void timeTick() {
			//if minute is 59 minutes and hours is 11 hours convert a String am_or_pm to "pm" .
			if(minute.getValue()==59 && hours.getValue()==11&&this.is12) {
				if(this.am_or_pm.equals("am")) {
					
					this.am_or_pm ="pm";
				}//if not am_or_pm value is "am".
				else {
					this.am_or_pm ="am";
				}
			}
			//use method increment to increase a value of minute from NumberInfo.
			minute.increment();
			// if minute has pass 59 and turn over to 0 increase no. of hours by 1.
			if(minute.getValue()==0) {
				//use method increment to increase a value of hours from NumberInfo  .
				hours.increment();
			}
		}
		
		
		/**
		 * Method to return a time of a clock display.
		 * 
		 *  @return a String display variable which its value contain a time of a clock in format to display.
		 */
		@Override
		public String toString() {
			 String display = null;
			 // if this.is12 is true the display will be initialize to 12hours Clock Format.
			if(this.is12) { 
							// if clock is 12 hours clock is at AM and hour is zero (0.00am).
						if(((this.minute.getValue())==0)&&(this.am_or_pm=="am")) {
							//Create a Decimal Format two digit for minutes.
							DecimalFormat stylemin = new DecimalFormat("00"); 
							//Create a Decimal Format one digit for hours.
							DecimalFormat stylehrs = new DecimalFormat("0"); 
							//use stylehrs format for hours values  and stylemin for minutes values.
							display= stylehrs.format(this.hours.getValue()) +":" + stylemin.format(this.minute.getValue())+this.am_or_pm ;
				
				
							// if clock is 12 hours clock at PM and hour is zero (12.00pm).
					}	else if(((this.hours.getValue())==0)&&(this.am_or_pm=="pm")) {
							//Create a Decimal Format two digit for both  minutes and hours.
							DecimalFormat style = new DecimalFormat("00"); 
							//use style format for both hours and minutes.
							display = style.format(this.hours.getValue()+12) +":" + style.format(this.minute.getValue())+this.am_or_pm ;
					} 	
							//if clock is 12 hours but hours is not zero.
						else {
							
							DecimalFormat style = new DecimalFormat("0"); 
							display=  style.format(this.hours.getValue()) +":" + style.format(this.minute.getValue())+this.am_or_pm ;
						} 
				
				
				
						// if this.is12 is false the display will be initialize to 24hours Clock Format.
			}else {
						//Create a Decimal Format two digit for both  minutes and hours.
						DecimalFormat style = new DecimalFormat("00");
						//use style format for both hours and minutes.
						display= style.format(this.hours.getValue()) +":" + style.format(this.minute.getValue()) ;
						}
			return display; 
			}
}
