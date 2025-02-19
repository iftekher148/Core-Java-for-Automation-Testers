package day14anotherPackage;

import Day14.Student;

public class StudentAnotherpackage {

	public static void main(String[] args) {
		Student student = new Student();
		
		//to access variable & method from another package you have to declare public
		student.age=23;
		student.printAgeOnly();

	}

}
