package Day17;

// This also called constructor chaining
public class Point3Test {
	
	Point3Test(){
		System.out.println("default constructor");
	}
	
	Point3Test(String str){
		this();
		System.out.println(str);
	}
	
	Point3Test(String str, int a){
		//this(); // called the default constructor
		this("Halis");// called the 2nd constructor
		System.out.println(str+" "+ a);
	}

	public static void main(String[] args) {
		
		Point3Test obj = new Point3Test("Tumpa",100);
	}

}
