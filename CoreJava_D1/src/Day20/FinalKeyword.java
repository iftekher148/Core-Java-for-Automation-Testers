package Day20;

final class testClass{
	int a=100; // without 'final' keyword
	final int  b=200; //constant
	
	final void display() {
		System.out.println("Patent class display");
	}
}

class child extends testClass{ // can't extend base class as parent class is final
	/*void display() { //show error when using final as overrride
		System.out.println("Child Class");
	}*/
}


public class FinalKeyword {
	public static void main(String[] args) {
//		testClass ttClass = new testClass();
//		System.out.println(ttClass.a);
//		ttClass.a=3000;
//		System.out.println(ttClass.a);
//		
//		//using final keyword
//		System.out.println(ttClass.b);
//		ttClass.b=3000; // Show error. final value can't be change/ compile time error
//		System.out.println(ttClass.a);
		
		child cd= new child();
		cd.display();
		

	}

}
