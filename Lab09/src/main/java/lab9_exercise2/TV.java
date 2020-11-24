package lab9_exercise2;

public class TV extends AbstractItem {

	
	
	private int size;
	private static final double SALE_PERCENTAGE = 0.80;
	
	public TV(double price,int size) {
		super(price);
		this.size = size;
		
	}

	@Override
	public double calculateSalePrice() {
		
		return this.getPrice()*this.SALE_PERCENTAGE;
	}

	
	public int getSize() {
		return size;
	}

	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "TV ("+this.size+"\")";
	}

}
