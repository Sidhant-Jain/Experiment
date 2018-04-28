package linkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>();
//		HashMap<Integer, String> lhm = new HashMap<>();
		
		lhm.put(1, "Apple");
		lhm.put(3, "cat");
		lhm.put(2, "ball");
		lhm.put(6, "goat");
		System.out.println(lhm);
		
	}

}
