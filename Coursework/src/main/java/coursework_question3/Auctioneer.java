package coursework_question3;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
/**
 * Auctioneer.java
 * 
 * This class store and validate detail of an Advert in a fields and perform a validation whether an offer from buyer have pass 
 * a condition to purchase a car or not and display a detail of a sold cars ,unsold cars and statistics in an Aunction.
 * 
 *This class extends Dealership.java class
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Auctioneer extends Dealership {
	
	//Name of a Auctioneer.
	protected String name=null;
	//HashMap of car available for sale.
	protected Map<Advert,Seller> carsForSale;
	//HashMap of a sold cars.
	protected Map<Advert,Buyer> soldCars;
	//Hashmap of a unsold cars
	protected Map<Advert,Seller> unsoldCars;
	//HashMap of Seller and a number of sales
	private Map<Seller,Integer> sales;
	//Seller with the highest sell
	private Seller topSeller=null;
	
	/**
	 * 
	 * Constructor requiring the name.
	 * 
	 * @param name of an Auctioneer
	 */
	public Auctioneer(String name) {
		super();
		//Initialized the input parameter in field name
		this.name =name;
		//Declare Three HashMap in a Constructor
		this.carsForSale =new HashMap<Advert,Seller>();
		this.soldCars    =new HashMap<Advert,Buyer>();
		this.unsoldCars  =new HashMap<Advert,Seller>();
		this.sales		 =new HashMap<Seller,Integer>();
	}
	
	
	/**Display all sold car with details of a purchased
	 * 
	 * @return soldcar details
	 */
	@Override
	public String displaySoldCars() {
		//Create Decimal Format object to make a double value in two decimal places
		DecimalFormat decimalplace =new DecimalFormat(".00");
		//Create StringBuffer to store a value of String 
		StringBuffer soldcar = new StringBuffer();
		soldcar.append("SOLD CARS:\n");
		//Use for each loop to run an entire HashMap
		for(Entry<Advert, Buyer> sold : this.soldCars.entrySet()) {
			
			//Add a String value  by getting a carID ,name of a buyer and price of a bid.
			soldcar.append(sold.getKey().getCar().getID()+" - Purchased by "+sold.getValue().toString()+" with a successful £"+decimalplace.format(sold.getKey().getHighestOffer().getValue())+" bid. \n");
			
			
		}	
		return soldcar.toString();
	}
	
	
	/**Method to displat Statistic.
	 * 
	 * @return statistics
	 */
	public String displayStatistics() {
		String statistic="Statistics";
		
		return statistic;
	}
	
	/**Display all unsold car with details specification and price of a car
	 * 
	 * @return unsoldcar details
	 */
	@Override
	public String displayUnsoldCars() {
		//Create StringBuffer to store a value of String 
		StringBuffer unsoldcar = new StringBuffer();
		
		unsoldcar.append("UNSOLD CARS:\n");
		//Use for each loop to run an entire HashMap
		for(Entry<Advert, Seller> unsold : this.unsoldCars.entrySet()) {
		//Add s String value of advertisement of a car	
		unsoldcar.append(unsold.getKey().toString()+"\n");
			
		}
		
		return unsoldcar.toString();
		
	}

	
	/**Check a detail of a buyer whether it is qulify to purchase a car or not.
	 * 
	 * @param carAdvert of a car.
	 * @param user buyer of a car
	 * @param value of an offer to purchase a car
	 * @return codition of a placeoffer
	 * @throws IllegalArgumentException
	 */
	@Override
	public boolean placeOffer(Advert carAdvert,User user,double value) throws IllegalArgumentException{
		boolean placeoffer=false;
		/** Validation **/
		//If input parameter is null throw IllegalArgumentException
		if(carAdvert==null || user == null) {
			throw new IllegalArgumentException();
		}else {
			//Use checkExistence method to check is the car is available in Hash map or not.
			if(this.checkExistence(carAdvert.getCar())) {
			//If yes then use placeOffer method to check whether the value is greater than car value or not
			if(carAdvert.placeOffer(user, value)) {
				//If yes initialized true in placeoffer
				placeoffer =true;
				//Put carAdvert and user in HashMap
				this.soldCars.put(carAdvert,  (Buyer) user);
			}
				//If highest offer caradvert is equal to value of input parameter and Car sale type is Auction.
				else if(carAdvert.getHighestOffer().getValue()==value&&carAdvert.getCar().getType()==SaleType.AUCTION){
					//if true place off is true
					placeoffer =true;
					//Put carAdvert and user in HashMap
					this.soldCars.put(carAdvert,  (Buyer) user);
					
				}else {
					//If not match any condition placeoffer is false
					placeoffer=false;
			}
			
		}
		}
		return placeoffer;
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
	@Override
	public void registerCar(Advert carAdvert,User user,String colour,CarType type,CarBody body,int noOfSeats)throws IllegalArgumentException {
		/** Validation **/
		//If input parameter is null throw IllegalArgumentException.		
		if(carAdvert == null||user == null) {
			 throw new IllegalArgumentException();
		 }else {
			//Check if the HashMap carsForSale does not contain a same key as value of carAdvert.				
			 if(this.carsForSale.containsKey(carAdvert)==false) {
				 //Initialized a details to an object carAdvert
				 carAdvert.getCar().setBody(body);
				 carAdvert.getCar().setColour(colour);
				 carAdvert.getCar().setNumberOfSeats(noOfSeats);
				 carAdvert.getCar().setGearbox(type);
				 carAdvert.getHighestOffer();
				//Put a carAdvert and user in HashMap
				 this.carsForSale.put(carAdvert,(Seller) user);
			 }
			 
			 
		 }	
	}


	/**Check whether car is available for sale or not
	 * 
	 * @param car object to check existence
	 * @return exist if car available return true
	 * @throws IllegalArgumentException
	 */
	private boolean checkExistence(Car car) {
		//Create boolean exist as false as a default value.
		boolean exist=false;
		//Use for each loop to run an entire Hash map.       
		for(Entry<Advert, Seller> forsale : this.carsForSale.entrySet()) {
			//Check whether the car is available for sale by checking if the input parameter car is available in Hash map carForsale. 			
			if(forsale.getKey().getCar()==car) {
				//If the condition is true ,initialize exist as true.
				exist=true;
			}
		}		
		return exist;
	}
	
	/**Method to manage whether the car has been sell or not. 
	 * 
	 * @param advert
	 * @throws IllegalArgumentException
	 */	
	public void endSale(Advert advert)throws IllegalArgumentException {
		/** Validation **/
		//If input parameter is null throw IllegalArgumentException
				if(advert == null) {
					throw new IllegalArgumentException();
				}
				else {
					//Check whether the Highest offer  is greater than car price or not
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
