package leadCodeProblem;

public class DigitAddition {

	public static void main(String[] args) {
		int num=234;
		int sum=0;
		
		while(num>0) {
			int lastDigit=num%10;
			sum+=lastDigit;
			num=num/10; //remove last digit
		}
		
		System.out.println(sum);

	}

}
