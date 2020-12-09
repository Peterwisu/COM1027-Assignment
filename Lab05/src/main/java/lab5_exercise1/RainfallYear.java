package lab5_exercise1;
/**
 * This Class stored a information of a rainfall in one years and calculate a mean and highest rainfall in a year.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class RainfallYear {
	//Year of rainfall.
	private int year=0;
	//Array of Months contains data of rainfall.
	private double[] rainfallMonth;
	
	/**
	 * 
	 * @param year of Rainfall.
	 * 
	 */
	public RainfallYear(int year) {
		this.rainfallMonth=new double[12];
		this.year =year;
		
	}

	/**
	 * 
	 * 
	 * @return year of rainfall.
	 */
	public int getYear() {
		return year;
	}
	/**
	 * Method to calculate mean rainfall in a years.
	 * 
	 * @return mean of rainfall in a year.
	 */
	public double calculateMeanRainfall() {
		double total=0; 
		double mean;
		for(int i=0;i<this.rainfallMonth.length;i++) { // use loop to get all value in array.
			
			total=total+rainfallMonth[i];
		}
		mean=(total/12);
	return mean ;
		
	}
	/**
	 * Method to get a month which have highest rainfall.
	 * 
	 * @return highest rainfall in a year.
	 */
	public double calculateHighestRainfall() {

		double max=0;
		for(int i=0;i<this.rainfallMonth.length;i++) {  // use loop to get all value in array.
			
			if(rainfallMonth[i]>=max) { // if rainfall data  is greater than max.
				max=rainfallMonth[i]; 	//replace value of max by value of in Array rainfallMonth at index i.
			}
		}
		
		return max;
	}
	/**
	 * Method to initialize a value of input array to an array in a class.
	 * 
	 * @param data array cotains  data of rainfall in a month.
	 */
	public void enterData(double[] data) {
		
		for(int i=0;i<this.rainfallMonth.length;i++) {  // use loop to get all value in array.
			
			this.rainfallMonth[i] = data[i]; //initialize a value of Array rainfallMonth at Index i from Array data at Index i.
		}
	}
	/**
	 * Method to get a value of rainfall in a selected months.
	 * 
	 * @param month Name of a month.
	 * @return	data of month from an input parameter.
	 */
	public double getRainfallMonth(String month) {
		//Use swtich case to compare which cases name are match name of a mont from input parameter and execute a line  in a code.
		double rainfall = 0;
		switch(month){ 						//compare input month to a cases in a switch case.
		case"JANUARY": 						//if input month is January this case will be execute.
			rainfall=this.rainfallMonth[0]; //initialized value of rainllfallmonth at index 0 to rainfall.
			break;							// exit from switch case.
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
			// if the input value does not match name of case then it will come to default.
		default:
			//exit from Switch case.
			break;
			
		}
		return rainfall;
	}
}
