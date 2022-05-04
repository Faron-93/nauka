/**
 *
 *  @author Faron Daniel PD3748
 *
 */

package zad2;

import java.io.FileNotFoundException;
import java.util.List;

public class Main {

	  public static void main(String[] args) {

	        String fname = System.getProperty("user.home") + "\\test\\daty.txt";

	        FileUtil fileUtil = new FileUtil();
	        DatesValidator validator = new DatesValidator();
	        DatesRegexUtil datesRegexUtil = new DatesRegexUtil();

	        try {
	            String textFromFile = fileUtil.getTextFromFile(fname);
	            List<String> validDates = datesRegexUtil.getValidDatesFromText(textFromFile);

	            for (String date : validDates) {
	                if (validator.isDateValid(date)) {
	                    System.out.print(date + " ");
	                }

	            }
	        } catch (FileNotFoundException e) {
	            System.out.println("***");
	            System.exit(-1);
	        }
	    }

	}