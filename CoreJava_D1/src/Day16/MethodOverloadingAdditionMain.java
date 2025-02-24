package Day16;

public class MethodOverloadingAdditionMain {

	public static void main(String[] args) {
		 //create object of MethodOverloadingAddition class
		MethodOverloadingAddition objAddition = new MethodOverloadingAddition();
		
		// This is the advantage of function overloading. Method name is same but we can use in different purpose
		objAddition.sum(); // Case 1
		objAddition.sum(10, 10); // Case 2
		objAddition.sum(123.56, 10); // Case 3
		objAddition.sum(10, 11.11); //case 4
		objAddition.sum(10, 10.00, 10); // Case 4
	}

}
