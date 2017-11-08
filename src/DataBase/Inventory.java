package DataBase;

import java.util.ArrayList;

import java.util.List;

import DataBase.Food;

public class Inventory{
	
	private static List<Item> items;
	public static String FoodNames[] = {"Espresso","America","Latte","Cappuccino","Mocha","Caramel","WhiteChoc","IceAmericano","BrewedTea","TeaLatte",
			"GreenTeaLatte","IceShakenTea","BreakFastTea","PomegranatePearl","LemonTea","IceGreenTea","IceLatte","IceMoccha","IceCharamel","IceWhiteChock","BrewCoffee","CoffeePress","IceCoffee","Fusion"};
	public static double FoodPrices[] = {80,100,110,110,125,135,135,100,90,125,13090,100,130,115,130,110,125,135,135,100,105,100145};
	public static double FoodStock[] = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	public static int initialSize = 24;
	
	public Inventory(){
		items = new ArrayList<>();
		initailize();
		}
	
	public void initailize(){
		for (int i = 0;i < initialSize ; i++)
		{
			this.addItem(new Food(FoodNames[i],FoodStock[i],FoodPrices[i]));
		}
		
		
	}
	
	public void addItem(Item item){
		items.add(item);
		}
		
	
	public static void ListFood()
	{
		for(int i=0;i<24;i++) {
				System.out.println(FoodNames[i]);
		}
	}


	public List<Item> getItems() {
		return items;
	}

	public static String[] getFoodNames() {
		return FoodNames;
	}

	public static void setFoodNames(String[] foodNames) {
		FoodNames = foodNames;
	}

	public static double[] getFoodStock() {
		return FoodStock;
	}

	public static void setFoodStock(double[] foodStock) {
		FoodStock = foodStock;
	}

	public static double[] getFoodPrices() {
		return FoodPrices;
	}

	public static void setFoodPrices(double[] foodPrices) {
		FoodPrices = foodPrices;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public static void setInitialSize(int initialSize) {
		Inventory.initialSize = initialSize;
	}

	public static int getInitialSize() {
		return initialSize;
	}

	
	// TODO Implement Getter for items
	
	
}