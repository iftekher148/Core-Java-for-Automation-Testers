package Day11;

public class StringBufferClass {

	public static void main(String[] args) {
	//	StringBuffer str1="Hello world"; // In this method "String" class can assign. But for "StringBuffer/StringBuilder", need to create object using new
		StringBuffer str1=new StringBuffer("Hello World");
		StringBuilder str2=new StringBuilder("Hi i am rock");
		
		StringBuffer rev=str1.reverse();
		System.out.println(rev);
		
		StringBuilder rev1=str2.reverse();
		System.out.println(rev1);

	}

}
