package Day12;

public class ReverseAlphabetsOnly {

	public static void main(String[] args) {
		//Input: "abc123pqr45xyz"
			//Output: "zyx123rqp45cba"
		String str1 = "abc123pqr45xyz";
		
		int start=0; // 1st index of the String
		int end= str1.length()-1; // Last index String
		
		char ch[] = str1.toCharArray(); // convert the string into a 'character Array'
		
		while (start < end) {
			
			if(Character.isDigit(ch[start])){ // The 'Character' is a inbuilt class in java. It's accept only single character. This why need to convert 'String to CharArray'
				start++;
			}
			else if(Character.isDigit(ch[end])) {
				end--;
			}
			else {
				char temp = ch[start];
				ch[start] = ch[end];
				ch[end]=temp;
				start++;
				end--;
			}
		} //ending while loop
		
		//System.out.println(new String(ch)); // convert the character into the string
		String str2= new String(ch);
		System.out.println(str2);
		


	}

}
