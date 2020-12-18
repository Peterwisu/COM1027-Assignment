package coursework_question2;

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
	private Car car;
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
	 * @return Car
	 */
	public Car getCar() {
		return car;
	}
	
	/**
	 * 
	 * @return Offer
	 */
	public List<Offer> getOffers() {
		return offers;
	}

	/**Method to get Highest offers price of a car.
	 * 
	 * @return highest offer of an advert
	 */
	public Offer getHighestOffer() { 
		// Create Offer highest to store a highest offers
		Offer highest=null; 
		// Create double max to compare all value of each offer in array list
		double max=0;
		//Use for each loop run all the offer in the offers array list
		for(Offer i : this.offers) {
			
			if(i.getValue()>=max) { //If the  value of object at index i is greater than max else keep looping
				
				max=i.getValue(); //The value of max is replace by value of object at index i
				
				highest=i;		// The object at index i is stored in highest
			}
		}
		return highest;
	}
	
	
	
	/**
	 * 
	 * @param offers 
	 */
	public void setOffers(List<Offer> offers) {
		this.offers = new ArrayList<Offer>(offers);
	}

	/**Check a detail of a offer whether it is qulify to purchase a car or not.
	 * 
	 * @param buyer
	 * @param value
	 * @return condition of placeoffer
	 */
	public boolean placeOffer(User buyer,double value) {
		boolean offer;
		//create new offer object.
		Offer newoffer = new Offer(buyer,value);
		this.offers.add(newoffer);
		//Check if the offer value is less than car price if yes initialize false else initialize true.
		if(value<this.car.getPrice()) {
			offer=false;
		}else {
			offer=true;
		}
		
		
		return offer;
	}

	
	/**Method to display Advertisement and Specification of a car.
	 * 
	 * @return String value of Advertisement and Specification of a car.
	 */
	@Override
	public String toString() {
		
		return "Ad: "+this.car.displayCarSpecification();
	}


	
	
	

}
