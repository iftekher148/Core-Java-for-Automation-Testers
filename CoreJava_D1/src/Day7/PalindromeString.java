package Day7;

import java.util.Scanner;

//we need to determine if it reads the same forwards and backwards. This can be done by comparing characters from the beginning and end 
//of the string, moving toward the center.

//Method 1: Firstly reverse the string & then compare with main string. If match with main string then palindrom

public class PalindromeString {

	public static void main(String[] args) {
		String str1, revString=""; // empty string declare
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter The String:");
		str1=scanner.nextLine();
		
		for(int i=str1.length()-1;i>=0;i--) {
			revString+=str1.charAt(i); //
		}
		if(revString.equals(str1)) {
			System.out.println("The String is Palindrome");
		}
		else {
			System.out.println("Ths String is not Palindrome");
		}

	}

}
