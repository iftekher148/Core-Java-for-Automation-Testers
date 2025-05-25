package accessmodifier;

import Day23.DefaultTestClass;

public class AccessDefault {

	public static void main(String[] args) {
		// can not access from other package
				DefaultTestClass obj = new DefaultTestClass();
			//	System.out.println(obj.a); //
			//	obj.method2();

	}

}
