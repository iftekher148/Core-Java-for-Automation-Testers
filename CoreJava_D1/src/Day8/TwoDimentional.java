package Day8;

import java.security.cert.X509Certificate;

public class TwoDimentional {

	public static void main(String[] args) {
		//Approach 1:
		int a[][]=new int[3][2]; //Declaration and specify the length of the array is: 3 rows & 2 columns
		a[0][0]=10;
		a[0][1]=20;
		
		a[1][0]=30;
		a[1][1]=40;
		
		a[2][0]=50;
		a[2][1]=60;
		
		//Find length:
//		System.out.println(a.length); //Row Length
//		System.out.println(a[0].length); //Columns Length
		
		int b[][] = { 	{1,2,3,4,5},
						{6,7,8,9,10},
						{11,12,13,14,15}
					};
//		for(int i=0;i<b.length;i++) { //Rows length
//			for(int j=0;j<b[i].length;j++) {
//				System.out.print(b[i][j]+" ");
//			}
//			System.out.println(" ");
//			
//		}
		
		//Enhanched For loop
		for(int x[] : b) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println(" ");
		}
	}

}
