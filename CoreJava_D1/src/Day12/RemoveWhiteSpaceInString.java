package Day12;

public class RemoveWhiteSpaceInString {

	public static void main(String[] args) {
		String str1= "   Ja   va progr   mmme Langa uage   ";
		
		String str2 = str1.replaceAll("\\s", ""); // Remove white space
		System.out.println(str2);
		
		String str3 = str1.replaceAll("\\s", "A"); // Remove White space and replace with 'A'
		System.out.println(str3);
		

	}

}
