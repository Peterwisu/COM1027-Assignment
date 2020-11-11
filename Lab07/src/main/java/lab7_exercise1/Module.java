package lab7_exercise1;

public class Module {

	private String name=null;
	String reg ="COM[0-9]{4}";
	public Module(String name) {
		super();
		if(name.matches(reg)) {
		this.name = name;
		}
		else {
			this.name = "Error";
		}
	}

	public String getName() {
		return name;
	}
	
	
}
