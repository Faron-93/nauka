package zad3;

public class Customer {
	
	String name;
	double money;
	ShoppingCart cart;
	


    Customer(String name, double wallet) {
        this.name = name;
        money = wallet;
        cart = new ShoppingCart(this);
    }
    
    public void get(Flower flower) {
    	cart.push(flower);
    }
    
    public ShoppingCart getShoppingCart() {
    	return cart;
    }
    
    public double getCash() {
    	return money;
    }
    
    public void pay() {
    	cart.check();
    	for (int i = 0; i < cart.e.size(); i++) {
    		double a = 0;
    		if ((cart.e.get(i).getCost() + a) > money) {
    			cart.pop(i);
    		} else {
    			a = cart.e.get(i).getCost();
    			money = money - a;
    		}
    	}
    }
    
    public void pack(Box box) {
    	for (Flower m : cart.e) {
    		box.push(m);
    		cart.e = null;
    	}
    }
	
	

}
