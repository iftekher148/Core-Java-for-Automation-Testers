package Day25;

import java.util.ArrayList;
import java.util.Iterator;

public class ArreyListDemo2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(100);
		list.add(200);
		list.add(500);
		list.add(400);
		list.add(100);
		list.add(700);
		list.add(100);
		
		System.out.println(list.get(3));
		System.out.println(list);
		
		//  Iterator using Integer Generics
		 Iterator<Integer> it = list.iterator();
		 while(it.hasNext()) {
			 System.out.println(it.next());
		 }
		

	}

}
