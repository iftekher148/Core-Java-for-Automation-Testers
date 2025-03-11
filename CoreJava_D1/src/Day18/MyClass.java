package Day18;

public class MyClass {

	// Static variable
	static int count=0;
	
	// non-static variable-Instance Variable
	int incrementNumber=0;
	
	//Default constructor
	MyClass(){
		count++;
		incrementNumber++;
	}
	
	//Static Method
	static void displayCount() {
		System.out.println("Static Variable "+ count);
	}
	
	// non-static variable
	void displayIncriment() {
		System.out.println("Non Static variable "+ incrementNumber);
	}
	
	public static void main(String[] args) {
		MyClass obj1=new MyClass(); // object 1
		displayCount(); // when call the constructor the counter will increment and the value is store in Class memory. value is '1'
		obj1.displayIncriment(); // for no-static variable always call the fresh value. value is '1'
		
		MyClass obj2=new MyClass(); // object 2
		displayCount(); // On the 2nd time call, the value is retained from class memory. so value is '2'. old value is incremented
		obj2.displayIncriment(); // for no-static variable always call the fresh value. value is '1'. old value is not incremented because new obj
		
		

	}

}
