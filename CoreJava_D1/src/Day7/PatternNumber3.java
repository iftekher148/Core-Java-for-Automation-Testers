package Day7;

import java.util.Scanner;

/*
 
1 
2 
333 
4 
55555 
*/

public class PatternNumber3 {

	public static void main(String[] args) {
		int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number:");
		number=scanner.nextInt();
		
		for(int i=1;i<=number;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {  // even number- it will only once and break the lopp
					System.out.print(i);
					break; // break the inner 'j' loop.
				}
				else {
					System.out.print(i);
				}
			}
			System.out.println(" ");
		}

	}
}
