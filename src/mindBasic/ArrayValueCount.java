package mindBasic;

import java.util.ArrayList;


public class ArrayValueCount {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(1);
		al.add(2);
		al.add(1);
		al.add(3);
		System.out.println(al);
		
		System.out.println(al.contains(1));
	}

}
