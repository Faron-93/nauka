package zad3;

public abstract class List {
	
	Customer customer;
	
	List(Customer customer){
		this.customer = customer;
	}
	
	public abstract void push(Flower flower);
	public abstract void pop(int i);
	public abstract void pop(Flower m);
	public abstract String toString();
	

}
