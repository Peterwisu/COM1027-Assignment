package lab7_exercise3;

public class Module {

	private String name;
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
