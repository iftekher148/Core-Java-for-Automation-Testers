package Day15;

public class EmployeeMain {

	public static void main(String[] args) {
		
		// creating Employee object
		Employee employee = new Employee();
		
		
		//Approch 1: assign values into vcariables
		//Using object referance or 
		/*
		employee.empID=123;
		employee.empName="Rock";
		employee.empSalary=1234.56;
		*/
		//calling the function
		//employee.employeeDetails();
		
		
		//Approches 2: define the value using another method
		//Using method in the class
		employee.getEmployeeData(500,"tumpa",3456.67);
		employee.employeeDetails();
	}

}
