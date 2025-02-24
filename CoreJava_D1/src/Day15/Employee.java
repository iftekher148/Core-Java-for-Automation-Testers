package Day15;

public class Employee {
	
	//Declare variable--instance variable
	int empID;
	String empName;
	double empSalary;
	
	//local variable
	void getEmployeeData(int id, String name, double salary) {
		empID=id;
		empName=name;
		empSalary=salary;
	}
	
	//User defined method
	void employeeDetails() {
		System.out.println(empID+" "+empName+" "+empSalary);
	}
	
	
}
