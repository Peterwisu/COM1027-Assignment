package lab11_exercise3;
/**
 * Enumerated constant value of ProductType .
 * 
 * @author Wish Suharitdamrong
 *
 */
public enum ProductType {
	  ITALIAN("Italian"), CHINESE("Chinese"), INDIAN("Indian"), TRADITIONAL("Traditional");
	
	//name of a type.
	private String name;
	/**
	 * 
	 * @param name of a type.
	 */
	private ProductType(String name) {
		this.name=name;
		
	}
	/**Getter for name of a type.
	 * 
	 * @return name of a type.
	 */
	public String getName() {
		return name;
	}
	
	}

