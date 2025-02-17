package Day12;

public class CountOccurancesOfCharcterInString {

	public static void main(String[] args) {
		String str1= "Hello I love Lol";
		char targetChar='l';
		int count=0;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)=='l')
				count++;
		}
		System.out.println(count);

	}

}
