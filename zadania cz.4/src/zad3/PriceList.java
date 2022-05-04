package zad3;

import java.util.HashMap;

public class PriceList extends HashMap <String, Double> {
	
	private static final long serialVersionUID = 1L;
	public static final PriceList INSTANCE = new PriceList();
	static PriceList a;
	
	private PriceList() {}
	
	public static PriceList getInstance() {
		
		return a = new PriceList();
	}
	

}
