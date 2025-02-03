package Day9;

/*Without a 'break' statement, even if the element is found early in the array, the loop continues to iterate 
 * through the rest of the array unnecessarily. This isn't a major problem for small arrays but can be 
 * inefficient for larger arrays.*/

/*Without a flag (a boolean variable) to record whether the element was found, you end up printing both 
 * "Element found in the Array" (if the element is present) and "Element is not found in the Array" after the loop.
In your example, if the element were found, you'll still see "Element is not found in the Array" because
 there's no condition preventing that final print*/
public class LinearSearchinArray2 {

	public static void main(String[] args) {
		int a[]= {10,11,13,30,15,27,30,35,40,50};
		int num = 3000;
		boolean found=false; //number is not found in the array in the initial stage
		// false- number is not found in the array
		// true- number is found in the array
		
		// Using Normal for loop
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				System.out.println("Element found in the Array index: "+i);
				found=true;
				break;
			}
		}
		if(found==false) {
			System.out.println("Element is not found in the Array");
		}
	}

}
