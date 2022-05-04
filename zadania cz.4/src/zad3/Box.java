package zad3;

import java.util.ArrayList;

public class Box extends List {
	
	ArrayList<Flower> a;
	
	Box(Customer customer){
		super(customer);
		a = new ArrayList<Flower>();
		
	}
	
	public void push(Flower flower) {
		a.add(flower);
	}
	
	public void pop(int i) {
		a.remove(i);
	}
	
	@Override
	public void pop(Flower m) {
		a.remove(a.indexOf(m));
	}
	
	public String toString() {
		String b = "pude³ko w³aœciciel " + this.customer.name + "\n";
		if (a != null) {
			for (int i = 0; i < a.size(); i++) {
				if (i < a.size() -1) {
					b += a.get(i).show() + "\n";
					} else {
						b += a.get(i).show();
					}
			}
		} else {
			b = "pude³ko w³aœciciel " + this.customer.name + " -- pusto";
		}
		
		return b;
	}
	

}
