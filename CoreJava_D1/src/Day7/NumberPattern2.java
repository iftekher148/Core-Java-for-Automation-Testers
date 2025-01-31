package Day7;

import java.util.Scanner;
/*
1  
12  
123  
1234  
12345 
*/

public class NumberPattern2 {

	public static void main(String[] args) {

		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

}
}
