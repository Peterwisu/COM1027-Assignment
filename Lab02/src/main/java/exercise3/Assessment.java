package exercise3;

public class Assessment {

	private String name;
	private int maximum =100;
	private Double mark ;
	public Assessment(String name,int mark) {
		this.name = name;
		this.mark = (double) mark;
	}
	public Assessment(String name,Double mark) {
		
		this.name = name;
		this.mark = mark;
		}

	public String getName() {
		return name;
	}

	public Double getMark() {
		return mark;
	}

	public int getMaximum() {
		return maximum;
	}

	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
