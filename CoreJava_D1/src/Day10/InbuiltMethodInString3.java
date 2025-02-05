package Day10;

public class InbuiltMethodInString3 {

	public static void main(String[] args) {
		//contains()--> It returns true or false after matching the sequence of char value.
		// check for the string is the part of the Main string
		String str1="BusinessMan"; //Main string
		String str2="Man"; // part  of main string.
		System.out.println(str1.contains(str2));
		
		
		//equals()--> It checks the equality of string with the given object. Compare string and return boolean(true/false)
		
		String str3="Rocktim";
		String str4="Rocktim";
		System.out.println(str3.equals(str4));
		
		// equalsIgnoreCase()-->It compares another string. It doesn't check case.
		String str5="Rocktim";
		String str6="rockTim";
		System.out.println(str5.equalsIgnoreCase(str6));
		
		//containEquals()--> it as like equals()
		String str7="Rocktim";
		String str8="rockTim";
		System.out.println(str7.contentEquals(str8));
		
		
	}

}
