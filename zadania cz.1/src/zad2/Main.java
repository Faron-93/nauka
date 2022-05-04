/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad2;


public class Main {
  public static void main(String[] args) {
    int a1 = 4; 
    int b1 = 2;
    int a2 = 3;
    int b2 = 5;

    Przedzial p1 = new Przedzial(a1,b1), p2 = new Przedzial(a2,b2);

    System.out.println("Przedział " + p1 + " ma " + "początek " + p1.poczatek() + " i koniec " + p1.koniec());

    System.out.println("Przecięcie " + p1 + " i " + p2 + " = " + 
                      (p1.przeciecie(p2)!=null?p1.przeciecie(p2):"pusty przedział"));  
  }
}
