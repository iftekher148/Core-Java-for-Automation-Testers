package Day7;

import java.util.Scanner;
/*
***** 
**** 
*** 
** 
*
*/

public class StarPattern2 {

	public static void main(String[] args) {
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		for(int i=number;i>=0;i--) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
