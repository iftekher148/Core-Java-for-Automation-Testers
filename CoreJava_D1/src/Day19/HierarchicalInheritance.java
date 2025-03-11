package Day19;

class Parent {
	int x=10;
	void display() {
		System.out.println(x);
	}
}

class Child1 extends Parent{
	int y=20;
	void display1() {
		System.out.println(y);
	}
}

class Child2 extends Parent{
	int z=30;
	void display2() {
		System.out.println(z);
	}
}

public class HierarchicalInheritance {

	public static void main(String[] args) {
		Child1 ch1= new Child1();
		System.out.println(ch1.x); // parent
		ch1.display();// parent
		System.out.println(ch1.y); //Child1
		ch1.display1(); //child1
		
	}

}
