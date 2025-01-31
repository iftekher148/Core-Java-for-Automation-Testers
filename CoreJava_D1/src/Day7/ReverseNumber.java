package Day7;

import java.util.Scanner;

//Reverse Number:
//-----------------
//num = 1234
//reversedNumber = 0

//Step 1: Extract the Last Digit
//The modulus operator (%) gives the remainder when num is divided by 10. For any number, this operation returns the last digit.
//	Calculation: 1234 % 10 = 4

//Step 2: Build the Reversed Number
//Code: reversedNumber = reversedNumber * 10 + lastDigit
//Explanation: The current value of reversedNumber is 0. We multiply reversedNumber by 10 to shift its digits left by one place (although it is currently 0, so this shift doesn't affect the result).
//Then, we add lastDigit (4) to reversedNumber.
//Calculation: 0 * 10 + 4 = 4


//Step 3: Remove the Last Digit from num
//Code: num = num / 10
//Explanation: Dividing num by 10 removes the last digit. In integer division (no remainder), this effectively shifts all digits to the right.
//Calculation: 1234 / 10 = 123
//Result: num = 123


public class ReverseNumber {

	public static void main(String[] args) {
		int number, revNumber=0, reminder;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number:");
		number = scanner.nextInt();
		
		while(number>0) {
			reminder = number%10;
			revNumber = revNumber*10+ reminder;
			number = number/10;
		}
		System.out.println("The Reversed Number is:"+revNumber);

	}

}
