package Day14;
//Mian method on the same class

public class Student {
	
	// variable
	String name;
	public int age;
	int rollNum;
	String grade;
	
	//Declare Method
	void printAllValues() {
		System.out.println(name);
		System.out.println(age);
		System.out.println(rollNum);
		System.out.println(grade);
	}
	//Declare Method
	public void printAgeOnly() {
		System.out.println("Age of the Student:"+ age);
	}
	
	
//Now comment out the main method & create a new clas StudenMain. On that class we will execute
	/*
	public static void main(String[] args) {
		//Create object of the Student class
		Student stu1= new Student();
		
		//assign value to the variables during run time
		stu1.name="Rocktim";
		stu1.age=23;
		stu1.rollNum=10011;
		stu1.grade="A";
		
		//call or invoked the method
		stu1.printAllValues();
		stu1.printAgeOnly();
		
		Student stu2= new Student();
		
		//assign value to the variables during run time
		stu2.name="Rumi";
		stu2.age=27;
		stu2.rollNum=107654;
		stu2.grade="B";
		
		//call or invoked the method
		stu2.printAllValues();
		stu2.printAgeOnly();

	}
	*/

}
