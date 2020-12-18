package coursework_optional;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;


import org.junit.Test;




public class DealershipJTest {
	Dealership dealership = null;

	@Test
	public void coursework_testDealershipConstructor() {
		dealership = new Dealership("Dealership");
	}

	@Test
	public void testDealershipPlaceoffer() {
		Car car1 = new Car(1234, "Toyota Corolla", 2000, Condition.USED, SaleType.AUCTION,5);
		
		Car car2 = new Car(2345, "Mercedes-Benz A Class", 15000, Condition.NEW, SaleType.FORSALE,10);
		
		Advert ad1 = new Advert(car1);
		Advert ad2 = new Advert(car2);
		
		
		Buyer user1 = new Buyer("Alice Wonderland", 50);

		Buyer user2 = new Buyer("Bob Ross", 50);
		Seller seller2 = new Seller("Adam Hills");
		Dealership dealer = new Dealership("optional");
		dealer.registerCar(ad2, seller2, "Blue", CarType.MANUAL, CarBody.HATCHBACK, 5);
		dealer.registerCar(ad1, seller2,"Red", CarType.AUTOMATIC, CarBody.MICRO, 4);
	
		assertTrue(dealer.placeOffer(ad1, user1, 2000,3));
		assertTrue(dealer.placeOffer(ad2, user2 , 15000,7));
		
		
	}
	@Test
	public void coursework_testDealershipFileStatistics() {
		Car car1 = new Car(1234, "Toyota Corolla", 2000, Condition.USED, SaleType.AUCTION,5);
		
		Car car2 = new Car(2345, "Mercedes-Benz A Class", 15000, Condition.NEW, SaleType.FORSALE,10);
		
		Advert ad1 = new Advert(car1);
		Advert ad2 = new Advert(car2);
		
		
		Buyer user1 = new Buyer("Alice Wonderland", 50);

		Buyer user2 = new Buyer("Bob Ross", 50);
		Seller seller2 = new Seller("Adam Hills");
		Dealership dealer = new Dealership("optional");
		dealer.registerCar(ad2, seller2, "Blue", CarType.MANUAL, CarBody.HATCHBACK, 5);
		dealer.registerCar(ad1, seller2,"Red", CarType.AUTOMATIC, CarBody.MICRO, 4);
	
		dealer.placeOffer(ad2, user2 , 15000,7);
		dealer.placeOffer(ad1, user1, 2000,3);
		dealer.endSale(ad2);
		
		dealer.endSale(ad1);
		
	
		
		
		assertEquals("SOLD CARS:\n1234 - Purchased by A***e at 2000.00 (purchased 3) \n"+
					"2345 - Purchased by B***b at 15000.00 (purchased 7) "+"\n"+"\n"+"\n"+
					"UNSOLD CARS:\nAd: 1234 - Toyota Corolla (£2000.00)  [ONLY 2 LEFT]\n"
					+"     Type: AUTOMATIC\n"
					+"     Style: MICRO\n"
					+"     Colour: Red\n"
					+"     No. of Seats: 4\n"
					+"     Condition: USED\n"
					+ "Ad: 2345 - Mercedes-Benz A Class (£15000.00)  [ONLY 3 LEFT]\n"
					+"     Type: MANUAL\n"
					+"     Style: HATCHBACK\n"
					+"     Colour: Blue\n"
					+"     No. of Seats: 5\n"
					+"     Condition: NEW\n"
					, dealer.displayStatistics());
	}

	
	
	
}
