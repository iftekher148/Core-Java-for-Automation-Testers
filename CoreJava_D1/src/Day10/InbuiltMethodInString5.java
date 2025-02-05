package Day10;

public class InbuiltMethodInString5 {

	public static void main(String[] args) {
		//substring()--> It return a string. Retrive the part of the main string..
		
		String str1="Rocktim";
		System.out.println(str1.substring(0)); // return index 1 to end of the string
		System.out.println(str1.substring(2)); // return index 2 to end of the string
		
		String str2="JavaProgram";
		System.out.println(str2.substring(0, 2)); // it will return before index 2(index=0,1)
		
		
		//toLowerCase()
		//toUpperCase()
		String str3= "RocKtIm";
		System.out.println(str3.toLowerCase());
		System.out.println(str3.toUpperCase());
	}

}
