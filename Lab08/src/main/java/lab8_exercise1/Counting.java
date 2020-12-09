package lab8_exercise1;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**A class to read a text file and arrange a line in format.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class Counting {
	//StringBuffer object to contains String value
	private StringBuffer end=null;
	/**
	 * 
	 */
	public Counting(){
		super();
		this.end = new StringBuffer();
	}
	/**Method to read a file and obtain a String value from it.
	 * 
	 * @return String value obtain from a text file
	 */
	public String readTextFile()  {
		//counter of a line
		int counter=0;
		//create BufferedReader object
		BufferedReader bufferread = null;
		try {
			//Create FileReader object name input to read file name "words.txt".
			FileReader input = new FileReader("words.txt");
			
			//initialize a FileReader object to BufferedReader object as a wrapper class.
			bufferread= new BufferedReader(input);
			//read a first line of a value in a file a assign it as String in display.
			String display = bufferread.readLine();
			//While display is not empty keep looping
			while(display != null) {
				//counter of a line increase by 1
				counter+=1;
				//use displayLine method to obtain a display value and counter of a line
				this.displayLine(display, counter);
				//read next line of a file.
				display= bufferread.readLine();
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
			if(bufferread != null) {
			try {
				//Close BufferReader
				bufferread.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
				
			}
		}
		return end.toString();
	}
	
	/**Method to obtain a String value from a file and add it to into a StringBuffer object
	 * 
	 * @param line of  a String value that obtain
	 * @param counter of a loop to identify a line
	 */
	private void displayLine(String line ,int counter) {
		
		//add an input value to a StringBuffer.
		this.end.append(line+" : "+counter+"\n");
			
	}
}

