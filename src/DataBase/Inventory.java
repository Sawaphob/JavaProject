package DataBase;

import java.util.ArrayList;

import java.util.List;

import DataBase.Beverage;

public class Inventory{
	
	private static List<Item> items;
	public static String BeverageNames[] = {"Espresso","Caffe Americano","Caffe Latte","Cappuccino","Caffe Mocha","Caramel Macchiato","White Chocolate Mocha",
			"Ice Caffe Americano","Full-Leaf Brewed Tea","Full-Leaf Tea Latte","Green Tea Latte","Iced Shaken Tea","Iced English Break Fast Tea Latte",
			"Iced Shaken Hibicus Tea with Pomegranate Pearls","Ice Shaken Lemon Tea","Iced Green Tea Latte","Ice Caffe Latte","Ice Caffe Moccha",
			"Ice Caramel Macchiato","Iced White Chocolate Mocha","Brewed Coffee","Coffee Press","Iced Coffee","Matcha & Espresso Fusion"};
	public static double BeveragePrices[] = {80,100,110,110,125,135,135,100,90,125,130,90,100,130,115,130,110,125,135,135,100,105,100,145};
	public static double BeverageStock[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	public static String FoodNames[] = {"Classic Tuna","Croque Monsiuer","Crispy Bacon Egg & Gouda Croissant Bun","Duo Delight","Egg Salad",
			"Permesan Bagel Ball Stuff with Herbs Cream Chees","Marshmallow Cookie","Soft Chocolate Chip Cookies","Chocolate Scone","Skinny Banana Muffin",
			"Skinny Blueberry Muffin","Banana ChocChip Muffin","Chicken & Mushroom Pie","Jumbo Sausage Bite","Mushroom Bruschetta","Tomato Bruschetta",
			"Croque Monsieur","Crispy Bacon,Egg & Gouda Croissant Bun","Espresso Chocchip Brownie","Starbucks Signature Chocolate Cake","Coconut Cake",
			"Banoffee Pie"};
	public static double FoodPrices[] = {85,100,135,70,95,45,65,65,65,65,65,65,75,75,65,65,100,135,85,125,125,125};
	public static double FoodStock[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	
	public Inventory(){
		items = new ArrayList<>();
		initailize();
		}
	
	public void initailize(){
		for (int i = 0;i < 24 ; i++)
		{
			this.addItem(new Beverage(BeverageNames[i],BeverageStock[i],BeveragePrices[i]));
		}
		for (int i = 0;i < 22 ; i++)
		{
			this.addItem(new Food(FoodNames[i],FoodStock[i],FoodPrices[i]));
		}
		
		
	}
	
	public void addItem(Item item){
		items.add(item);
		}
		
	public static void ListStock()
	{
		for(int i=0;i<24;i++) {
				System.out.println(BeverageStock[i]);
		}
		for(int i=0;i<22;i++) {
			System.out.println(FoodStock[i]);
	}
	}
	
	public static void ListFood()
	{
		for(int i=0;i<24;i++) {
				System.out.println(BeverageNames[i]);
		}
		for(int i=0;i<22;i++) {
			System.out.println(FoodNames[i]);
	}
	}


	public List<Item> getItems() {
		return items;
	}

	public static String[] getFoodNames() {
		return BeverageNames;
	}

	public static void setFoodNames(String[] foodNames) {
		BeverageNames = foodNames;
	}

	public static double[] getFoodStock() {
		return BeverageStock;
	}

	public static void setFoodStock(double[] foodStock) {
		BeverageStock = foodStock;
	}

	public static double[] getFoodPrices() {
		return BeveragePrices;
	}

	public static void setFoodPrices(double[] foodPrices) {
		BeveragePrices = foodPrices;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static String[] getBeverageNames() {
		return BeverageNames;
	}

	public static void setBeverageNames(String[] beverageNames) {
		BeverageNames = beverageNames;
	}

	public static double[] getBeveragePrices() {
		return BeveragePrices;
	}

	public static void setBeveragePrices(double[] beveragePrices) {
		BeveragePrices = beveragePrices;
	}

	public static double[] getBeverageStock() {
		return BeverageStock;
	}

	public static void setBeverageStock(double[] beverageStock) {
		BeverageStock = beverageStock;
	}


	
	// TODO Implement Getter for items
	
	
}