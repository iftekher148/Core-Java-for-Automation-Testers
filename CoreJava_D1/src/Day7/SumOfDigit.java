package Day7;

import java.util.Scanner;

public class SumOfDigit {
	// Sum of digit on a Number
	//Input: 12345
	//Output:15
	// Step 1: Extract last digit from the Number using %
	//Step 2: Then add the reminder with sum  and remove the last digit using '/' division

	public static void main(String[] args) {
		int number, reminder,sum=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		while(number!=0) {
			reminder = number%10;
			sum += reminder;
			number = number/10;
		}
		System.out.println("The Sum of the digit on a Number:"+sum);

	}

}
