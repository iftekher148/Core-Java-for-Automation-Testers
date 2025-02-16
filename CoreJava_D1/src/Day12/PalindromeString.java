package Day12;

import java.util.Scanner;


/*
 * How to check if a string is a palindrome? 
Reverse the string
Compare the reversed string to the original string
If the reversed string is the same as the original string, then the original string is a palindrome
 * */

public class PalindromeString {

	public static void main(String[] args) {
		 String str1, revString="";  // You initialized revString as " " (a string with a space) instead of an empty string ("").
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Enter Input:");
		 str1 = scanner.nextLine();
		 
		 for(int i=str1.length()-1;i>=0;i--) {
			 revString +=str1.charAt(i);
		 }
		 
		 if(str1.equals(revString)) {
			 System.out.println("The String is Palindrome");
		 }
		 else {
			 System.out.println("The String is not Palindrome");
		 }

	}

}
