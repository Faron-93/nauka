/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad1;


public class Zbiornik { 

	  private double pojemnosc=0;
	  private double stanWody=0;
	  private static int liczba=0;
	  private int number=0;

	  public Zbiornik() {
	  	number=++liczba;
	  }

	  public Zbiornik(double y, double x) {
	    pojemnosc = y;  
	    stanWody = x;
	    number=++liczba;
	  }
	 
	  public Zbiornik(double x) {
	    this(x,0);
	  } 
	  
	  public Zbiornik(Zbiornik p) {
	    pojemnosc=p.pojemnosc;
	    stanWody=p.stanWody;
	    number=++liczba;
	  } 

	  public void dolej(double woda) {
	  	stanWody+=woda;
	  	if (stanWody>pojemnosc) {stanWody=pojemnosc;}
	  	
	  }
	  public void odlej(double woda) {
	  	stanWody-=woda;
	  	if (stanWody<0) {stanWody=0;}
	  }
	                              
	  public String toString()  {                 
	    return "Zbiornik nr "+number+", pojemnosc "+pojemnosc+", stan wody "+stanWody;
	  }
	  public void show() {
			System.out.println(toString());
	  }
	 

	
	
}  
