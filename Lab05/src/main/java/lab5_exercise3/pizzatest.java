package lab5_exercise3;



public class pizzatest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pizza pizza = new Pizza();
		String[] toppings = new String[] {"cheese", "pepperoni", "tomato"};
		pizza.addToppings(toppings);
		
		double cost = 0 ;
		
		
		switch(toppings.length) {
		
		case 1: cost=5.99;
				break;
		case 2: cost=6.99;
				break;
		case 3: cost=7.99;
				break;
		case 4: cost=8.99;
				break;
		case 5: cost=9.99;
				break;
		case 6: cost=10.99;
				break;
		case 7: cost=11.99;
				break;
		case 8: cost=12.99;
				break;
		case 9: cost=13.99;
				break;
		case 10: cost=14.99;
				break;
		default: 
				break;
		
		}
	
	System.out.print(cost);
		
	}

}
