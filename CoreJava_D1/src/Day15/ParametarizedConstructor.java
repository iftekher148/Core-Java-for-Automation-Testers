package Day15;

public class ParametarizedConstructor {
	//Declare variable--instance variable
		int empID;
		String empName;
		double empSalary;
		
		ParametarizedConstructor(int id, String name, double salary){
			empID=id;
			empName=name;
			empSalary=salary;
		}
		
		void employeeDetails() {
			System.out.println(empID+" "+empName+" "+empSalary);
		}


	public static void main(String[] args) {
		ParametarizedConstructor pConstructor=new ParametarizedConstructor(300,"Tumpa",3456.3456);
		pConstructor.employeeDetails();

	}

}
