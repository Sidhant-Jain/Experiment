package mindBasic;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		 HashMap<Integer,Integer> hm = new HashMap();
		 hm.put(null, null);
		 hm.put(null, null);
		 //hm.put(null, 2);
		 hm.put(11, 21);
		 hm.put(12, 22);
		 hm.put(13, 33);
//		 System.out.println(hm);
		 hm.put(11, 24);
		 hm.put(12, 18);
		 System.out.println(hm);
//		HashMap<String, Employee> hashMap = new HashMap<>();
//
//		Employee e1 = new Employee(1, "Siddhant");
//		hashMap.put("S", e1);
//		System.out.println(hashMap);
//		e1.clear();
//		e1 = new Employee(2, "Ram");
//		hashMap.put("R", new Employee(3, "Rupesh"));
//		System.out.println(hashMap);
//		hashMap.get("R").name = "RupeshBye!";
//		System.out.println(hashMap);
	}

}

class Employee {
	int empid;
	String name;

	public Employee(int empid, String name) {
		this.empid = empid;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}

	public void clear() {
		this.empid = 0;
		this.name = null;
	}

}
