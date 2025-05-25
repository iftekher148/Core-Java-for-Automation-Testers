package Day23;

public class PublicTestClass {
	
	public int d =100;
	public void method1(){
		System.out.println("public Method");
	}

	public static void main(String[] args) {
		PublicTestClass obj = new PublicTestClass();
		System.out.println(obj.d); 
		obj.method1();

	}

}
