package Day7;

import java.util.Scanner;
/*
 
* 
** 
*** 
**** 
****

*/

public class StarPattern1 {

	public static void main(String[] args) {
		
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
