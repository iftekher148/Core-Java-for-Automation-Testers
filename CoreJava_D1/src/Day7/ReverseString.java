package Day7;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String str1, revString = "";
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The String:");
		str1=scanner.nextLine();
		
		for(int i=str1.length()-1;i>=0;i--) {
			revString+=str1.charAt(i);
		}
		System.out.println(revString);

	}

}
