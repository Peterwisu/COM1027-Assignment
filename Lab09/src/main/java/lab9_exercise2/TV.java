package lab9_exercise2;
/**
 * 
 * This class calulate a price and show a TV details.
 * 
 * @author Wish Suharitdamrong
 *
 */
public class TV extends AbstractItem {

	
	//size of TV
	private int size;
	//constant sale percent of a TV
	private static final double SALE_PERCENTAGE = 0.80;
	/**
	 * 
	 * @param price of tv
	 * @param size of tv
	 */
	public TV(double price,int size) {
		super(price);
		this.size = size;
		
	}
	/**Calculate price of TV after sales.
	 * 
	 *  @return size price of TV after sale.
	 */
	@Override
	public double calculateSalePrice() {
		
		return this.getPrice()*this.SALE_PERCENTAGE;
	}

	/**
	 * 
	 * @return size of TV
	 */
	public int getSize() {
		return size;
	}

	
	/**Return a detail of a TV in specific format.
	 * 
	 * @return name of tv
	 */
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "TV ("+this.size+"\")";
	}

}
