/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad2;


public class Przedzial {

  private int pocz, koniec;

  public Przedzial(int a, int b)
  {
    this.pocz = Math.min(a, b);
    this.koniec = Math.max(a, b);
    
    
  }
  
  public int poczatek() 
  {
	  int poczatek = this.pocz;
	  return poczatek;
  }
  
  public int koniec() 
  {
	  int koniec = this.koniec;
	  return koniec;
  }
    

  Przedzial przeciecie(Przedzial p)
  {
     if (this.koniec < p.pocz || this.pocz>p.koniec)  {
    	 return null;
     }
     else {
    	 p.pocz = Math.max(this.pocz, p.pocz);
    	 p.koniec = Math.min(this.koniec, p.koniec);
     }
     
     return p;
  }
  public String toString() {
	  String Range="[" + this.pocz + "," + this.koniec + "]";
	  return Range;
  }
  
  
  
}
