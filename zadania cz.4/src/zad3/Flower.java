package zad3;

public abstract class Flower {
	
int quantity;
	
	Flower(int quantity){
		this.quantity = quantity;
		
	}
	
	
	public abstract String show();
	public abstract String getColor();
	public abstract double getPrice();
	public abstract int getQuantity();
	public abstract double getCost();
	
	

}
