package Day9;

import java.util.Arrays;

public class ReverseOrderPrintInArray {

	public static void main(String[] args) {
		int a[]= {20,30,40,10,37,55,39,7};
		int rev[];
		
		System.out.println("Before Reverse the Array:"+ Arrays.toString(a));
		
		System.out.print("After Reverse the Array: ");
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i]+" ");
		}

	}

}
