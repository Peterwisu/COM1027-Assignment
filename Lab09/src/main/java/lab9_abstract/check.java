package lab9_abstract;

public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		IItem player1 = new MP3Player(250);
		IItem player2 = new MP3Player(150);
		
		System.out.println("Shop Catalogue");
		
		System.out.println("Item       Price    Sale Price");
		System.out.println(player1.getName()+"    "+player1.getPrice()+"     "+player1.calculateSalePrice());
		System.out.println(player2.getName()+"    "+player2.getPrice()+"     "+player2.calculateSalePrice());
		
		
		System.out.println("Item       Price    Sale Price");
		System.out.println(player1.getName()+"    "+player1.getPrice()+"     "+player1.calculateSalePrice());
		System.out.println(player2.getName()+"    "+player2.getPrice()+"     "+player2.calculateSalePrice());
		
		
	}

}
