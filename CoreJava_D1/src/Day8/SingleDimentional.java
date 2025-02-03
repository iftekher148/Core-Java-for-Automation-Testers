package Day8;

public class SingleDimentional {

	public static void main(String[] args) {
		//Approach 1:
		int a[] = new int[5]; // Declaration and specify the length of the array
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//Find the Length
		int l=a.length;
		System.out.println(l);
		/*
		//Normal for Loop:
		for(int i=0;i<a.length;i++) { // Don't use "i<=a.length. Cox it goes to 0-5. but our index it 0-4. on this case you have to use 'i<=a.length-1'
			System.out.println(a[i]);
		}*/
		
		//Enhanced For loop : For each loop
		for(int x:a) { // 'x' is variable and 'a' is array variable
			System.out.println(x);
		}
		
		//Approach 2:
		int b[]= {100,200,300,400,500,600}; //Declare and assign the value
		//System.out.println(b[0]);
		System.out.println(b.length);
		
		System.out.println("-------------------");
		for(int j:b) {
			System.out.println(j);
		}
	}

}
