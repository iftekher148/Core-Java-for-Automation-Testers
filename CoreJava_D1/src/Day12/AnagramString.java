package Day12;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {

	public static void main(String[] args) {
		 String str1, str2;
		 
		
		 Scanner sc= new Scanner(System.in);
		 System.out.println("Enter String1:");
		 str1=sc.nextLine();
		 
		 System.out.println("Enter String2: ");
		 str2=sc.nextLine();
		 
		 str1=str1.toLowerCase();
		 str2=str2.toLowerCase();
		 
		 if(str1.length()==str2.length()) { // Only check is the both string length is equal
			 // Convert string to character array
			 char chArray1[] = str1.toCharArray();
			 char chArray2[] = str2.toCharArray();
			 
			// Sort the character array
			 Arrays.sort(chArray1);
			 Arrays.sort(chArray2);
			 
			 if(Arrays.equals(chArray1, chArray2)) {
				 System.out.println("String is Anagram");
			 }
			 else {
				 System.out.println("String is not Anagram");
			 }
			 
		 }
		 

	}

}
