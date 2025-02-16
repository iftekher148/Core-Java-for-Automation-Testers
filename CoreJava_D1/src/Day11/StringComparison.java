package Day11;


public class StringComparison {

	public static void main(String[] args) {
		//Example1: This value is on the 'String Constant pool'
		String str1="Welcom"; // Declare: String Constant or String Literal
		String str2="Welcom";
		
		System.out.println(str1==str2);//boolean
		System.out.println(str1.equals(str2));
		
		System.out.println("---------------------------");
		
		
		//Example2: Heap Memory[value on the heap memory & create object for each value].-- Outside of 'String Constant pool'
		String s1=new String("Sowroop");
		String s2=new String("Sowroop");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println("---------------------------");
		
		
		//ExMPLE 3
		String ss1= "Bangladesh"; // On the string constant pool
		String ss2=new String("Bangladesh"); // On the Heap Memory
		
		System.out.println(ss1==ss2); // compare the object
		System.out.println(ss1.equals(ss2));// compare the value
		
		System.out.println("-----------------------");
		
		//Example 4:
		
		String sk1="Welcome"; //SCP
		String sk2= new String("Welcome"); //heap Memory
		String sk3=sk2;// Heap memory sk2. sk2 pointing sk2
		
		System.out.println(sk1==sk2);//false
		System.out.println(sk1.equals(sk2));//true
		System.out.println(sk1==sk3);//false
		
		

	}

}
