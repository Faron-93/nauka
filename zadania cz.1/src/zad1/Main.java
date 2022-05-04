/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad1;


public class Main {
  public static void main(String[] args) {

    int a =  6,            // liczby biorace udzial w sumowaniu 
        b =  9,            // i mnozeniu oznaczam przez: a, b, c  
        c = 18;
    int d = a+b+c;
    int e = a*b*c;
    float f = a/2f + b/2f + c/2f;
    float g = a/3f + b/3f + c/3f;
    
    
    System.out.println(a  + "+" + b + "+" + c + "=" + d);
    System.out.println(a  + "*" + b + "*" + c + "=" + e);
    System.out.println(a  + "/2+" + b + "/2+" + c + "/2=" + f);
    System.out.println(a  + "/3+" + b + "/3+" + c + "/3=" + g);
 }
}
