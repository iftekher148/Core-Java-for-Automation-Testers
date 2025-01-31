package Day6;

public class continueBreak {

	public static void main(String[] args) {
		int i=1;
		for(i=1;i<=10;i++) {
			System.out.println(i);
			if(i==6) 
				break;
		
		}
		
		System.out.println("----------------------------");
		
		for(int j=1;j<=10;j++) {
			System.out.println(j);
			if(j==6)
				continue;
		}

	}

}
