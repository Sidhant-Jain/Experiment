package mindBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortTest {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		al.add("123");
		al.add("456");
		al.add("768");
		al.add("245");
		//System.out.println(al, new Comparator<String>());
		
		
		Collections.sort(al, new Comparator<String>(){
			@Override
			public int compare(String s1, String s2){
				int x =0;
//				System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));
				x=Integer.parseInt(s1) + Integer.parseInt(s2);
				System.out.println(x);
				return x;

			}
		});
		
		Collections.sort(al);
		
		System.out.println(al);
	}
}