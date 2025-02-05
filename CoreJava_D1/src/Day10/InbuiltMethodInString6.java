package Day10;

import java.util.Arrays;

public class InbuiltMethodInString6 {

	public static void main(String[] args) {
		//split()--> it will create multiple string based on delimiter. It returns a split string matching regex.
		
		String str1= "I Love Bangladesh";
		String s[]=str1.split(" "); //string obj. split() return string
		System.out.println(Arrays.toString(s));
		System.out.println(s[1]);
		
		String str2="test123@gmail.com";
		String []s2=str2.split("@");
		System.out.println(Arrays.toString(s2));
		
		
		String str3="$1,23,445";
		System.out.println(str3.replace(",", " "));
		System.out.println(str3.replace(","," ").replace("$", " "));
		

	}

}
