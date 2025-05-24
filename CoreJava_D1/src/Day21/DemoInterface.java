package Day21;


//1: Blueprint of object
interface Book{
	int page=100; // 2: final & static variable
	String author = "Rocktim"; // 2: final & static variable
	
	// 4: On the interface all the methods are public
	void method1(); // 3: Abstract method
	default void method2() { // 3: Default method
		System.out.println("Default Method");
	}
	static void method3() { // 3: Static method
		System.out.println("Static Method");
	}
}



public class DemoInterface implements Book { // 7: in Class implements keyword for interface
	public void method1() { // since on the interface all the method are public, here need to specify public. because of its capture by'default'
		System.out.println("Abstract method");
	}
	
	void method4() {
		System.out.println("Child class");
	}

	public static void main(String[] args) {
		/*
		//Case 1: using child class object
		
		DemoInterface obj = new DemoInterface(); //
		obj.method1(); // Abstract class
		obj.method2(); // default class
		//obj.method3() // we can not call like this
		Book.method3(); //using interface we can call static method
		*/
		
		// 8: Case 2: Using interface referance to call the child class object
		
		 //Book bk = new Book(); // not possible to create interface obj
		Book bk = new DemoInterface(); //child class object with interface referance  variable. this referance variable is only acces on the interface method
		bk.method1();
		bk.method2();
		//bk.method3();// can ot call 
		Book.method3();
		//bk.method4();// this method is not declare on the interface. so interface referance  variable can not acces this method

	}

}
