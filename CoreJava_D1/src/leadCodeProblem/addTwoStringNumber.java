package leadCodeProblem;
//415. Add Strings
//https://leetcode.com/problems/add-strings/description/
public class addTwoStringNumber {

	public static void main(String[] args) {
		String num1="456";
		String num2="77";
		StringBuilder result=new StringBuilder(); // empty string to store result of sum;
		int carry =0;
		
		int i=num1.length()-1; //Last position
		int j=num2.length()-1;
		
		while(i>=0 || j>=0 || carry > 0) { //The loop runs while there are digits left in either num1 or num2 or there is a carry.
			int digit1=0, digit2=0;       //This ensures we process all digits even if one number is shorter.
			
			if(i>=0) {
				digit1=num1.charAt(i)-'0'; //Convert num1.charAt(i) (which is a character) to an integer by subtracting '0'.
											//Example: '3' - '0' = 3.
			}
			
			if(j>=0) {
				digit2=num2.charAt(j)-'0';
			}
			
			int sum= digit1+digit2+carry;
			 carry = sum / 10; // vagfol;
			 result.append(sum%10);
			 
			 i--;
			 j--;
			
		}
		System.out.println(result.reverse().toString());
		
		

	}

}
