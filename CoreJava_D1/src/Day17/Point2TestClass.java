package Day17;

public class Point2TestClass {
	
	void display1() {
		System.out.println("Dispalyed 1");
	}
	
	void display2() {
		display1();// implicite calling the method
		//this.display1();
		System.out.println("Dispalyed 2");
	}

	public static void main(String[] args) {
		Point2TestClass th = new Point2TestClass();
		th.display2();

	}

}
