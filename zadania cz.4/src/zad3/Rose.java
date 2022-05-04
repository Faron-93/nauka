package zad3;

public class Rose extends Flower {
	
	String nameOfFlower;
	double price;
	String color;
	
	Rose(int quantity){
		super(quantity);
		nameOfFlower = "r�a";
		color = "czerwony";
		if (PriceList.a.containsKey("r�a")){
			price = PriceList.a.get("r�a");
		}else {
			price = 0;
		}
		
			
	}
	
	@Override
	public String show() {
		return this.nameOfFlower + ", kolor: " + this.color + ", ilo�� " + this.quantity
				+ ", cena " + this.getPrice();
		
	}
	
	@Override
	public String getColor() {
		return color;
	}
	
	@Override
	public double getPrice() {
		if (price > 0) {
			return price;
		} else {
			return -1;
		}
	}
	
	@Override
	public int getQuantity() {
		return quantity;
	}
	
	@Override
	public double getCost() {
		return this.price * this.getQuantity();
	}


}
