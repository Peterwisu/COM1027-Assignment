package coursework_question3;

import java.util.Map;
/**
 * Dealership.java
 * 
 * This class is a abstract class of Aunctioneer and Trader class which will validate a sale of a car and display a detail of a sold cars ,unsold cars and statistics.
 * 
 * @author Wish Suharitdamrong
 *
 */
public abstract class Dealership {
	//Name of a Dealership
	protected String name=null;
	//HashMap of car available for sale.
	protected Map<Advert,Seller> carsForSale;
	//HashMap of a sold cars.
	protected Map<Advert,Buyer> soldCars;
	//Hashmap of a unsold cars
	protected Map<Advert,Seller> unsoldCars;
	
	/**Display all sold car with details of a purchased
	 * 
	 * @return soldcar details
	 */
	public abstract String displaySoldCars();
	/**Method to displat Statistic.
	 * 
	 * @return statistics
	 */
	public abstract String displayStatistics();
	/**Display all unsold car with details specification and price of a car
	 * 
	 * @return unsoldcar details
	 */
	public abstract String displayUnsoldCars();
	/**Check a detail of a buyer whether it is qulify to purchase a car or not.
	 * 
	 * @param carAdvert of a car.
	 * @param user buyer of a car
	 * @param value of an offer to purchase a car
	 * @return codition of a placeoffer
	 * @throws IllegalArgumentException
	 */
	public abstract boolean  placeOffer(Advert carAdvert,User user,double value)throws IllegalArgumentException;
	/**Method to register the car for an Dealership for a sale.
	 * 
	 * @param carAdvert of car.
	 * @param user of car.
	 * @param colour of car.
	 * @param type of car.
	 * @param body of car.
	 * @param noOfSeats of car.
	 * @throws IllegalArgumentException
	 */
	public abstract void registerCar(Advert car,User user,String colour,CarType type,CarBody body,int numberofseat)throws IllegalArgumentException;

	
}
