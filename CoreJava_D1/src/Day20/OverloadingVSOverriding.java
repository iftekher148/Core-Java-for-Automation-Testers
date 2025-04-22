package Day20;

class Base{
	void m1(String str) {
		System.out.println(str);
	}
	
	void m2(String s) {
		System.out.println(s);
	}
}

class SubClass extends Base{
	void m1(String str) { // same method signature like Base Class
		System.out.println(str+"Child Class override"); // override
	}
	
	void m2(String str1, String str2) { // overloading. For method overloading inheritanc doenot required
		System.out.println(str1+str2);
	}
}


public class OverloadingVSOverriding {

	public static void main(String[] args) {
		SubClass sbClass = new SubClass();
		sbClass.m1("Rocktim"); // overriden from subclass
		sbClass.m2("Alam"); // base class
		sbClass.m2("Tumpa", "Rani"); // overloading from subclass

	}

}
