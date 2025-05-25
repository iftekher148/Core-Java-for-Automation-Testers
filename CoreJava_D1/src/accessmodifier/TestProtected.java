package accessmodifier;

import Day23.ProtectTestClass;

//	protected class can be access  other package with child class obj using inheritance


public class TestProtected extends ProtectTestClass { // inheritance

	public static void main(String[] args) {
		/*
		ProtectTestClass obj = new ProtectTestClass(); // using parent class obj, can not access
		System.out.println(obj.d); // 
		obj.method1();
		*/
		// Need to declare child class obj
		TestProtected obj = new TestProtected();
		System.out.println(obj.d);
		obj.method1();

	}

}
