package lab7_exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * 
 * @author Wish Suharitdamrong
 *
 */
public class StudentTracker {
	//List of a student
	private List<Student> studentList;
	//Hashmao of a  Urn of a student and student
	private Map<Integer,Student> moduleList;
	
	/**
	 * initialize a value of ArrayList and HashMap in a constructor. 
	 * 
	 */
	public StudentTracker() {
		
		studentList = new ArrayList<Student>();
		moduleList = new HashMap<Integer,Student>();
		
	}
	
	/**
	 * Method to add a list of module to a student object and then add a student to a studentlist.
	 * 
	 * @param student
	 * @param modulelist
	 */
	public void addStudent(Student student,List<Module> modulelist) { 
		//use a loop to get all value in array modulelist and then use addModuleList method from Student Class to add module to student.
		for(int i=0;i<modulelist.size();i++) {
			//add module at index I to a student.
			student.addModuleList(modulelist.get(i));
	
		}
		//add
		this.studentList.add(student);
	}
	/**
	 * 
	 * @param urn
	 * @return
	 */
	private String initiliseMap(int urn) {
		String display="";
		for(int i = 0;i<this.studentList.size();i++) {
		this.moduleList.put(this.studentList.get(i).getUrn(), this.studentList.get(i));
		
		}
		display=this.moduleList.get(urn).printModules();
		
		return display;
	}

	/**
	 * 
	 * @return
	 */
	public String printStudents() {
		StringBuffer print = new StringBuffer();
		
		for(Student i: studentList) {
			print.append(i.getName()+"("+i.getUrn()+")\n");
		}
		return print.toString() ;
	}
	/**
	 * 
	 * @param urn
	 * @return
	 */
	public String printModules(int urn) {
		String display="";
		
		display= "URN "+urn+" is enrolled in:\n"+this.initiliseMap(urn);
		
		return display;
	}
}
