package Day7;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		int number,result=1;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number:");
		number=scanner.nextInt();
		
		for(int i=1; i<=number;i++) {
			result=result*i;
		}
		System.out.println("The  Factorial Result "+ result);

	}

}
