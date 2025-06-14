package Day26;

import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		System.out.println(map.put(100, "Rocktim"));
		System.out.println(map.put(100, "Tumpa"));
		
		/*
		 Java internally does the following:

Checks if the key 100 already exists in the map.

If it does not exist:

Adds the new key-value pair: 100 → "Rocktim"

Returns null (because no value existed for this key before).

If it does exist:

Stores the old value (e.g., "Rocktim")

Replaces it with the new value (e.g., "Tumpa")

Returns the old value
*/
		

	}

}
