package Day20;

class parentClass{
	void display() {
		System.out.println("Parent Class Display");
	}
}

class clidClass extends parentClass{
	@Override // It is optional . but if you declare this there must be same method signature for parent and child class. 
	//Or it will show error
	void display() {
		System.out.println("Child Class display");
	}
}

public class OverrideAnotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
