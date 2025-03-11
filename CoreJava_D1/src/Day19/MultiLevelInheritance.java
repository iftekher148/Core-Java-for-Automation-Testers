package Day19;



class X{ //parent Class
	int x=10;
	void display() {
		System.out.println(x);
	}
}

class Y extends X{ // Child 1
	int y=20;
	void printY() {
		System.out.println(y);
	}
}

class Z extends Y{ // Child 1
	int z=30;
	void printZ() {
		System.out.println(z);
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		/*
		Y objY = new Y(); // child1 obj
		System.out.println(objY.x); // parent class
		objY.display(); //parent class
		System.out.println(objY.y); // child1
		objY.printY(); // Child1
		*/
		
		Z objZ = new Z();//child2
		System.out.println(objZ.x); //parent class
		objZ.display();
		System.out.println(objZ.y); //child1
		objZ.printY(); //child1
		System.out.println(objZ.z); ////child2
		objZ.printZ(); //child2
		
		
	}

}
