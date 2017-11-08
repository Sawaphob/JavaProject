package DataBase;

import DataBase.Item;


public class Food extends Item {

	public static int idCount = 1;
	
	public static final double[] RENTAL_RATES = {0.10,0.18,0.25,0.30};  
	
	private boolean isRented;
	private String buyerName;
	private boolean isBuyable;

	public Food(String name, double rating, double price) {
		super(name, rating, price);
		
		id = idCount;
		idCount++;
		
	}
	
	public double buy(String buyerName) {
		this.buyerName=buyerName;
		isInStock = false;
		isBuyable = false;
		// TODO Auto-generated method stub
		return this.price;
	}
	
	
}