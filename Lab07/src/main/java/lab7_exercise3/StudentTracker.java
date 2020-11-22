package lab7_exercise3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentTracker {
	
	private List<Student> studentList;
	private Map<Integer,Student> moduleList;
	
	public StudentTracker() {
		
		studentList = new ArrayList<Student>();
		moduleList = new HashMap<Integer,Student>();
		
	}
	

	public void addStudent(Student student,List<Module> modulelist) {   
		for(int i=0;i<modulelist.size();i++) {
			
			student.addModuleList(modulelist.get(i));
	
		}
		this.studentList.add(student);
	}
	
	private String initiliseMap(int urn) {
		String display="";
		for(int i = 0;i<this.studentList.size();i++) {
		this.moduleList.put(this.studentList.get(i).getUrn(), this.studentList.get(i));
		
		}
		display=this.moduleList.get(urn).printModules();
		
		return display;
	}

	
	public String printStudents() {
		StringBuffer print = new StringBuffer();
		
		for(Student i: studentList) {
			print.append(i.getName()+"("+i.getUrn()+")\n");
		}
		return print.toString() ;
	}
	
	public String printModules(int urn) {
		String display="";
		
		display= "URN "+urn+" is enrolled in:\n"+this.initiliseMap(urn);
		
		return display;
	}
}
