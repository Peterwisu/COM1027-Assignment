package coursework_question4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/**
 * Trader.java
 * 
 * This class store and validate detail of an Advert in a fields and perform a validation whether an offer from buyer have pass 
 * a condition to purchase a car or not and display a detail of a sold cars ,unsold cars and statistics in a Trade.
 * 
 * This class extends Dealership.java class
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Trader extends Dealership {

	//Name of a Trader
	protected String name;
	//HashMap of car available for sale.
	protected Map<Advert,Seller> carsForSale;
	//HashMap of a sold cars.
	protected Map<Advert,Buyer> soldCars;
	//Hashmap of a unsold cars
	protected Map<Advert,Seller> unsoldCars;
	//List of a seller
	private List<Seller> seller;
	/**
	 * Constructor requiring the name.
	 * 
	 * @param name of a Trader
	 */
	public Trader(String name) {
		super();
		//Initialized the input parameter in field name
		this.name =name;
		//Declare Three HashMap in a Constructor
		this.carsForSale =new HashMap<Advert,Seller>();
		this.soldCars    =new HashMap<Advert,Buyer>();
		this.unsoldCars  =new HashMap<Advert,Seller>();
		//Initialized a Seller ArrayList
		this.seller 	 =new ArrayList<Seller>();
		
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
	/***Method to read a file "trade_statistics.txt" and obtain value from a file a display a Statistic value in a file
	 * 
	 * @return statistics of a Trader contain total sales and detail Rating level of seller.
	 */
	@Override
	public String displayStatistics() {
		//create a StringBuffer object name display
		StringBuffer display = new StringBuffer();
		//add a Statistic title in a StringBuffer display
		display.append("** Trader - AutoTrader**\n");
		//Read a file
		try {
			//create a BufferedReader object name read which is a wrapped class FileReader that read a file name "trade_statistics.txt"
			BufferedReader read= new BufferedReader(new FileReader("trade_statistics.txt"));
			//read a first line of file and store in a String s
			String s =read.readLine();
			//While s is not null keep looping
			while (s!=null) {
				//add String a value from a file
				display.append(s+"\n");
				//read next line of a file
				s=read.readLine();
				
			}
			//close a readline function from BufferedReader.
			read.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return display.toString();
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
				//End sale this advert
				this.endSale(carAdvert);
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
	public void registerCar(Advert carAdvert,User user,String colour,CarType type,CarBody body,int noOfSeats) throws IllegalArgumentException{
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
				 //Cast a user from User to Seller which is class that extends to a abstract User class
				 Seller seller = (Seller) user;
				 //Use method updateStatistic to update Statistic of a seller
				 this.updateStatistic(seller);
				 //Increase no. of sales of this seller by using addsale method from Seller class
				 seller.addsale();
				
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
	/**Method to write down a detail of car sell in a file
	 * 
	 * @param noOfSales total sale in a trader
	 */
	private void saveInFile(int noOfSales) {
		//Create new file name traderfile which its "trade_statistics.txt"
		File traderfile = new File("trade_statistics.txt");
		//Write a file
		try {
			//Create BufferedWriter object name write which is a wrapped class of FileWriter to write a file traderfile		
			BufferedWriter write= new BufferedWriter(new FileWriter(traderfile));
			//Write a String value with specific format and detail in a file
			write.write("Total Sales: "+noOfSales+"\n");
			write.write("All Sellers:\n");
			//Use loop to reach all seller in a ArrayList seller
			for(Seller i:this.seller) {
				//get a toString value from a seller and write down in a file.
				write.write("	"+i.toString()+"\n");
			}
			//close a write function
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}
	/**Method to update a Statistic of a car sell from a seller
	 * 
	 * @param seller
	 */
	private void updateStatistic(Seller seller) {
		//counter for total sale
		int total=0;
		
		//Check if seller is already exist in Array
		if(this.seller.contains(seller)==false) {
			//if not add seller to array
			this.seller.add(seller);
		}
		//use foreach loop to reach all seller in array
		for(Seller i:this.seller) {
		//get a sale of seller at i and add to a total to get total sale
		total+=i.getSales();
		}
			
		//Call method saveInFile and put total in a method parameter to write a value in a file "trade_statistics.txt"
		this.saveInFile(total);
		
	}
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}