package DataBase;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.xml.ws.spi.Invoker;


public class Starbuck {
	private static final String Select = null;
	public static Scanner in;
	public static int price=0;
	
	public static void main(String[] args) {
		String command;
		in = new Scanner(System.in);
		
		while (true) {
			showMenu();
			command = in.nextLine();
			
			switch (command) {
			case "L":
				ListMenu();
				break;
			case "S":
				SelectFood();
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
	private static void Calculate() {
		System.out.println(price);
		
	}
	private static void BuyFood() { 
		//price+=ราคาปัจจุบัน
		
	}
	private static void Discount() {
		// TODO Auto-generated method stub
		
	}
	private static void SelectFood() {
		// TODO Auto-generated method stub
		
	}
	private static void ListMenu() {
		// TODO Auto-generated method stub
		
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
