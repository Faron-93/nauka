package zad2;

class BankCustomer {
	private String name="";
	private Account konto=new Account();
	public BankCustomer(Person p) {
		name=p.nazwa;
	}
	public Account getAccount() {
  		return konto;
  	}
  	public String toString()  {                 
    return "Klient: "+name+" stan konta "+konto.balance;
 	}
 	public void show() {
		System.out.println(toString());
 	}
} 