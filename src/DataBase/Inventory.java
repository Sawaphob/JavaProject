package DataBase;

import java.util.ArrayList;

import java.util.List;

public class Inventory{
	/*
	 *  These properties is used as a sample data for generating Game or Movie in the inventory
	 *  When you execute the program or When you use "AG" or "AM" command  
	 */
	private List<Item> items;
	public static String FoodNames[] = {"Hobbit","Star War","Harry Potter","Imitation Game","Social Network","Big Hero 6","Gone Girl","Automata","Iron man","Avengers"};
	public static double FoodRatings[] = {5.0,4.6,5.0,4.5,4.1,4.3,4.8,4.0,4.0,4.3};
	public static double FoodPrices[] = {40.00,30.00,30.00,50.00,40.00,50.00,50.00,50.00,30.00,30.00};
	public static int initialSize = 24;
	
	public Inventory(){
		items = new ArrayList<>();
		initailize();
		}
	
	public void initailize(){
		for (int i = 0;i < initialSize ; i++)
		{
			this.addItem(new Food(FoodNames[i],FoodRatings[i],FoodPrices[i]));
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
	
	
	
	
	
	
	
	


	public int getTotalMovies(){
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

	public static double[] getFoodRatings() {
		return FoodRatings;
	}

	public static void setFoodRatings(double[] foodRatings) {
		FoodRatings = foodRatings;
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