package linkedHashMap;

import java.util.LinkedHashMap;
import java.util.TreeMap;

public class AcceptMap {

	public static void main(String[] args) {
		TreeMap<Integer, String> treemap = new TreeMap<>();
		
		treemap.put(1, "Apple");
		treemap.put(3, "cat");
		treemap.put(2, "ball");
		treemap.put(6, "goat");
		System.out.println(treemap);
		
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<>(treemap);
		System.out.println(lhm);
	}

}
