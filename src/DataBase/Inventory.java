package DataBase;

import java.util.ArrayList;

import java.util.List;

public class Inventory{
	
	private List<Item> items;
	public static String FoodNames[] = {"Espresso","America","Latte","Cappuccino","Mocha","Caramel","WhiteChoc","IceAmericano","BrewedTea","TeaLatte",
			"GreenTeaLatte","IceShakenTea",};
	public static double FoodStock[] = {5.0,4.6,5.0,4.5,4.1,4.3,4.8,4.0,4.0,4.3};
	public static double FoodPrices[] = {40.00,30.00,30.00,50.00,40.00,50.00,50.00,50.00,30.00,30.00};
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
		
	
	public void listFood()
	{
		for(Item e:items) {
			if(e instanceof Food) {
				System.out.println(e);
			}
		}
	}
	
	
	
	
	
	
	
	


	public int getTotalFood(){
		int count=0;
		for(Item e:items) {
			if(e instanceof Food) {
				count++;
			}
	}
		return count;
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