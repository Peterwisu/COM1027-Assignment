package lab6_exercise2;



public class Check {


	
	
	
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  

			/*Player player1 = new Player("Rhys Priestland", RugbyPosition.FLYHALF); 
			Player player2 = new Player("Mike Phillips", RugbyPosition.SCRUMHALF); 
			Halfbacks halfbacks = new Halfbacks();
			halfbacks.assignHalfback(player1);
			halfbacks.assignHalfback(player2); System.out.println(halfbacks.displayElements());
			
			System.out.println(halfbacks.getPlayerBad(1));  */
		
		
		/*Player player1 = new Player("Rhys Priestland", RugbyPosition.FLYHALF);
		Player player2 = new Player("Jacob Umaga", RugbyPosition.FLYHALF);
		Player player3 = new Player("Willi Heinz", RugbyPosition.SCRUMHALF);
		Halfbacks halfbacks = new Halfbacks();
		halfbacks.assignHalfback(player1);
		halfbacks.assignHalfback(player2);
		halfbacks.assignHalfback(player3);*/
		
		//System.out.print(halfbacks.displayElements());
		
		Halfbacks halfbacks = new Halfbacks();
		Player player1 = new Player("Jacob Umaga", RugbyPosition.FLYHALF);
		halfbacks.assignHalfback(player1);
		
		System.out.println("0 - \n" + "1 - Jacob Umaga FLYHALF\n");
		System.out.println(halfbacks.displayElements());

		
			
			

}
}