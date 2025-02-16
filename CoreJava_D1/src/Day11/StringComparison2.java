package Day11;

public class StringComparison2 {

	public static void main(String[] args) {
		String str1 = "Soweap"; // String constrain pool
		String str2 = "Soweap"; // String constrain pool
		
		String str3 = new String("Hello"); // Heap Memory.. Outside SCP
		
		String str4 = str3.intern(); // This will add the constrain to the SCP..
		
	}

}
