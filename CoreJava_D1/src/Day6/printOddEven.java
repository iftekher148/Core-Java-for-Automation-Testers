package Day6;

public class printOddEven {

	public static void main(String[] args) {
		// print odd/even 1-10;
		int i=1;
		
	while(i<=10) {
		if(i%2==0) {
			System.out.println("Odd"+i);
		}
		else {
			System.out.println("Even"+i);
		}
		i++;
	}

	}

}
