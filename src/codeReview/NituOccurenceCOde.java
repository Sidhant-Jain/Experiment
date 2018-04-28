package codeReview;



import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class NituOccurenceCOde {

	public static void main(String[] args) {
		/*1,IBM 22.22,IPBL 33.33,IBM 44.44,IPBL 55.55,IBM 66.66
		  IBM 44.4400 3
		  IPBL 44.4400 2
		*/
		String str = "1,IBM 22.22,IPBL 33.33,IBM 44.44,IPBL 55.55,IBM 66.66";
		getOccurences(str);
	}

	private static void getOccurences(String str) {
		Map<String, Map<Float,Integer>> strMap = new HashMap<String, Map<Float,Integer>>();
		String strFinal = str.substring(str.indexOf(",")+1,str.length());
		System.out.println(strFinal);
		String[] strTokens = strFinal.split(",");
		for (int i = 0; i < strTokens.length; i++) {
			String[] stToken = strTokens[i].split(" ");
			String key = stToken[0];
			String value = stToken[1];
			Float tempValue;
			Integer counter = 1;
			if (strMap.containsKey(key)) {
				Map<Float,Integer> innerMap = new HashMap<Float, Integer>();
				String oldVal = strMap.get(key).entrySet().toString().substring(1, strMap.get(key).entrySet().toString().indexOf("="));
				tempValue = Float.parseFloat(oldVal) + Float.parseFloat(value);
				counter = Integer.parseInt(strMap.get(key).entrySet().toString().substring(strMap.get(key).entrySet().toString().indexOf("=")+1, strMap.get(key).entrySet().toString().length()-1));
				innerMap.put(tempValue, counter + 1);
				strMap.put(key,innerMap);
			} else {
				Map<Float,Integer> innerelseMap = new HashMap<Float, Integer>();
				tempValue = Float.parseFloat(value);   
				innerelseMap.put(tempValue, counter);
				strMap.put(key,innerelseMap);
			}
		}
		
		Iterator<Entry<String, Map<Float, Integer>>> entries = strMap.entrySet().iterator();
		while (entries.hasNext()) {
		    Entry<String, Map<Float, Integer>> entry = entries.next();
		    Float totalVal = Float.parseFloat((entry.getValue().toString().substring(1, entry.getValue().toString().indexOf("="))));
		    Integer totalOccurences = Integer.parseInt(entry.getValue().toString().substring(entry.getValue().toString().indexOf("=")+1, entry.getValue().toString().length()-1));
		    System.out.println(entry.getKey() + " " + String.format("%.04f",(totalVal/totalOccurences)) + " " + totalOccurences);
		}		
	}
}