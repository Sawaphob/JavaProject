package DataBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.xml.ws.spi.Invoker;

import DataBase.Inventory;
public class Starbuck {
	public static Scanner in;
	public static Scanner num;
	public static int price=0;
	
	public static void main(String[] args) {
		String command;
		in = new Scanner(System.in);
		num = new Scanner(System.in);
		
		while (true) {
			showMenu();
			command = in.nextLine();
			
			switch (command) {
			case "L":
				ListMenu();
				break;
			case "S":
				int i=PickFoodNum();
				SelectFood(i);
				break;
			case "D":
				Discount();
				break;
			case "B":
				BuyFood();
				break;
			case "C":
				Calculate();
				break;
			}
	}
	}
	private static int PickFoodNum() {
		int i = num.nextInt();
		return i;
	}
	private static void Calculate() {
		System.out.println(price);
		
	}
	private static void BuyFood() { 
		//price+=ราคาปัจจุบัน
		
	}
	private static void Discount() {
		// TODO Auto-generated method stub
		
	}
	private static int SelectFood(int i) {
		price+=Inventory.FoodPrices[i];
		System.out.println(Inventory.FoodNames[i]);
		System.out.println(price);
		return i;
		
		
	}
	private static void ListMenu() {
		Inventory.ListFood();
	}
	
	private static void showMenu(){
		System.out.println("########################################");
		System.out.println("StackBuck Store Menu");
		System.out.println("########################################");
		System.out.println("L)\tList of food");
		System.out.println("S)\tSelect food and beverage");
		System.out.println("D)\tDiscount");
		System.out.println("E)\tLog Out");
		System.out.println("B)\tBuy Food and Beverage");
		System.out.println("----------------------------------------");
		System.out.print("กดดิ: ");
	}
}
