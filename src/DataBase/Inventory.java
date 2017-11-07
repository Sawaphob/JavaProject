package model;

import java.util.ArrayList;

import java.util.List;

public class Inventory{
	/*
	 *  These properties is used as a sample data for generating Game or Movie in the inventory
	 *  When you execute the program or When you use "AG" or "AM" command  
	 */
	private List<Item> items;
	public static String movieNames[] = {"Hobbit","Star War","Harry Potter","Imitation Game","Social Network","Big Hero 6","Gone Girl","Automata","Iron man","Avengers"};
	public static double movieRatings[] = {5.0,4.6,5.0,4.5,4.1,4.3,4.8,4.0,4.0,4.3};
	public static double moviePrices[] = {40.00,30.00,30.00,50.00,40.00,50.00,50.00,50.00,30.00,30.00};
	public static String gameNames[] = {"Dragon Quest","The Sim","Final Fantasy","Super Mario","Donkey Kong","Sonic","Megaman","Kirby","Monopoly","Mario Kart"};
	public static double gameRatings[] = {4.5,4.2,4.5,4.7,4.5,4.2,4.3,4.0,4.0,4.0};
	public static double gamePrices[] = {30.00,30.00,30.00,10.00,10.00,10.00,20.00,10.00,20.00,20.00};
	public static int initialSize = 3;
	
	public Inventory(){
		items = new ArrayList<>();
		initailize();
		}
		// TODO Fill Code
	
	public void initailize(){
		for (int i = 0;i < initialSize ; i++)
		{
			this.addItem(new Movie(movieNames[i],movieRatings[i],moviePrices[i]));
		}
		
		for (int i = 0;i < initialSize; i++)
		{
			this.addItem(new Game(gameNames[i],gameRatings[i],gamePrices[i]));
		}
		this.sortItems();
	}
	
	public void addItem(Item item){
		items.add(item);
		}
		
		//TODO Fill Code
	
	public void listGames()
	{
		for(Item e:items) {
			if(e instanceof Game) {
				System.out.println(e);
			}
		}//TODO Fill Code
	}
	
	public void listMovies(){
		for(Item e:items) {
			if(e instanceof Movie) {
				System.out.println(e);
			}
		}
		//TODO Fill Code
	}
	
	public void sortItems(){
		items.sort(null);
	}
	int index = 0;
	public int searchForRentableGame(String gameName){
		for(Item e:items) {
			if(e.getName().compareTo(gameName)==0) {
				if(((Game) e).isRented()==false) {
					index=items.indexOf(e);
					break;
				}
				
				}
			else {
				index = -1;
			}
		}
		return index;
		// TODO Fill Code
	}
	
	public int searchForRentableMovie(String movieName){
		for(Item e:items) {
			if(e.name.compareTo(movieName)==0) {
				if(e.isInStock()==true) {
					index=items.indexOf(e);
					break;
				}
				}
			else {
				index = -1;
			}
		}
		return index;

		// TODO Fill Code
	}
	
	public int searchForBuyableGame(String gameName){
		for(Item e:items) {
			if(e.name.compareTo(gameName)==0) {
				if(((Game) e).isBuyable()==true) {
					index=items.indexOf(e);
					break;
				}
				}
			else {
				index = -1;
			}
		}
		return index;

		// TODO Fill Code
	}
	
	public int getTotalGames(){
		int count=0;
		for(Item e:items) {
			if(e instanceof Game) {
				count++;
			}
	}
		return count;
	}
	
	public int getTotalMovies(){
		int count=0;
		for(Item e:items) {
			if(e instanceof Movie) {
				count++;
			}
	}
		return count;
	}

	public List<Item> getItems() {
		return items;
	}

	public static String[] getMovieNames() {
		return movieNames;
	}

	public static double[] getMovieRatings() {
		return movieRatings;
	}

	public static double[] getMoviePrices() {
		return moviePrices;
	}

	public static String[] getGameNames() {
		return gameNames;
	}

	public static double[] getGameRatings() {
		return gameRatings;
	}

	public static double[] getGamePrices() {
		return gamePrices;
	}

	public static int getInitialSize() {
		return initialSize;
	}

	
	// TODO Implement Getter for items
	
	
}