package Day23;

public class ProtectTestClassObject {

	public static void main(String[] args) {
		// protected class can be access  other class of the same package
		ProtectTestClass obj = new ProtectTestClass();
		System.out.println(obj.d); 
		obj.method1();

	}

}
