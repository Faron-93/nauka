package zad2;

class Account { 

	  public double balance=0.0;
	  private static double stopaOprocentowania=0.0;
	 
	  public Account() {
	  }
	  public Account(double x) {
	  	balance=x;
	  }
	 
	  public void deposit(double cash) {
	  	balance+=cash;
	  }
	  public void withdraw(double cash) {
	  	balance-=cash;
	  	if (balance<0) {balance=0;}
	  }
	  public static void setInterestRate(double x) {
	  	stopaOprocentowania=x;
	  }
	  public void transfer(Account p,double cash) {             // metoda dodawania dwóch par   
	    if (cash>balance) { 
	    	cash=balance;
	    }
	    this.withdraw(cash);
	    p.deposit(cash);        
	  }
	  public void addInterest() {
	  	balance=balance*(100+stopaOprocentowania)/100;
	  }
	  
	 
	}
