package Day9;

public class CountDuplicateOfNumber {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60,70,40,40};
		int num=40;
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]==num) {
				count++;
			}
		}
		System.out.println("Total Number in the array:"+count+" times");
	}

}
