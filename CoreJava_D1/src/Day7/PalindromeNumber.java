package Day7;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		int number, revNumber=0, reminder;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number:");
		number = scanner.nextInt();
		
        int originalNumber = number; // Store the original number

		while(number>0) {
			reminder = number%10;
			revNumber = revNumber*10+ reminder;
			number = number/10;
		}
		//// Check if the original number matches the reversed number
		if(originalNumber==revNumber) {
			System.out.println("The Number is Palindrome");
		}
		else {
			System.out.println("Ths Number is not palindrome");
		}


	}

}
