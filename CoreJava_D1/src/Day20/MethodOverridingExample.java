package Day20;


// Hieary Inheritance
class Bank { //Parent Class
	double interestRate() { // Method signature
		return 4.5; // Method defination or implemantation
	}
}

class BOA extends Bank{ // inheritance
	//child1
	double interestRate() {// method overriding on the child class
		return 6.7;
	}
}

class BOD extends Bank{
	//child2
	double interestRate() {
		return 90.9;
	}
}



public class MethodOverridingExample {

	public static void main(String[] args) {
	 BOA ba= new BOA();
	 double va=ba.interestRate();
	 System.out.println(va);
	 
	 BOD da= new BOD();
	 double vaa=da.interestRate();
	 System.out.println(vaa);

	}

}
