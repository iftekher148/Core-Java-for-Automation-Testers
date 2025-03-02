package Day17;

public class StaticStudent {
	int roll;
	char grade;
	static String city="Dhaka";
	
	static void display1() {
		System.out.println("Static Method");
	}
	
	void display2() {
		System.out.println("Non Static ");
	}

	
	// Static variable only work on same class. main method variable should be on the same class.
	// What happend if the main method have different class?? 
	/*
	public static void main(String[] args) {
		
		System.out.println(city); // No need to create object for calling static variable & methods
		display1();
		
		StaticStudent st =new StaticStudent();
		System.out.println(st.roll);// need to create object
		System.out.println(st.city); // we can access statice varible using obj
		
	}
	*/

}
