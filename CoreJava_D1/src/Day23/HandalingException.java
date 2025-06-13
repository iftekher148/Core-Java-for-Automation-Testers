package Day23;

import java.util.Scanner;

public class HandalingException {

	public static void main(String[] args) {
		
		try {
			System.out.println("Start the Program:");
			Scanner sc = new Scanner(System.in);
			//Example 1:ArithmeticException
				System.out.println("Enter Number:");
				int num = sc.nextInt();
				int a =(1000/num);
				System.out.println(a);
		}
		catch (NullPointerException e) {
			System.out.println("ArithmeticException block");
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Exception block");
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Finally Statement");
		}

	}

}
