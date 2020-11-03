
public class ClockDisplayTest {
	
	public static void main(String []args) {
		
		ClockDisplay clock= new ClockDisplay();
		for (int i = 0; i < 1000000000; i++) {
			
			clock.timeTick();
			System.out.println(clock.toString());
			}
	
}
}
