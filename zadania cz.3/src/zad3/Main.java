/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    String fname = System.getProperty("user.home") + "/pakiety.txt";            
    File plik = new File(fname);
	

	try (Scanner scan = new Scanner(plik)) {
		int i = scan.nextInt();
	    int space = scan.nextInt()*1000000;
	    int sum = 0;
	    int n = 0;
	    int sumP=0;
	    ArrayList<Integer> list = new ArrayList<Integer>();
	    ArrayList<Integer> numList = new ArrayList<Integer>();

	    if (i<0 || space <0 ) {
	    	System.out.println("***");
	    }
	    else if (i>space) {
	    	System.out.println("***");
	    }

	    else {
	    	while (sum < space) {
	    		
		    	n++;
		    	
		    	if(n>1 && n < 6){
		    		i = 2*i;
		    	}
		    	else if (n >= 6) {	 
		    		i = 3*i; 		
		    	}
		    	
		    	sumP = sum;	    	
		    	sum = sum+i;
		    			    	
		    	if (sum<space) {
		    		list.add(i);
			    	numList.add(n);

		    	}

	    	}
	    	
	    	System.out.println(numList.size());
	    	for (int a = 0; a < list.size(); a++) {

	    		System.out.println((numList.get(a)) + " " + (list.get(a)));
	    		
	    	}

			System.out.println(sumP);

	    }
	}

	catch (NoSuchElementException exc) {
    	System.out.println("***");
    }
	catch (FileNotFoundException exc) {
    	System.out.println("***");
	}

  }
}
