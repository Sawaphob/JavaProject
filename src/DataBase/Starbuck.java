package mainData;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import javax.xml.ws.spi.Invoker;


public class Starbuck {
	public static Scanner in;
	public static int price=0;
	
	public static void main(String[] args) {
		String command;
		in = new Scanner(System.in);
		
		while (true) {
			showMenu();
			command = in.nextLine();
			
			switch (command) {
				case "E":
				System.out.println("Finish work to day great job.");
				System.exit(0);
				break;
			}
	}
	}
	private static void showMenu(){
		System.out.println("########################################");
		System.out.println("StackBuck Store Menu");
		System.out.println("########################################");
		System.out.println("B)\tBuy food and beverage");
		System.out.println("D)\tDiscount");
		System.out.println("E)\tLog Out");
		System.out.println("----------------------------------------");
		System.out.print("กดดิ: ");
	}
}
