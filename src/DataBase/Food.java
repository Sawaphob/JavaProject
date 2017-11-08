package DataBase;

import DataBase.Item;


public class Food extends Item {


		public static int idCount = 1;
		
		private String renterName;
		private boolean isRented;
		private int rentDate;

		public Food(String name, double rating, double price) {
			super(name, rating, price);
			
		}
		
	}
	

