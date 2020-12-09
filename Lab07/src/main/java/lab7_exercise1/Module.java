package lab7_exercise1;
/**
 * 
 * This Class check a format of an input module's name whether its format is valid or not
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Module {
	//Name of a module
	private String name=null;
	//creater a regular expression to check a format of a module name
	String reg ="COM[0-9]{4}";
	
   /**
	* 
	* @param name of a module
	*/
	public Module(String name) {
		super();
		
		//If format of module name match a reg(regular expression) initialize a value to name.
		if(name.matches(reg)) {
		this.name = name;
		}
		else {
			//If input parameters doesn't match initialize "Error" string value to name.
			this.name = "Error";
		}
	}

	/**
	 * 
	 * @return name of a module
	 */
	public String getName() {
		return name;
	}
	
	
}
