package lab5_exercise3;
import java.util.ArrayList; 
public class Order {

		private ArrayList<Pizza> pizzas ;
		private Customer customer;
		
		
		public Order(Customer customer) {
			this.customer = customer;
			this.pizzas =new ArrayList<Pizza>();
			
			
			
		}
		public void addPizza (Pizza pizza) {
			this.pizzas.add(pizza);
		}
		
		
		
		
		public double calculateTotal() {
			double total=0;
			for(Pizza piz:pizzas) {
				total+=piz.calculateCost();
			}
			
			
			return total;
		}
		
		public String printReceipt() {
			String receipt=null;
			
			receipt="Customer: "+customer.toString()+"\n"+"Number of Pizzas: "+pizzas.size()+"\n"+"Total Cost: "+calculateTotal();
			
			return receipt;			
		}
		
		
}
