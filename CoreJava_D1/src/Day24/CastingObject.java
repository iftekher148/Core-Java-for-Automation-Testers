package Day24;

class Parent{
	String name ="rock";
	void method1() {
		System.out.println("Parent Class");
	}
}

class Child extends Parent{
	int a=100;
	void method2() {
		System.out.println("child class");
	}
}


public class CastingObject {
	
	public static void main(String[] args) {
		Child cd = new Child();
			System.out.println(cd.name); //parent
			cd.method1();
			System.out.println(cd.a); //child
			cd.method2();
			
			// Up casting
			
			Parent p= new Child(); // Parent class object // automatic
			System.out.println(p.name); //parent
			p.method1();
			//System.out.println(p.a); //child
			//p.method2();
			
			
			//Downcasting
			Child c = (Child) new Parent();//child class object  //manual
		
			System.out.println(c.name); //parent
			c.method1();
			System.out.println(c.a); //child
			c.method2();
	}

}
