package Day12;

public class PangramString1 {

	public static void main(String[] args) {
		String str1 = "The quick brown  jumps over the lazy dog"; // Fixed the sentence

        str1 = str1.toLowerCase(); // Convert to lowercase

        // Check if all letters from 'a' to 'z' are present
        for (char i = 'a'; i <= 'z'; i++) { // convert into asscii
            if (str1.indexOf(i) < 0) { // If any letter is missing.
            							// indexOf return index number of a given string. We convert into asscii. 
										//If any character is missing in the string it will return -1. So, the logic is "< 0"
                System.out.println("The String is not a Pangram");
                return; // Exit immediately
            }
        }

        System.out.println("The String is a Pangram");
    }

}


