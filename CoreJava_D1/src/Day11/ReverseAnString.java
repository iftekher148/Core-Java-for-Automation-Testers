package Day11;

public class ReverseAnString {

	public static void main(String[] args) {
		//Approch 2;
		
		String str1="Hello World";
		String rev= "";
		
		char arr[]=str1.toCharArray(); //Each and every char have memory on this method
		for(int i=arr.length-1;i>=0;i--) {
			rev+=arr[i];
			
		}
		System.out.println(rev);

	}

}
