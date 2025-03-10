package Day16;

public class ConstructorOverloading {
	
	String text, firstName, lastName;
	
	ConstructorOverloading(){ // Case 1: Default constructor.. No input
		text="Hi";
		firstName="";
		lastName="";
		System.out.println(text+" "+firstName+" "+lastName);
	}
	
	ConstructorOverloading(String fName){ // Case 2: One input
		text="Hi";
		firstName=fName;
		lastName="";
		System.out.println(text+" "+firstName+" "+lastName);
	}
	
	ConstructorOverloading(String fName, String lName){ // Case 3: two input
		text="Hi";
		firstName=fName;
		lastName=lName;
		System.out.println(text+" "+firstName+" "+lastName);
	}
}
