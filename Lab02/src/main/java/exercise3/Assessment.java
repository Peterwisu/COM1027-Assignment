package exercise3;
/**
 * A class provide a Assessment attribute which are name ,maximum marks and marks.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Assessment {

	//name of assessment. 
	private String name=null;
	//maximum marks of assessment.
	private int maximum=100;
	//mark of assessment.
	private Double mark=null;
	/**
	 * Constructor for an assessment for mark which is a number without a decimal place.
	 * 
	 * @param name  name of an assessment.
	 * @param mark	mark of an assessment.
	 */
	public Assessment(String name,int mark) {
		super();
		this.name = name;
		this.mark = (double) mark;
	}
	
	/**
	 * Constructor for an assessment for mark which is a number which have a decimal place.
	 * 
	 * @param name  name of an assessment.
	 * @param mark	mark of an assessment.
	 */
	public Assessment(String name,Double mark) {
		super();
		this.name = name;
		this.mark = mark;
		}

	/**
	 * 
	 * @return name of assessment.
	 */
	public String getName() {
		return name;
	}
	/**
	 * 
	 * @return mark of assessment.
	 */
	public Double getMark() {
		return mark;
	}

	/**
	 * 
	 * @return maximum mark of assessment.
	 */
	public int getMaximum() {
		return maximum;
	}
	/**
	 * 
	 * @param maximum of an assessment.
	 */
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
}
