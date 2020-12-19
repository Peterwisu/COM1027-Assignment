package coursework_question4;

import java.util.ArrayList;

import java.util.List;
/**
 * 
 * Advert.java
 * 
 * This class store an attribute of a car in constructor also, validate it and get a highest value of offer and compare to a price of a car
 * whether it is pass a condition for sell or not.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Advert {
	
	
	//Create Car object;
	private Car car=null;
	//Create list of offers
	private List<Offer> offers;
	
	/**
	 * Constructor requiring the car.
	 * 
	 * @param car 
	 * @throws IllegalArgumentException
	 */
	public Advert(Car car)throws IllegalArgumentException {
		super();
		/** Validation **/
		//If input parameter is null throw IllegalArgumentException
		if(car==null) {
			throw new IllegalArgumentException();
		}else {
			//Else initialize value of input parameter to car
		this.car =car;
			//Declare Array list offers in Constructor
		this.offers = new ArrayList<Offer>();
		}
	}

	/**
	 * 
	 * @return 
	 */
	public Car getCar() {
		return car;
	}
	
	/**
	

	/**Method to get Highest offers price of a car.
	 * 
	 * @return highest offer of an advert
	 */
	public Offer getHighestOffer() { 
		// Create Offer highest to store a highest offers
		Offer highest=null;
		//Use for each loop run all the offer in the offers array list
		double max=0;
		for(Offer i : this.offers) {
			
			if(i.getValue()>=max) {  //If the  value of object at index i is greater than max else keep loopin
				
				max=i.getValue();  //The value of max is replace by value of object at index i
				
				highest=i;			// The object at index i is stored in highest
			}
		}
		
		
		
		return highest;
	}
	
	
	
	/**Check a detail of a offer whether it is qulify to purchase a car or not.
	 * 
	 * @param buyer
	 * @param value
	 * @return condition of offer
	 */
	public boolean placeOffer(User buyer,double value) {
		boolean offer=false;
		/*Validation to only allow buyer to buy a car by using 
		*toString which both seller and buyer have but return in different format
		**/
		//validate buyer to string with regular expression for buyer
		if(buyer.toString().matches("[A-Z]{1}[*]*[a-z]{1}")) {
			//if validation pass create new Offer object using input parameter
			Offer newoffers = new Offer(buyer,value);
			//if ArrayList offer is empty
			if(this.offers.isEmpty()) {
					//add newoffers to ArrayList offers
					this.offers.add(newoffers);
					//if highest offer is less than a value from input parameter
		   } else if(this.getHighestOffer().getValue()<value){
			   		//add newoffers to ArrayList offer
			   		this.offers.add(newoffers);
		   }
		
		 //Check if the offer value is less than car price if yes initialize false else initialize true.
	     if(value<this.car.getPrice()){
	    	 
			offer=false;
		
	     } else{
			
			offer =true;
		} 
	     
		}
		
		return offer;
	}

	
	/**Method to display Advertisement and Specification of a car.
	 * 
	 * @return  String value of Advertisement and Specification of a car.
	 */
	@Override
	public String toString() {
		return "Ad: "+this.car.displayCarSpecification();
	}


	
	

}
