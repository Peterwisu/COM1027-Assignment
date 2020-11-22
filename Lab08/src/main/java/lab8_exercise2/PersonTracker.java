package lab8_exercise2;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class PersonTracker {
	 
	
	
	private List<Person> peoplelist;
		public PersonTracker() {
		super();
		this.peoplelist = new ArrayList<Person>();
		
		
	}
	
	
	public void readTextFile(String filename)  {
		
		BufferedReader buffer = null;
			try {
				
				
				buffer = new BufferedReader(new FileReader(filename));
				String line = buffer.readLine();
				
				
				while(line != null) {
					
					this.breakline(line);
					
				line = buffer.readLine();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			finally {
				if(buffer != null) {
					try {
						buffer.close();
					}
				catch(IOException e){
					e.printStackTrace();	
				}
				}	
			}
		
	
		
	}

	private void breakline(String line) {
		
		String[] informations=line.split("\\s");
		this.addPerson(informations[0], informations[1], Integer.parseInt(informations[2]));
	
		
		
	}
	
	private void addPerson(String forename,String surname,int age) {
		Person person = new Person(forename,surname,age);
		this.peoplelist.add(person);
	}
	
	
	public String displayList() {
		
		StringBuffer display =  new StringBuffer();
		
		for(Person i:this.peoplelist) {
			
			display.append(i.getForename()+ " "+i.getSurname()+" ("+i.getAge()+")\n");
			
		}
		
		
		return display.toString();
		
	}
}
