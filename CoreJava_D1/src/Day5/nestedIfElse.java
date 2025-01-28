package Day5;

public class nestedIfElse {

	public static void main(String[] args) {
		int age=30;
		boolean hasLicence =true;
		
		if(age>25) {
			if(hasLicence) {
				System.out.println("You are eligible to Drive ");
			}
			else {
				System.out.println("Not Eligible to Drive");
			}
		}
		else {
			System.out.println("You ca Drive");
		}

	}

}
