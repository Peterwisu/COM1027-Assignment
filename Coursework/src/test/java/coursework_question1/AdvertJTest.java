package coursework_question1;

import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import org.junit.Test;
/**
 * 
 * @author Wish Suharitdamrong
 *
 */
public class AdvertJTest {
	
	
	
	@Test
	public void Coursework_testAdvert() {
		
		Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
		Advert advert = new Advert(car);
		
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void coursework_testInvalidAdvertCar() {
		
		Advert advert = new Advert(null);
	}
	
	
	@Test
	public void Coursework_testConstruction() {
		User user1 = new User("Stella Kazamia");
		User user2 = new User("Alice Wonderland");
		User user3 = new User("Adam Hills");
		Offer offer1 = new Offer(user1,1000);
		Offer offer2 = new Offer(user2,2000);
		Offer offer3 = new Offer(user3,3000);
		Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
		Advert advert = new Advert(car);
		List<Offer> offerlist = new ArrayList<Offer>();
		offerlist.add(offer1);
		offerlist.add(offer2);
		offerlist.add(offer3);
		advert.setOffers(offerlist);
		assertEquals(car,advert.getCar());
		assertEquals(offerlist,advert.getOffers());
		
	}

	
	@Test
	public void Coursework_testGetHighestOffer() {
		User user1 = new User("Stella Kazamia");
		User user2 = new User("Alice Wonderland");
		User user3 = new User("Adam Hills");
		Offer offer1 = new Offer(user1,10000);
		Offer offer2 = new Offer(user2,20000);
		Offer offer3 = new Offer(user3,30000);
		List<Offer> offerlist = new ArrayList<Offer>();
		Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
		Advert advert = new Advert(car);
		
		offerlist.add(offer1);
		offerlist.add(offer2);
		offerlist.add(offer3);
		advert.setOffers(offerlist);
		
		
		assertEquals(offer3,advert.getHighestOffer());
		
	}
	
   @Test
   public void Coursework_testPlaceOffer() {
	   
	   	User user1 = new User("Alice Wonderland");
	   	Car car = new Car(1234,"Mazda 3",20000,Condition.NEW);
		Advert advert = new Advert(car);
		
		assertTrue(advert.placeOffer(user1, 20000));
		assertFalse(advert.placeOffer(user1, 19000));
   }
   
   	@Test
   	public void Coursework_testToString() {
   		Car car = new Car(3456, "Toyota Corolla", 7000, Condition.USED);

		car.setBody(CarBody.HATCHBACK);
		car.setColour("Blue");
		car.setGearbox(CarType.AUTOMATIC);
		car.setNumberOfSeats(5);
		
		Advert advert = new Advert(car);
		
		assertEquals("Ad: "+"3456 - Toyota Corolla (£7000.00)\n" + "	 Type: AUTOMATIC\n" + "	 Style: HATCHBACK\n"
				+ "	 Colour: Blue\n" + "	 No. of Seats: 5\n" + "	 Condition: USED",advert.toString());
		
   	}
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}
