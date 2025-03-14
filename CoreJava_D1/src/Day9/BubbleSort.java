package Day9;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int a[]= {10,33,9,20,45,7,44,50,30};
		int temp=0;
		
		System.out.println("Before Sorting:" + Arrays.toString(a));
		// Go entire array value
		for(int i=0;i<a.length;i++) {  //'i=0'--> 0 index(10
			// Subsequent array value
			for(int j=i+1;j<a.length;j++) { //'j=i+i'-->1 index(33)
				if(a[j]<a[i]) { //Comparison the value '33' & '10'. If the condition is true the execute the 'if' condition. 
								//33 & 10 is not correct. So move on and compare '9' & '10'
					// Swapping. 
					temp = a[i]; // a[i]=10. Now 'temp=10' and 'a[i]=0'
					a[i]=a[j]; // a[j]=9. Now 'a[i]=9' and 'a[j]=0'.... 
					a[j]=temp; //'a[j]=10' and 'temp=0'. 				// Now swapping done. '9' goes to 1st position and '10' goes to 9's position
				}
			}
			//System.out.println(a[i]);
			//System.out.println("After sorting:"+ Arrays.toString(a));
		}
		System.out.println("After sorting:"+ Arrays.toString(a));

	}

}
