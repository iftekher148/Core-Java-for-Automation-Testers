package Day15;

public class HelloMain {

	public static void main(String[] args) {
		
		// create object of "Hello" class
		Hello h1=new Hello();
		
		//calling the method
		//No Input Parameters → No Return Type
		h1.Message1();
		
		//No Input Parameters → Has a Return Type
		//System.out.println(h1.Message2());
		int x= h1.Message2(); // store the return value into a variable
		System.out.println(x);
		
		//Has Input Parameters → No Return Type
		h1.Message3("Rocktim");
		h1.Message4("CSE", 12);//arguments
		
		//Has Input Parameters → Has a Return Types
		String fullNameString= h1.Message5("Nupur", "Rani");
		System.out.println(fullNameString);
	}

}
