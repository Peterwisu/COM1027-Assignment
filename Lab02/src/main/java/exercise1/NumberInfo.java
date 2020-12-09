package exercise1;
/**
 * A class allow to create a value and limit its maximum value.
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class NumberInfo {
	//limit of a value of minute and hours.
	private int limit=0 ;
	//value of a minute and hours.
	private int value=0;
	
	
	/**
	 * Parameterised Constructor to allow an input parament to indicate a limit of a value.
	 * 
	 * @param limit Maximum limit of hours and minute
	 */
	public NumberInfo(int limit) {
		super();
		this.limit= limit ; 
		
	}
	/**
	 * 
	 * @return value of hours or minute.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * 
	 * 
	 * @param value of hours or minutes.
	 */
	public void setValue(int value) {
		this.value = value; 
	}
	/**
	 * 
	 * method to increase a value of a value.
	 */
	public void increment() {
		//increse value of value by 1
		this.value++;
		//value is equal to remainder of value divided by limit
		this.value = (this.value) % this.limit;
		
	}
}
