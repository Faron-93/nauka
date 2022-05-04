/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad1;
import java.util.StringTokenizer;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args)  {
		 String fname = System.getProperty("user.home") + "/iter.txt"; 
		 File plik = new File(fname);
		

		try (Scanner scan = new Scanner(plik)) {
		    int start = scan.nextInt();
		    int end = scan.nextInt();
		    int limit = scan.nextInt();
		    int a = 0;
		    
		    for (int i=start; i<=end; i++) {
		    	if (a >= limit) {
		    		break;
		    	}
		    	else {
		    	a = a + i;
		    	}
		    	
		    }
		    System.out.println(a);

		}
		    catch (NoSuchElementException exc) {
		    	System.out.println("***");
		    }
			catch (FileNotFoundException exc) {
		    	System.out.println("***");
			}
  }
}
