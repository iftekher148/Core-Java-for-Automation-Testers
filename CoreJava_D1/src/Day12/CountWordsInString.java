package Day12;

public class CountWordsInString {

	public static void main(String[] args) {
		String str1= "Hello love Lol";
		int count=1;
		
		for(int i=0;i<str1.length();i++) {
			if(str1.charAt(i)== ' ' && str1.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);

	}

}
