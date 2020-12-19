package coursework_question2;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
/**
 * Trader.java
 * 
 * This class store and validate detail of an Advert in a fields and perform a validation whether an offer from buyer have pass 
 * a condition to purchase a car or not and display a detail of a sold cars ,unsold cars and statistics in a Trade.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Trader {

		//Name of a Trader.
		protected String name=null;
		//HashMap of car available for sale.
		protected Map<Advert,User> carsForSale;
		//HashMap of a sold cars.
		protected Map<Advert,User> soldCars;
		//Hashmap of a unsold csrs
		protected Map<Advert,User> unsoldCars;
		
	
	/**Constructor requiring the name.
	 * 
	 * @param name
	 */
	public Trader(String name) {
		super();
		//Initialized the input parameter in field name
		this.name =name;
		//Declare Three HashMap in a Constructor
		this.carsForSale =new HashMap<Advert,User>();
		this.soldCars    =new HashMap<Advert,User>();
		this.unsoldCars  =new HashMap<Advert,User>();
		
		
	}
	
	
	/**Method to register the car an Auctioneer for a sale.
	 * 
	 * @param carAdvert of car.
	 * @param user of car.
	 * @param colour of car.
	 * @param type of car.
	 * @param body of car.
	 * @param noOfSeats of car.
	 * @throws IllegalArgumentException
	 */
	public void registerCar(Advert carAdvert,User user,String colour,CarType type,CarBody body,int noOfSeats) throws IllegalArgumentException{
		/** Validation **/
		//If input parameter is null throw IllegalArgumentException
		if(carAdvert == null||user == null) {
			 throw new IllegalArgumentException();
		 }else {
			 //Check if the HashMap carsForSale does not contain a same key as value of carAdvert
			 if(this.carsForSale.containsKey(carAdvert)==false) {
				 //Initialized a details to an object carAdvert
				 carAdvert.getCar().setBody(body);
				 carAdvert.getCar().setColour(colour);
				 carAdvert.getCar().setNumberOfSeats(noOfSeats);
				 carAdvert.getCar().setGearbox(type);
				 carAdvert.getHighestOffer();
				//Put a carAdvert and user in HashMap
				 this.carsForSale.put(carAdvert,user);
				
			 }
		 	}
		}
	
	/**Check whether car is available for sale or not
	 * 
	 * @param car object to check existence
	 * @return exist if car available return true
	 */
	private boolean checkExistence(Car car) {
		//Create boolean exist as false as a default value.
		boolean exist=false;
		
		//Use for each loop to run an entire Hash map.       
		for(Map.Entry<Advert,User> forsale : this.carsForSale.entrySet()) {
			
			//Check whether the car is available for sale by checking if the input parameter car is available in Hash map carForsale. 
			if(forsale.getKey().getCar()==car) {
				//If the condition is true ,initialize exist as true.
				exist=true;
			}
		}
		return exist;
	}
	
	/**Check a detail of a buyer whether it is qulify to purchase a car or not.
	 * 
	 * @param carAdvert of a car.
	 * @param user buyer of a car
	 * @param value of an offer to purchase a car
	 * @return codition of a placeoffer
	 * @throws IllegalArgumentException
	 */
	public boolean placeOffer(Advert carAdvert,User user,double value)throws IllegalArgumentException {
		boolean placeoffer=false;
		/** Validation **/
		//If input parameter is null throw IllegalArgumentException
		if(carAdvert==null || user == null) {
			throw new IllegalArgumentException();
		}else {
			//Use checkExistence method to check is the car is available in Hash map or not
			if(this.checkExistence(carAdvert.getCar())) {
				//If yes then use placeOffer method to check whether the value is greater than car value or not
				if(carAdvert.placeOffer(user, value)) {
				//If yes initialized true in placeoffer
				placeoffer =true;
				
				//Put carAdvert and user in HashMap
				this.soldCars.put(carAdvert, user);	
			}
			// Use method endSale  to remove a car from carForSale
			this.endSale(carAdvert);
		}
		}
		return placeoffer;
	}
	/**Display all sold car with details of a purchased
	 * 
	 * @return soldcar details
	 */
	public String displaySoldCars() {
		//Create Decimal Format object to make a double value in two decimal places
		DecimalFormat decimalplace =new DecimalFormat(".00");
		//Create StringBuffer to store a value of String 
		StringBuffer soldcar = new StringBuffer();
		soldcar.append("SOLD CARS:\n");
		//Use for each loop to run an entire HashMap
		for(Map.Entry<Advert,User> sold : this.soldCars.entrySet()) {
			
			//Add a String value  by getting a carID ,name of a buyer and price of a bid.
			soldcar.append(sold.getKey().getCar().getID()+" - Purchased by "+sold.getValue().getName()+" with a successful £"+decimalplace.format(sold.getKey().getHighestOffer().getValue())+" bid. \n");		
		}
		return soldcar.toString();
	}
	
	/**Method to displat Statistic.
	 * 
	 * @return statistics
	 */
	public String displayStatistics() {
		String statistics="Statistics";
		
		return statistics;
	}
	
	/**Display all unsold car with details specification and price of a car
	 * 
	 * @return unsoldcar details
	 */
	public String displayUnsoldCars() {
		//Create StringBuffer to store a value of String 
		StringBuffer unsoldcar = new StringBuffer();
		
		unsoldcar.append("UNSOLD CARS:\n");
		//Use for each loop to run an entire HashMap
		for(Map.Entry<Advert,User> unsold : this.unsoldCars.entrySet()) {
		//Add s String value of advertisement of a car
		unsoldcar.append(unsold.getKey().toString()+"\n");	
		}
		return unsoldcar.toString();
		
	}
	
	
	/**Method to manage whether the car has been sell or not.
	 * 
	 * @param advert
	 * @throws IllegalArgumentException
	 */
	private void endSale(Advert advert)throws IllegalArgumentException {
		/** Validation **/
		//If input parameter is null throw IllegalArgumentException
		if(advert == null) {
			throw new IllegalArgumentException();
		}
		else {
			//Check whether the Highest offer is greater than car price or not
			if(advert.getHighestOffer().getValue()>advert.getCar().getPrice()) {
				//If its true remove advert from HashMap CarForSale
				this.carsForSale.remove(advert);
				
			}else {
				//if its false put advert in unsoldCar HashMap with value of User is null
			this.unsoldCars.put(advert, null);
				//remove advert from HashMap CarForSale
			this.carsForSale.remove(advert);
			
			}
		}
		
	}
}