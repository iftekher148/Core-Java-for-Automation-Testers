package Day14;

public class StudentMain {
// Main Method on the sperate class
	public static void main(String[] args) {
		//On this StudentMain class, we will use info of 'Student' class
		
		//Create object of
		Student student1=new Student();
		
		// Assign the value
		student1.age=33;
		student1.grade="D";
		student1.name="Akkas";
		student1.rollNum=4956;
		
		//call the function
		student1.printAllValues();
		student1.printAgeOnly();

	}

}
