package lab5_exercise1;

public class RainfallYear {
	private int year;
	private double[] rainfallMonth;
	
	public RainfallYear(int year) {
		rainfallMonth=new double[12];
		this.year =year;
		
		

	}

	public int getYear() {
		return year;
	}


	
	public double calculateMeanRainfall() {
		double total=0;
		double mean;
		for(int i=0;i<this.rainfallMonth.length;i++) {
			
			total=total+rainfallMonth[i];
		}
		mean=(total/12);
	return mean ;
		
	}
	public double calculateHighestRainfall() {

		double max=0;
		for(int i=0;i<this.rainfallMonth.length;i++) {
			
			if(rainfallMonth[i]>=max) {
				max=rainfallMonth[i];
			}
		}
		
		return max;
	}
	
	public void enterData(double[] data) {
		
		for(int i=0;i<this.rainfallMonth.length;i++) {
			
			this.rainfallMonth[i] = data[i];
		}
	}
	public double getRainfallMonth(String month) {
		
		double rainfall = 0;
		switch(month){
		case"JANUARY": 
			rainfall=this.rainfallMonth[0];
			break;
		case"FEBRUARY": 
			rainfall=this.rainfallMonth[1];
			break;
		case"MARCH": 
			rainfall=this.rainfallMonth[2];
			break;
		case"APRIL": 
			rainfall=this.rainfallMonth[3];
			break;
		case"MAY": 
			rainfall=this.rainfallMonth[4];
			break;
		case"JUNE": 
			rainfall=this.rainfallMonth[5];
			break;
		case"JULY": 
			rainfall=this.rainfallMonth[6];
			break;
		case"AUGUST": 
			rainfall=this.rainfallMonth[7];
			break;
		case"SEPTEMBER": 
			rainfall=this.rainfallMonth[8];
			break;
		case"OCTOBER": 
			rainfall=this.rainfallMonth[9];
			break;
		case"NOVEMBER": 
			rainfall=this.rainfallMonth[10];
			break;
		case"DECEMBER" : 
			rainfall=this.rainfallMonth[11];
			break;
		default:
			break;
			
		}
		return rainfall;
	}
}
