package accessmodifier;

import Day23.PublicTestClass;

public class TestPublic {

	public static void main(String[] args) {
		PublicTestClass obj = new PublicTestClass();
		System.out.println(obj.d); 
		obj.method1();

	}

}
