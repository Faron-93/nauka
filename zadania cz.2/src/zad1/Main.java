/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad1;


public class Main {
  public static void main(String ... args) {    
    Zbiornik z1 = new Zbiornik(200);
    System.out.println(z1);  
    z1.dolej(100);
    System.out.println(z1);
    z1.odlej(50);
    System.out.println(z1);
    Zbiornik z2 = new Zbiornik(1000);
    z2.dolej(500);
    System.out.println(z2);
  }
}
