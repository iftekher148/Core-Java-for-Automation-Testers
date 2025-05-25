package Day23;

public class DefaultTestClass {
	 int a =100; // if not use any access modifier, then it is use 'default'
	 void method2(){
		System.out.println("Default Method");
	}

	public static void main(String[] args) {
		
		//can use with in same class and other class within same package
		DefaultTestClass obj = new DefaultTestClass();
		System.out.println(obj.a); 
		obj.method2();
	}

}
