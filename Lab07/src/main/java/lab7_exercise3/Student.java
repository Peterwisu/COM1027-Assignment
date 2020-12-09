package lab7_exercise3;

import java.util.ArrayList;
import java.util.List;
/**
 * 
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Student {
		//name of Student.
		private String name=null;
		//urn of Student.
		private int urn;
		//list of a modules of a student.
		private List<Module> moduleList;
		/**
		 * 
		 * 
		 * @param name of Student.
		 * @param urn of Student.
		 */
		public Student(String name,int urn) {
			//define ArrayList moduleList in a constructor.
			this.moduleList =  new ArrayList<Module>();
			this.name =name;
			this.urn = urn;
		}
		/**
		 * 
		 * @return name of a Student
		 */
		public String getName() {
			return name;
		}
		/**
		 * 
		 * @return Urn of a Student
		 */
		public int getUrn() {
			return urn;
		}
		/**
		 * Add a module to an arraylist of a modulelist 
		 * 
		 * 
		 * @param modules of a Student
		 */
		public void addModuleList(Module module) {
		//if this arraylist doesn't contains a module from a parameter then add module to a list otherwise if already exist  this module will not be add
			if(this.moduleList.contains(module)==false)
			this.moduleList.add(module);
			
		}
		/**
		 * 
		 * Method to print a name of module of a student in speific format module1,module2,module3 as an example. 
		 *  
		 * @return  a list of module name in specific format.
		 */
		public String printModules() {
			
			StringBuffer print = new StringBuffer();
			//use loop get through all value in an arraylist module.
			for(int i=0 ; i<moduleList.size();i++) {
				//if the loop has reach its last index display only a name of a module
				if(i==moduleList.size()-1) {
					print.append(this.moduleList.get(i).getName());
				}else {
				//if the loop has not  reach its last index display a name of a module with " , ".
				print.append(moduleList.get(i).getName()+", ");
				}
			}
			return print.toString();
			}
		
}
		
		
