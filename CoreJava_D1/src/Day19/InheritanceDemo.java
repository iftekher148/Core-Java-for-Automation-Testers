package Day19;

// Single Inheritance

class A{ // Parent Class
			// you can't use 'public' keyword in this class. because .java extension class name already have with public
	int a=10;
	void display() {
		System.out.println(a);
	}	
}

class B extends A{ // child Class
	int b=20;
	void print() {
		System.out.println(b);
	}
}

public class InheritanceDemo {

	public static void main(String[] args) {
		A objA= new A(); // class A object creation
		System.out.println(objA.a); // Class A variable
		objA.display(); // Class A method
		
		B objB=new B(); // class B object creation
		System.out.println("Class A="+ objB.a); // Class A variable
		System.out.println("Class B="+objB.b); // Class B variable
		objB.display(); // Class A method
		objB.print(); // Class B method

	}

}
