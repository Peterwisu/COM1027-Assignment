package lab8_exercise2;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**To read and obtain value in a file to the program , Then arrange a format of value obtain and display it.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class PersonTracker {
	 
	
	//list of people
	private List<Person> peoplelist;
	
	/**
	 * Default constructor for defining Arraylist
	 */
	public PersonTracker() {
	super();
	//Define arraylist pf people
	this.peoplelist = new ArrayList<Person>();
	}
	
	/**Method to read a String value from a File
	 * 
	 * @param filename (name of a file)
	 */
	public void readTextFile(String filename)  {
		//Create BufferedReader
		BufferedReader buffer = null;
			try {
				
				/**put a input a parameter of a method which is name of a file in to wrapper class of FileReader in BufferedReader.
				 * To allow a BuffereadReader to read a value in a file
				 */
				buffer = new BufferedReader(new FileReader(filename));
				//Read a First line in a file and stored its in a String variable
				String line = buffer.readLine();
				
				//While line is not empty keep on looping
				while(line != null) {
					/**use method breakline to sepereate a line and seperate a String value in a line into
					 * different String value.
					 */
					this.breakline(line);
					//Read next line of a file
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
						//close a BufferedReader
						buffer.close();
					}
				catch(IOException e){
					e.printStackTrace();	
				}
				}	
			}
		
	
		
	}

	/**
	 * 
	 * @param line
	 */
	private void breakline(String line) {
	   /**Create  StringTokenizer object  which its input parameter would be a 
	    *String variable from a from a BufferedReader 
		*which is use to read a text in a file
		*/
		StringTokenizer tokens = new StringTokenizer(line);
		/**
		 * This String would seperate a String value in a line into 3 String values
		 * whihc is Forename ,Surname and Age of a person.
		 */
		
		//use method addPerson to create new person object and add to ArrayList peoplelist.
		this.addPerson(tokens.nextToken(), tokens.nextToken(), Integer.parseInt(tokens.nextToken()));
	
		
		
	}
	
	/**Method to add a person to a people list.
	 * 
	 * @param forename of a person
	 * @param surname of a person
	 * @param age of a person
	 */
	private void addPerson(String forename,String surname,int age) {
		//Create new person object
		Person person = new Person(forename,surname,age);
		//add to Arraylist peoplelist
		this.peoplelist.add(person);
	}
	
	/**Display a detail of all people in a arraylist
	 * 
	 * @return detail of people in a arraylist in specific format.
	 */
	public String displayList() {
		//Create new StringBuffer object.
		StringBuffer display =  new StringBuffer();
		//use foreach loop to get all person in a peoplelist
		for(Person i:this.peoplelist) {
			//get value a forename , surname and age of a person at i and append its to Stringbuffer object in format.
			display.append(i.getForename()+ " "+i.getSurname()+" ("+i.getAge()+")\n");
			
		}
		
		
		return display.toString();
		
	}
}
