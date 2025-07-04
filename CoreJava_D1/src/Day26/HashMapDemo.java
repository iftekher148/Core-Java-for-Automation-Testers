package Day26;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		 // M:1 Declare 
		HashMap hm = new HashMap();
		Map myMap = new HashMap();
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Adding data into the map.... Key value pair
		map.put(100, "Rocktim");
		map.put(101, "tipu");
		map.put(104, "Tisa");
		map.put(200, "Halim");
		System.out.println(map);
		map.put(100, "Nisan");
		System.out.println(map);
		
		
		//N Size of the map
		System.out.println(map.size());
		
		// Remove one key pair value
		map.remove(104);
		System.out.println(map);
		
		// Retrive value of a given key
		System.out.println(map.get(100));
		
		// Retrive all the keys values from the hashMap
		System.out.println(map.keySet()); //Retrive all the keys from the hashMap
		System.out.println(map.values()); // all the values 
		System.out.println(map.entrySet()); // keys and values
		
		
		//Retriving data from the HashMap
		// Using for loop
		for(Integer k: map.keySet()) {
			System.out.println(k + "  "+ map.get(k));
		}
		
		
	}

}
