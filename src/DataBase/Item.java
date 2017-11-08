package DataBase;

public abstract class Item{
	 protected String name;//menu name
	 protected double stock;//beverage and food left
	 protected double price;//beverage and food price
	 public Item(String name, double stock, double price){
		 this.name=name;
		 this.price=price;
		 this.stock=stock;
	 }
	 public String getName() {
		 return name;
	 }
	 public void setName(String name) {
		 this.name=name;
	 }
	public double getStock() {
		return stock;
	}
	public void setStock(double stock) {
		this.stock = stock;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		 return price;
	 }
	 public void set(double price) {
		 this.price=price;
	 }
	 
}