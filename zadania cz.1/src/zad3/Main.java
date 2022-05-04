/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad3;


public class Main {
  public static void main(String ... args) {
    int numOfBooks = 33;
    int shelfCap   = 10;
    BooksOnShelves b = new BooksOnShelves(numOfBooks, shelfCap);
    System.out.println("Liczba polek: " + b.getNumOfShelves());
    System.out.println("Liczba ksiazek na ostatniej polce: " + b.getBooksOnLastShelf());
  }
}
