package Day24;

public class TypeCastingExample {

	public static void main(String[] args) {
		// Up casting-- Small --> big
		// int --> long
		int intvalue=100;
		long longvalue = intvalue; //automatically
		System.out.println(longvalue);
		
		//float >> double
		float floatvalue = 12.3f;
		double doublevalue = floatvalue;
		System.out.println(doublevalue);
		
		System.out.println("-----------End of Upcasting-------------------");
		
		System.out.println("--------------Downcasting Start---------------");
		
		// Down casting--  big -----> Small
		//long >> int
		long lgvalue= 2000;
		int ivalue = (int)lgvalue; // manually
		System.out.println(ivalue);
		
		//double >> float
		double dval=23.444;
		float fval= (float) dval;
		System.out.println(fval);
		

	}

}
