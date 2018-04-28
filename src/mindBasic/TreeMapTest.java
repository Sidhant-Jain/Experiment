package mindBasic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMapTest {

	public static void main(String[] args) {
		HashMap<Integer, Integer> hMap = new HashMap<>();
		hMap.put(1, 4);
		hMap.put(3, 5);
		hMap.put(4, 1);
		hMap.put(6, 10);
		hMap.put(7, 2);
		TreeMap<Integer, ArrayList<Integer>> tMap = new TreeMap<>(Collections.reverseOrder());
		
		for (Entry<Integer, Integer> entry : hMap.entrySet()) {
			if(tMap.containsKey(entry.getValue())){
				ArrayList<Integer> tValues =  tMap.get(entry.getValue());
				tValues.add(entry.getKey());
			}else{
				ArrayList<Integer> tValues = new ArrayList<>();
				tValues.add(entry.getKey());
				tMap.put(entry.getValue(), tValues);
			}
		}
		
		System.out.println(tMap.firstEntry().getValue().get(0));
	}

}
