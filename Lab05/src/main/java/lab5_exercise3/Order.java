package lab5_exercise3;
import java.util.ArrayList; 
/**
 * 
 *This Class show a number and price of pizza ordered from a customer
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Order {
		//A piiza in  an order.
		private ArrayList<Pizza> pizzas ;
		//Cuntomer who order a pizza.
		private Customer customer=null;
		
		/**
		 * 
		 * @param customer of a pizza order.
		 */
		public Order(Customer customer) {
			super();
			this.customer = customer;
			this.pizzas =new ArrayList<Pizza>();	
		}
		/**
		 * Methid to add a pizza to a ArrayList.
		 * 
		 * @param pizza adding in an order.
		 */
		public void addPizza (Pizza pizza) {
			this.pizzas.add(pizza);
		}
		
		
		
		/**
		 * Method to return and calculate a total price to pay.
		 * 
		 * @return a calculated total amount of pizza to be paid.
		 */
		public double calculateTotal() {
			double total=0;
			//use foreach loop to get each value in an ArrayList.
			for(Pizza i:pizzas) {
				//use calculateCost() from pizza class to get a cost of pizza at index i.
				total+=i.calculateCost();
			}
			
			
			return total;
		}
		/**
		 * Method to return a receipt of a pizza order.
		 * 
		 * @return a string value contains name of customer and pizza order in format.
		 */
		public String printReceipt() {
			String receipt=null;
			
			receipt="Customer: "+customer.toString()+"\n"+"Number of Pizzas: "+pizzas.size()+"\n"+"Total Cost: "+calculateTotal();
			
			return receipt;			
		}
		
		
}
