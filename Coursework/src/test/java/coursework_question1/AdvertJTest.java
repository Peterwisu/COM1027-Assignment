package coursework_question1;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
/**
 * AdvertJTest.java
 * 
 * This is a Junit Test class to test a function in an Advert class to check ,Is a function is properly work as expect.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class AdvertJTest {
	
	Advert advert =null;
	/**White Box Testing 
	 * 
	 *  Testing a constructor of a Advert Class with a valid value in its input parameter.
	 */
	@Test
	public void Coursework_testAdvertConstruction() {
		//create valid car object
		Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
		// put a car object as its input parameter.
		advert = new Advert(car);
		
	}
	
	/**White Box Testing
	 * 
	 * Testing a Validtion in a constructor of a Advert class
	 */
	@Test(expected = IllegalArgumentException.class)
	public void coursework_testInvalidAdvertCar() {
		//put a null value in an input parameter of advert  which should throws  IllegalArgumentException.
		advert = new Advert(null);
	}
	
	/**White Box Testing
	 * 
	 * 	Testing a getter of a car attribute in a Advert.
	 */
	@Test
	public void Coursework_testGetCar() {
	
		//create valid car object
		Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
		//create a Advert object and put a car object as its input parameter.
		Advert advert = new Advert(car);
		//use AssertEquals method to check a getter of a car object inside a Advert constuctor whether its has return a correct value.
		assertEquals(car,advert.getCar());
		
		
	}

	/**White Box Testing
	 * 
	 * 	Testing a getHighestOffer method to return an offer which have a highest value in Advert.
	 */
	@Test
	public void Coursework_testGetHighestOffer() {
		//Create three new user 
		User user1 = new User("Stella Kazamia");
		User user2 = new User("Alice Wonderland");
		User user3 = new User("Adam Hills");
		Offer offer1 = new Offer(user1, 10000);
		Offer offer2 = new Offer(user2, 20000);
		Offer offer3 = new Offer(user3, 30000);
		List<Offer> offerlist = new ArrayList<Offer>();
		//create valid car object
		Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
		// put a car object as its input parameter.
		advert = new Advert(car);
		//Use add built in method of ArrayList to add a offer to a array.
		offerlist.add(offer1);
		offerlist.add(offer2);
		offerlist.add(offer3);
		//Use setter to set a ArrayList offerlist into a ArrayList in an advert
		advert.setOffers(offerlist);
		//Use AssertEqual to check a highest offer which should be offer 3 because its has highest value from all three offer.
		assertEquals(offer3,advert.getHighestOffer());
		
	}
	
	/**White Box Testing
	 * 	
	 * Testing a PlaceOffer method in Advert whihc would return true if value of offer more then equal to car price
	 * and false if value of offer less than car price.
	 */
   @Test
   public void Coursework_testPlaceOffer() {
	   	//Create new user 
	   	User user1 = new User("Alice Wonderland");
	   	//create valid car object
	   	Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
	   	// put a car object as its input parameter.
		advert = new Advert(car);
		/**Testing by if value of offer is more than 20000 or equal which is price of car placeoffer should
		return true otherwise false
		using AssertTrue and AssertFalse */
		assertTrue(advert.placeOffer(user1, 21000));
		assertTrue(advert.placeOffer(user1, 20000));
		assertFalse(advert.placeOffer(user1, 19000));
   }
   	/**Black Box Testing
   	 * 
   	 *  Test a output String value which would display to a User to see an advert of a car.
   	 */
   	@Test
   	public void Coursework_testToString() {
   		//create valid car object
   		Car car = new Car(3456, "Toyota Corolla", 7000, Condition.USED);
   		//Identify attribute of a car
		car.setBody(CarBody.HATCHBACK);
		car.setColour("Blue");
		car.setGearbox(CarType.AUTOMATIC);
		car.setNumberOfSeats(5);
		// put a car object as its input parameter.
		advert = new Advert(car);
		//Use AssertEqual to check a String value return from to string in an Advert whether it has return a correct value and correct format.
		assertEquals("Ad: "+"3456 - Toyota Corolla (£7000.00)\n" + "	 Type: AUTOMATIC\n" + "	 Style: HATCHBACK\n"
				+ "	 Colour: Blue\n" + "	 No. of Seats: 5\n" + "	 Condition: USED",advert.toString());
		
   	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
