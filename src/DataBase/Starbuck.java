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
	public static int i;
	
	public static void main(String[] args) {
		String command;
		in = new Scanner(System.in);
		num = new Scanner(System.in);
		
		while (true) {
			showMenu();
			command = in.nextLine();
			
			switch (command) {
			case "L":
				//บอกรายชื่อทั้งหมดของน้ำ+อาหาร เเต่ไม่ได้เอาออกไปใช้
				ListMenu();
				break;
				
			case "SB":
				/*
				 * รหัสสินค้าาำหรับปุ่มกด น้ำ=0-23 อาหาร=0-สุดท้าย(ยังไม่ได้ทำ)
				 * ระบบยังทำได้เเค่เลือกน้ำ เเละ รวมราคา ยังไม่สามารถตั้งค่า cup size
				 */
				i=PickNum();
				SelectBeverage(i);
				break;
				
			case "SF":
				i=PickNum();
				SelectFood(i);
				break;
				
			case "D":
				//ยังไม่ทำรอปุ่มที่สร้าง เเละแผน discount promotion ว่ามีอะไรบ้าง
				Discount();
				break;
				
			case "C":
				//ส่งค่าราคาให้พอกด next เพื่อไปหน้าถัดไป
				Calculate();// print price(ไม่ต้องใช้) & return price
				break;//เสร็จ
			
			case "AS":
				//น่าจาเสร็จ เดี๋ยวทำตัว check stockให้ตัวที่หมดกดไม่ได้ พอstock=0จะทำให้ไม่ได้ทันที ไรงี้
				AddStock();
				break;
			}
	}
	}
	
	private static void AddStock() {
		//ปุ่มเพิ่ม stock
		System.out.println("select stock : 0=Beverage 1=Food");
		int i = num.nextInt();
		if(i==0) {
			System.out.println("Pick Beverage Code:[0-23]");
			int numb= PickNum();
			System.out.println("Pick stock amount");
			int amount = PickNum();
			Inventory.BeverageStock[numb]=amount;
		}else if(i==1) {
			System.out.println("Pick Food Code[0-21]");
			int numb= PickNum();
			System.out.println("Pick stock amount");
			int amount = PickNum();
			Inventory.FoodStock[numb]=amount;
		}
		
		
		// TODO Auto-generated method stub
		
	}

	private static int PickNum() {
		//ใส่เลขเเล้วคืนเลขเดิม ใช้กับปุ่ม...มั้ง
		int i = num.nextInt();
		return i;
	}
	private static int Calculate() {
		System.out.println(price);
		return price;
		
	}
	
	private static void Discount() {
		// TODO Auto-generated method stub
		
	}
	
	private static int SelectBeverage(int i) {
		price+=Inventory.BeveragePrices[i];
		Inventory.BeverageStock[i]-=1;
		System.out.println(Inventory.BeverageNames[i]);
		System.out.println(price);//ดึงค่านี้มาคิดราคารวม
		return i;
	}
	
	private static int SelectFood(int i) {
		price+=Inventory.FoodPrices[i];
		Inventory.BeverageStock[i]-=1;
		System.out.println(Inventory.FoodNames[i]);
		System.out.println(price);//ดึงค่านี้มาคิดราคารวม
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
		System.out.println("SB)\tSelect beverage");
		System.out.println("SF)\tSelect food");
		System.out.println("D)\tDiscount");
		System.out.println("E)\tLog Out");
		System.out.println("----------------------------------------");
		System.out.print("กดดิ: ");
	}
}
