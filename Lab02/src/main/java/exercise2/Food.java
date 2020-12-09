package exercise2;
/**
 * 
 * A class  provide a  name of a food and amount of sugar in food to be set
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Food {
	//Name of a food.
	private String name=null;
	//Amount of sugar
	private double AmountofSugar=0;
	
	/**
	 * 
	 * @param name name of a food
	 * @param Amountofsugar  amount of a sugar in food
	 */
	public Food(String name,double Amountofsugar) {
		super()	;
		this.name = name;
		this.AmountofSugar = Amountofsugar ;
		}
		
	
	/**
	 * 
	 * @return name of a food
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * 
	 * @return amount of sugar in a food
	 */
	public double getAmountofSugar() {
		return AmountofSugar;
	}

	
	
	
}
