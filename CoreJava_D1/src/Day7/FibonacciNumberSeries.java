package Day7;

import java.util.Scanner;

public class FibonacciNumberSeries {

	public static void main(String[] args) {
		int number,a=0,b=1,nextItem=0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number");
		number = scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			System.out.print(a+" ");
			
			nextItem=a+b;
			a=b;
			b=nextItem;
		}
	}

}
