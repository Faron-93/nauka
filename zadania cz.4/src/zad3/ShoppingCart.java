package zad3;

import java.util.ArrayList;

public class ShoppingCart extends List {
	
	ArrayList<Flower> e;
	
	ShoppingCart(Customer customer){
		super(customer);
		e = new ArrayList<Flower>();
	}
	
	public void push(Flower flower) {
		e.add(flower);
	}
	
	public void pop(int i) {
		e.remove(i);
	}
	
	public void pop(Flower flower) {
		e.remove(e.indexOf(flower));
	}
	
	public String toString() {
		String a = "Wózek w³aœciciel " + this.customer.name + "\n";
		if (e != null) {
			for (int i = 0; i < e.size(); i++) {
				if (i < e.size() - 1 ) {
					a += e.get(i).show() + "\n";
				} else {
					a += e.get(i).show();
				}
			}
		}else {
			a = "Wózek w³aœciciel " + this.customer.name + " -- pusto";
		}
		return a;
	}
	
	public void check() {
		for(int i = 0; i < e.size(); i++) {
			if ((e.get(i).getPrice() == -1) || (e.get(i).getPrice()<0))
				this.pop(i);
		}
	}

}
