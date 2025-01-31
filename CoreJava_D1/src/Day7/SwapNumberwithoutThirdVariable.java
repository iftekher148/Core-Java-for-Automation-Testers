package Day7;

import java.util.Scanner;

public class SwapNumberwithoutThirdVariable {

	public static void main(String[] args) {
		
		int a,c,b;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter First Number a:");
		a=scanner.nextInt();
		System.out.println("Enter Sceond Numebr b:");
		b=scanner.nextInt();
		
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("After Swapping a is:"+a);
		System.out.println("After Swapping b is:"+b);

		

	}

}
