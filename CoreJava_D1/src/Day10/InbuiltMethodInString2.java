package Day10;

public class InbuiltMethodInString2 {

	public static void main(String[] args) {
		String str1="I Love";
		String str2=new String("Do you Love ");
		String str3="I hate you";
		
		//length()-->It returns string length
		int len=str1.length();
		System.out.println(len);
		System.out.println("I Love. Do you Love ".length());
		
		//concat()--> // The '+' operator concatenates two strings.
		System.out.println(str1+str2);
		System.out.println(str1+str2+str3);
		String str4=str1.concat(str2);
		String str5 =str1.concat(str2.concat(str3));
		System.out.println(str4);
		System.out.println(str5);// The '+' operator concatenates two strings.


	}

}
