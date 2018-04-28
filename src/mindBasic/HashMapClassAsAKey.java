package mindBasic;

import java.util.HashMap;

public class HashMapClassAsAKey {
	static int age;
	static String name;
	static String address;

	public static void main(String[] args) {
		HashMap<Object,String> hm = new HashMap<>();
		HashMapClassAsAKey et = new HashMapClassAsAKey();
		
		hm.put(et, address);
	}
}
