package Day8;

public class DifferentDataType {

	public static void main(String[] args) {

		Object obj[] = {10,10.4,'A',"Rocktim",true};
		
//		for(int i=0;i<obj.length;i++) {
//			System.out.println(obj[i]);
//		}
		
		for(Object x: obj) {
			System.out.println(x);
		}

	}

}
