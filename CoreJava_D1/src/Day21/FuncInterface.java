package Day21;

@FunctionalInterface
interface FunctionalInterface1 {
	void method1(); // one abstract method
	
	default void method2() {
		System.out.println("Default Method 1");
	}
	
	default void method3() {
		System.out.println("Default Method 2");
	}
	
	 static void method4() {
		System.out.println("Static Method 1");
	}
	 static void method5() {
			System.out.println("Static Method 2");
		}
}

public class FuncInterface implements FunctionalInterface1  {

	public void method1() {
		System.out.println("Abstract method");
	}
	
	public static void main(String[] args) {
		FuncInterface obj = new FuncInterface();
		obj.method1();
		obj.method2();
		obj.method3();
		
		FunctionalInterface1.method4();
		FunctionalInterface1.method5();
	

	}

}
