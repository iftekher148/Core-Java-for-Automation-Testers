package Day16;

public class MethodOverloadingAddition {
	
	// Variable
	int a,b,c;
	void sum() { // Case 1: No input data
		a=100;
		b=200;
		System.out.println(a+b);
	}
	
	void sum(int x, int y) { // Case 2: two input parameters
		System.out.println(x+y);
	}
	
	void sum(int x, double y) { // Case 3: 2 input but different datatypes
		System.out.println(x+y);
	}
	
	void sum(double y, int x) { // Case 3: 2 input but order is different
		System.out.println(x+y);
	}
	
	void sum(int x, double y,int z) { // Case 3: 2 input 
		System.out.println(x+y+z);
	}
	
}
