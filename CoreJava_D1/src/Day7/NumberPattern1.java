package Day7;

import java.util.Scanner;

/*
1 
22 
333 
4444 
55555 
*/


public class NumberPattern1 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}

	}

}
