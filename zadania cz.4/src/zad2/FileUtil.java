package zad2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileUtil {
	
	public String getTextFromFile(String filePath) throws FileNotFoundException {

        StringBuilder sb = new StringBuilder();
        File source = new File(filePath);
        Scanner scan = new Scanner(source);

        while (scan.hasNextLine()) {
            sb.append(scan.nextLine());
        }

        scan.close();

        return sb.toString();

	}
}