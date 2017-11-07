package model;

public abstract class Item implements Comparable<Item>{
	 protected int id;//beverage and food id
	 protected String name;//menu name
	 protected boolean isInStock;//food left
	 protected double price;//beverage and food price
	 public Item(String name, double rating, double price){
		 this.name=name;
		 this.price=price;
		 isInStock=true;
	 }
	 public int getId() {
		 return id;
	 }
	 public void setId(int id) {
		 this.id=id;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	 public boolean isInStock() {
		 return isInStock;
	 }
	 public void setInStock(boolean isInStock) {
		 this.isInStock=isInStock;
	 }
	 public double getPrice() {
		 return price;
	 }
	 public void set(double price) {
		 this.price=price;
	 }
	 
}