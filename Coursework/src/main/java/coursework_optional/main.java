package coursework_optional;



public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		
		Car car1 = new Car(2345, "Mercedes-Benz A Class", 15000, Condition.NEW, SaleType.FORSALE,5);
		Car car2 = new Car(1234, "Toyota Corolla", 15000, Condition.NEW, SaleType.AUCTION,10);
		
		Advert ad1 = new Advert(car1);
		Advert ad2 = new Advert(car2);
		Buyer user2 = new Buyer("Alice Wonderland", 50);
		Seller seller2 = new Seller("Adam Hills");
		Dealership dealer = new Dealership("optional");
		
	
		dealer.registerCar(ad2, seller2, "Red", CarType.AUTOMATIC, CarBody.MICRO, 4);
		dealer.registerCar(ad1, seller2,"Blue", CarType.MANUAL, CarBody.HATCHBACK, 5);
		dealer.placeOffer(ad2, user2, 15000,7);
		dealer.placeOffer(ad1, user2 , 15000,3);
		
		dealer.endSale(ad2);
		dealer.endSale(ad1);
		
		System.out.print(dealer.displayStatistics());

		


		
	}

}
