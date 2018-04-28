package challanges;

/*1,IBM 22.22,IPBL 33.33,IBM 44.44,IPBL 55.55,IBM 66.66
  IBM 44.4400 3
  IPBL 44.4400 2
 */

import java.util.HashMap;
import java.util.ArrayList;

public class Wissen {

	HashMap<String, String> hmap= new HashMap<>();
	public static void main(String[] args) {
		String str = "1,IBM 22.22,IPBL 33.33,IBM 44.44,IPBL 55.55,IBM 66.66";
		HashMap<Double, String> hm = new HashMap<Double, String>();
		String strarr[] = str.split(",");
		System.out.println("star : " + strarr[0]);
		
		for(int i=1; i<strarr.length; i++){
			String tokens[] = strarr[i].split(" ");
			double key = Double.parseDouble(tokens[1]);
			String value = tokens[0];
			hm.put(key, value);
			
		}
		addCalculation(hm);
 	}
	
	public static void addCalculation(HashMap<Double, String> hm){
		System.out.println(hm);
		ArrayList<String> al = new ArrayList<>();
		double d = 11.11;
		for(int i=0; i<hm.size(); i++){
			d = d+11.11;
			String str = hm.get(d);
			if(!(al.contains(str))){
				al.add(str);
			}
		}
		for(int i=0; i<al.size(); i++){
			String compny=al.get(i);
			int count = 0;
			Double d1 =11.11,d2=00.00,avg=00.00;
			for(int j=0; j<hm.size(); j++){
				d1=d1+11.11;
				System.out.println(compny + d1);
				if(compny.equals(hm.get(d1))){
					count++;
					d2=d2+d1;
					System.out.println("d2 = " + d2);
				}
			}
			avg=d2/count;
			System.out.println(count + " " + compny + " " +avg);
		}
	}

}
