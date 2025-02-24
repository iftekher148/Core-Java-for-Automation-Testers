package Day16;



public class OverloadMainMethod {
	
	
	void main(){ // Case 1: No input
		System.out.println("No input");
	}
	
	void main(String name) { // Case 2: string input
		System.out.println(name);
	}
	void main(int x) { // Case 3: int input
		System.out.println(x);
	}
	
	void main(int x, double y) { // Case 4: two input
		System.out.println(x+y);
	}

	public static void main(String[] args) {
		
		OverloadMainMethod objMainMethod = new OverloadMainMethod();
		objMainMethod.main(); // Case 1
		objMainMethod.main("Rocktim"); // Case 2
		objMainMethod.main(10); // Case 3
		objMainMethod.main(10, 12.23); // Case 4
	}

}
