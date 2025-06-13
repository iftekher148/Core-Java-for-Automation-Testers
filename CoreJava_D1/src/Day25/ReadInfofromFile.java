package Day25;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadInfofromFile {

	public static void main(String[] args) throws FileNotFoundException {
		// read information from the file
		File fileOb = new File("Test.txt");
		Scanner sc = new Scanner(fileOb);
		while(sc.hasNextLine()) { // true hole lopp execute hobe
			String line = sc.nextLine();
			System.out.println(line);
		}
		

	}

}
