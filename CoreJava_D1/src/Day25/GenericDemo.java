package Day25;

// Declare Generic Class. 

class Test <T>{
	//int value;
	//Declare on the compiler time
	T value; // On the Generic class we cann't declare specific data type
	T id;
	T key;
}

public class GenericDemo {

	public static void main(String[] args) {
		/*
		Test test = new Test(); // create object of the Test class
		test.value="Gello"// can not assing string value because of int declare
				*/
		
		// on the run time. This is Parameterized object
		Test <Integer>test = new Test<>(); // '<>'== dimond symbol. Type declare during object(Parameterized) creation on the Generic class
		test.value=100;
		test.id=400;
		test.key=1000000;
		
		Test <String>test1 = new Test<>(); 
		test1.value="Rocktim";
		test1.id="Alam";
		test1.key="Learning";
		
	}

}
