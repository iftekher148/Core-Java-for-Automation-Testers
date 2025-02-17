package Day12;

public class StringOfIndex {

	public static void main(String[] args) {
		String str1= "Rocktim";
		int index=str1.indexOf('R'); // indexOf return the index number of a given string. If the character is not present of 
										//the given string, then it will return -1
		System.out.println(index);
		
		int index2= str1.indexOf('N');
		System.out.println(index2);

	}

}
