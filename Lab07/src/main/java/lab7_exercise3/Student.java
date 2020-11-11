package lab7_exercise3;

import java.util.ArrayList;
import java.util.List;

public class Student {

		private String name=null;
		private int urn;
		private List<Module> moduleList;
		
		public Student(String name,int urn) {
			
			this.moduleList =  new ArrayList<Module>();
			this.name =name;
			this.urn = urn;
		}

		public String getName() {
			return name;
		}

		public int getUrn() {
			return urn;
		}
		
		public void addModuleList(Module module) {
			if(this.moduleList.contains(module)==false)
			this.moduleList.add(module);
				
		}
		
		
		
		
		
		public String printModules() {
			
			StringBuffer print = new StringBuffer();
			for(int i=0 ; i<moduleList.size();i++) {
				if(i==moduleList.size()-1) {
					print.append(this.moduleList.get(i).getName());
				}else {
				print.append(moduleList.get(i).getName()+", ");
				}
			}
			return print.toString();
			}
		
		
		
		
}
