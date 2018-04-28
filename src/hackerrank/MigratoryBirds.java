package hackerrank;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList al = new ArrayList();
		HashMap<Integer,Integer> hm = new HashMap<>();
		TreeMap<Integer,ArrayList<Integer>> tm = new TreeMap<>(Collections.reverseOrder());
		
				
		for(int i = 0; i<size; i++){
			int k = sc.nextInt();
			al.add(k);
		}
		Collections.sort(al);
//		System.out.println(al);
		int lastValue = (Integer)al.get(size-1);
//		System.out.println(lastValue);
		
		for(int i=1; i<=lastValue; i++){
			int count =0;
			 for(int j=0; j<size; j++){
				 if((Integer)al.get(j) == i){
					 count++;
				 }
			 }
			 hm.put(i, count);		
		}
		for(Entry<Integer,Integer> entry : hm.entrySet()){
//			System.out.println("entry : " + entry);
			if(tm.containsKey(entry.getValue())){
				ArrayList<Integer> tValue = tm.get(entry.getValue());
			}
			else{
				ArrayList<Integer> tValue = new ArrayList<>();
				tValue.add(entry.getKey());
				tm.put(entry.getValue(), tValue);
			}
		}
		System.out.println(tm.firstEntry().getValue().get(0));
//		System.out.println(hm);
	}
}
