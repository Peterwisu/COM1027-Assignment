package coursework_question4;

import java.io.BufferedReader;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
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
 * This class extends Dealership.java class
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
	private Seller	topSeller=null;
	
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
		//Declare Four HashMap in a Constructor
		this.carsForSale =new HashMap<Advert,Seller>();
		this.soldCars    =new HashMap<Advert,Buyer>();
		this.unsoldCars  =new HashMap<Advert,Seller>();
		this.sales 		 =new HashMap<Seller,Integer>();
		
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
	/**Method to read a file "auction_statistics.txt" and obtain value from a file a display a Statistic value in a file
	 * 
	 * @return statistics of an Auctioneer Car sale showing a Top seller and a percentage of sale in two different type of car
	 */
	@Override
	public String displayStatistics(){
		//create a StringBuffer object name display
		StringBuffer display = new StringBuffer();
		//add a Statistic title in a StringBuffer display
		display.append("** Auctioneer - Cars Ltd**\n");
		//Read a file
		try {
			//create a BufferedReader object name read which is a wrapped class FileReader that read a file name "auction_statistics.txt"
			BufferedReader read=new BufferedReader(new FileReader("auction_statistics.txt"));
			//read a first line of file and store in a String s
			String s=read.readLine();
			//While s is not null keep looping
			while(s!=null) {
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
		//Add an Unsold car title
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
				 //Cast a user from User to Seller which is class that extends to a abstract User class
				 Seller seller= (Seller) user;
				 //Use method add addsaleCarType to differentiate no. of car type sales and
				 this.addsaleCarType(seller,type);
				 //Use method updateStatistic to update Statistic of a seller
				 this.updateStatistics(seller);			 
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
	
	
	
	/**Method to write down a detail of car sell in a file
	 * 
	 * @param noOfSales 
	 * @param percentageOfUsed
	 * @param percentageOfNew
	 */
	private void saveInFile(int noOfSales,double percentageOfUsed,double percentageOfNew) {
		//Create new file name auctionfile which its "auction_statistics.txt"
		File auctionfile = new File("auction_statistics.txt");
		//Write a file
		try {
			//Create BufferedWriter object name write which is a wrapped class of FileWriter to write a file auctionfile
			BufferedWriter write= new BufferedWriter(new FileWriter(auctionfile));
			//Write a String value with specific format and detail in a file
			write.write("Total Auction Sales: "+noOfSales+"	 Automatic Cars: "+percentageOfUsed+"%	 Manual Cars: "+percentageOfNew+"%\n");
			write.write("Top Seller: "+this.topSeller.toString()+"\n");
			//Close write function
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**Method to update a Statistic of a car sell from a seller
	 * 
	 * 
	 * @param seller
	 */
	private void updateStatistics(Seller seller) {
		
		//Identify a Top Seller in Aunction
		
		//put a Seller and number of sell in HashMap<Seller,Integer> sale respectively
		this.sales.put(seller, seller.getSales());
		//use for each loop to get through all value in HashMap and  use .entrySet to entry a HashMap
		for(Map.Entry<Seller, Integer> i: this.sales.entrySet()) {
			//if top seller is null
			if(this.topSeller==null) {
				//If top seller is nullTop Seller is a Seller at i (use .getKey to get  Seller at i)
				this.topSeller = i.getKey();
				//If number of sales from Top Seller  less than a seller at i (use .getValue to get number of sale from Seller at i)
				} else if(this.topSeller.getSales()<i.getValue()) {
					//If condition is true replace a top seller by Seller at i (use .getKey to get  Seller at i)
					this.topSeller =i.getKey();
				}
			
		}
		//Total sale of a top seller
		int total=this.topSeller.getSales();
		
		
		/*Use method saveInFile()
		 * saveInFile(number of sale,percentage number of automatic gear car sales,percentage number of manual gear car sales)
		 * Use thid method to update Statistic to show a stat of a car sale from top seller
		 */
		this.saveInFile(total,this.topSeller.getAutosales()*100/total,this.topSeller.getManualsales()*100/total);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/**
	 * Implement method apart from UML Diagram
	 */
	
	/**This method is for counting and seperate number of car sale in different gear type Automatic gear and Manual gear.
	 * 
	 * @param seller of a car
	 * @param type of a car
	 */
	private void addsaleCarType(Seller seller,CarType type) {
		//Use addsale to increase no of car sell from seller
		seller.addsale();
		
		//Check a type of a car sell from seller
		//if CarType is AUTOMATIC
		if(type==CarType.AUTOMATIC) {
			//increase number of Automatic car sale
			seller.addCarTypeAutoSold();
		 }else //CarType is MANNUAL
		 {
			//increase number of Manual car sale
			seller.addCarTypeMannualSold();
		 }
		
	}
	
	
	
	

}