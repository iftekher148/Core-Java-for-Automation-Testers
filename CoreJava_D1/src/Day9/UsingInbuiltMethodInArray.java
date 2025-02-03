package Day9;

import java.util.Arrays;

public class UsingInbuiltMethodInArray {

	public static void main(String[] args) {
//		int a[]= {10,40,50,38,68,41,57}; //unsorted array
//		 System.out.println("Before sorting the array: "+Arrays.toString(a));
//		 
//		 //'sort' is not have any return type. so you can't assign it. 
//		 Arrays.sort(a);//Acending order- low to high
//		 System.out.println("After Sorting the array:"+Arrays.toString(a));
		
		char c[]= {'A','S','M','K','L'};
		System.out.println("Before Sort:" + Arrays.toString(c));
		
		Arrays.sort(c);
		System.out.println("After Sort:"+ Arrays.toString(c));

	}

}
