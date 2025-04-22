package Day20;

class Car{
	int speed=100;
	
	 Car() {
		System.out.println("Car class-Default cons");
	}
	
	void accelarate() {
		System.out.println("Pareant class ");
	}
}

class BMW extends Car{
	int speed=160;// variable override
	
	 BMW() {
		//System.out.println("BMW class-Default cons");
		}
		
	void displaySpeed() {
		System.out.println(speed); // child class variable
		System.out.println(super.speed); // immediate parent class variable
	}
	
	void accelarate() { // method override
		System.out.println("Child class ");
		super.accelarate(); // immediate parent class method
	}
}
	
	



public class SuperClass {

	public static void main(String[] args) {
		BMW obj=new BMW();
		//obj.displaySpeed();
		//obj.accelarate();

	}

}
