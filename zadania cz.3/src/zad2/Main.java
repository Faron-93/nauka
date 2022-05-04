/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad2;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class Main {

  public static void main(String[] args) {
    String fname = System.getProperty("user.home") + "/tab.txt";
    File plik = new File(fname);
    
    try (Scanner scan = new Scanner(plik)){
    	ArrayList<Integer> list = new ArrayList<Integer>();
        while (scan.hasNextLine()) {
        	int a = scan.nextInt();
        	list.add(a);
     
        }
        scan.close();
        
        int max = Collections.max(list);
        

        ArrayList<Integer> maxList = new ArrayList<Integer>();
		for (int i = 0; i<list.size(); i++) { 
			if (list.get(i) == max) {
				maxList.add(i);			
			}
		}
				 
        list.forEach(nb -> System.out.print(nb + " "));      
        System.out.println("\n" + max);
        maxList.forEach(nb -> System.out.print(nb + " "));
            	
    }
    catch (NoSuchElementException exc) {
    	System.out.println("***");
    }
	catch (FileNotFoundException exc) {
    	System.out.println("***");
	}
  }
}
