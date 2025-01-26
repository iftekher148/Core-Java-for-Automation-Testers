package Day4;

public class TernaryOperator {

	public static void main(String[] args) {
		
//		// variable = expression ? result1 : result2
//		int a=10,b=50;
//		int result = (a>b) ? a:b;
//		System.out.println(result); //

		int a = 20, b = 10, c = 30, result;

        // result holds max of three
        // numbers
        //result = ((a > b) ? (a > c) ? a : c : (b > c) ? b : c);
		result = ((a>b) ? (a>c)?  a:c: (b>c)? b:c );
        System.out.println("Max of three numbers = "+ result);
	}

}
