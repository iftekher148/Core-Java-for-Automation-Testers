package Day15;

public class Hello {

	//No Input Parameters → No Return Type
	void Message1(){
		System.out.println("Bangladesh");
	}
	
	//No Input Parameters → Has a Return Type
	int Message2(){
		int a=10;
		a++;
		return a;
	}
	
	//Has Input Parameters → No Return Type
	void Message3(String name) {
		System.out.println(name);
	}
	
	void Message4(String dept, int a) {//parameter
		System.out.println(dept+" "+a);
	}
	
	//Has Input Parameters → Has a Return Type
	String Message5(String firstName, String lastName){
		return firstName+" "+lastName;
	}
}
