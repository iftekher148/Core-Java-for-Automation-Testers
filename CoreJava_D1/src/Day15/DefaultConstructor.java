package Day15;

public class DefaultConstructor {
	
	//Declare variable--instance variable
	int empID;
	String empName;
	double empSalary;
	
	DefaultConstructor(){// Method name is same a class name
		// Default constructor... No input parameter
		System.out.println("Hello");
			empID=100;
			empName = "Hasina";
			empSalary=29385.45;
	}
	
	void employeeDetails() {
		System.out.println(empID+" "+empName+" "+empSalary);
	}

	public static void main(String[] args) {
		
		DefaultConstructor dConstructor=new DefaultConstructor();
		dConstructor.employeeDetails();
		
	}

}
