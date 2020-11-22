package lab8_exercise1;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Counting {
	
	StringBuffer end;
	public Counting(){
		super();
		this.end = new StringBuffer();
	}
	public String readTextFile()  {
		int counter=0;
		
		BufferedReader bufferread = null;
		try {
			FileReader input = new FileReader("words.txt");
			
			
			bufferread= new BufferedReader(input);
			
			String display = bufferread.readLine();
			
			while(display != null) {
				counter+=1;
				
				this.displayLine(display, counter);
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
				bufferread.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
				
			}
		}
		return end.toString();
	}
	
	
	private void displayLine(String line ,int counter) {
		
				
		this.end.append(line+" : "+counter+"\n");
			
	}
}

