package Day12;

import java.util.Arrays;

public class ReverseEachWordinString {

	public static void main(String[] args) {
		String str1="Love Bangladesh You";
		String revString=""; //Declare empty string
		
		String words[]=str1.split(" "); // spliting the string into words. The output is '[Love, Bangladesh, You]'
		//System.out.println(Arrays.toString(words));
		
		for(String s:words) { // enhanched for loop
			String revWords=""; //Empty string for spited word
			for(int i=s.length()-1;i>=0;i--) {
				revWords+=s.charAt(i);
			}
			
			revString+=revWords+" ";
		}
		System.out.println(revString);

	}

}
