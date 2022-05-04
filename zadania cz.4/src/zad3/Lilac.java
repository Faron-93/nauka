package zad3;

public class Lilac extends Flower {
	
	String nameOfFlower;
	double price;
	String color;
	
	Lilac(int quantity){
		super(quantity);
		nameOfFlower = "bez";
		color = "bia³y";
		if (PriceList.a.containsKey("bez")) {
			price = PriceList.a.get("bez");
		}else {
			price = 0;
		}
		
			
	}
	
	@Override
	public String show() {
		return this.nameOfFlower + ", kolor: " + this.color + ", iloœæ " + this.quantity
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

