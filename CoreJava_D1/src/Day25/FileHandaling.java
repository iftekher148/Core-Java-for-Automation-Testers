package Day25;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandaling {

	public static void main(String[] args) throws IOException {
		// Create a new file  > text file
		// 'File'-In build class in Java
		//'Test.txt' - the name of the file that i want to create
		/*
		File fileobj = new File("Test.txt"); // create a file object
		fileobj.createNewFile(); // Creating a new file using object
		*/
		
		//Write some information on the file
		
		FileWriter writerobj = new FileWriter("Test.txt"); // 'FileWriter' - java build in class to write on the created file
		writerobj.write("Hello This is file info on the Test.txt file\n My Name is Rock"); //'write' > is a method
		writerobj.close(); 

	}

}
