package Day11;

import java.util.Arrays;

public class MutableVsImmutable {

	public static void main(String[] args) {
		//Mutable-- We can change the value (This will change during run time)
		// value is update in the same variable
		int arr[]= {10,2,5,70,11,45}; //unsorted 
		System.out.println(Arrays.toString(arr)); //original array
		Arrays.sort(arr); //sorting in the memory
		System.out.println(Arrays.toString(arr));//sorted array
		
		//Immutable-- cann't change the value in the memory;
		String str1="Welcom";
		System.out.println(str1);
		str1.concat("Java Programing");
		System.out.println(str1);// can't not update  str1 because of string. Original value
		String str2=str1.concat("Java Program"); // assign str2 variable
		System.out.println(str2);// concatanation
		
		//Mutable-- We can change the value (This will change during run time)
		StringBuilder sb1 = new StringBuilder("I love");
		System.out.println(sb1);
		sb1.append("Bangladesh");
		System.out.println(sb1); // the value is update on the same variable now

	}

}
