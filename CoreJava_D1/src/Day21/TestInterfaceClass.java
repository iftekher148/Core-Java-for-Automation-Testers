package Day21;

//5: Multiple inheritance using two interfaces
public class TestInterfaceClass implements Interface1, Interface2{

	public static void main(String[] args) {
		TestInterfaceClass obj = new TestInterfaceClass(); // create child class obj
		System.out.println(obj.a);
		System.out.println(obj.b);
		obj.method1();
		obj.method2();

	}

	@Override
	public void method2() {
		System.out.println("Method 2 from Interface 2");
		
	}

	@Override
	public void method1() {
		System.out.println("Method 1 from Interface 1 ");
		
	}

}
