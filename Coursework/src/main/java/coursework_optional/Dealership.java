package coursework_optional;

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
 * Dealership.java
 * 
 * This class is a abstract class of Aunctioneer and Trader class which will validate a sale of a car and display a detail of a sold cars ,unsold cars and statistics.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Dealership {
	//Name of a Auctioneer.
		protected String name;
		//HashMap of car available for sale.
		protected Map<Advert,Seller> carsForSale;
		//HashMap of a sold cars.
		protected Map<Advert,Buyer> soldCars;
		//Hashmap of a unsold cars
		protected Map<Advert,Seller> unsoldCars;
		
		
		/**
		 * 
		 * Constructor requiring the name.
		 * 
		 * @param name of an Auctioneer
		 */
		public Dealership(String name) {
			super();
			//Initialized the input parameter in field name
			this.name =name;
			//Declare Four HashMap in a Constructor
			this.carsForSale =new HashMap<Advert,Seller>();
			this.soldCars    =new HashMap<Advert,Buyer>();
			this.unsoldCars  =new HashMap<Advert,Seller>();
			
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
			for(Entry<Advert, Buyer> sold : this.soldCars.entrySet()) {
				
				//Add a String value  by getting a carID ,name of a buyer and price of a car and number of purchase.
				soldcar.append(sold.getKey().getCar().getID()+" - Purchased by "+sold.getValue().toString()+" at "+decimalplace.format(sold.getKey().getHighestOffer().getValue())+" (purchased "+sold.getKey().getCar().getPurchased()+") \n");
				
				
			}	
			return soldcar.toString();
		}
		/**Method to read a file "Dealership_Statistic.txt" and obtain value from a file a display a Statistic value in a file
		 * 
		 * @return statistics of an Dealership Car sale showing a Top seller and a percentage of sale in two different type of car
		 */
		public String displayStatistics(){
			//create a StringBuffer object name display
			StringBuffer display = new StringBuffer();
			//add a Statistic title in a StringBuffer display
			
			//Read a file
			try {
				//create a BufferedReader object name read which is a wrapped class FileReader that read a file name "auction_statistics.txt"
				BufferedReader read=new BufferedReader(new FileReader("Dealership_Statistic.txt"));
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

		public boolean placeOffer(Advert carAdvert,User user,double value,int numberofpurchase) throws IllegalArgumentException{
			boolean placeoffer=false;
			/** Validation **/
			//If input parameter is null throw IllegalArgumentException
			if(carAdvert==null || user == null||numberofpurchase<0||numberofpurchase>carAdvert.getCar().getInstock()) {
				throw new IllegalArgumentException();
			}else {
				//Use checkExistence method to check is the car is available in Hash map or not.
				if(this.checkExistence(carAdvert.getCar())) {
				//If yes then use placeOffer method to check whether the value is greater than car value or not
				if(carAdvert.placeOffer(user, value,numberofpurchase)) {
					//If yes initialized true in placeoffer
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
				if(forsale.getKey().getCar()==car) {
				
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
							
						}else if(advert.getCar().getInstock()!=0){
							//if its true put advert in unsoldCar HashMap with value of User is null
							this.unsoldCars.put(advert, null);
							//remove advert from HashMap CarForSale
							this.carsForSale.remove(advert);
						}
					}
					this.saveInFile();
				}
		
		
		
		/**Method to write down a detail of car sell in a file
		 * 
		 * @param noOfSales 
		 * @param percentageOfUsed
		 * @param percentageOfNew
		 */
		private void saveInFile() {
			//Create new file name auctionfile which its "auction_statistics.txt"
			File auctionfile = new File("Dealership_Statistic.txt");
			//Write a file
			try {
				//Create BufferedWriter object name write which is a wrapped class of FileWriter to write a file auctionfile
				BufferedWriter writefile= new BufferedWriter(new FileWriter(auctionfile));
				writefile.write(this.displaySoldCars()+"\n\n");
				writefile.write(this.displayUnsoldCars());
				
				//Close write function
				writefile.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		

		
		
		
}
