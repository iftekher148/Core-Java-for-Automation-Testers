package Day7;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;

public class CountDigit {

	public static void main(String[] args) {
		// Count Digit in a number
		//Input: 123456
		//Output:6
// Step 1: Extract last digit from the Number using %
		//Step 2: Then increase count and remove the last digit using '/' division
		
		int number, reminder,count=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		while(number!=0) {
			reminder = number%10;
			count++;
			number = number/10;
		}
		System.out.println("Total Digit on the Number:"+count);
		
	}

}
