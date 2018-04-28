package mindBasic;

import java.util.HashMap;

public class OccurenceHandle {

	public static void main(String[] args) {
		String str = "1,BI 22.22,PFT 33.33,BI 44.44,PFT 55.55,BI 66.66";
		getOccuranceCalculation(str);
	}
	
	public static void getOccuranceCalculation(String occcuranceString){
		String subString = occcuranceString.substring(2);
		//System.out.println(subString);
		String arr_occcuranceString[] = subString.split(",");
		HashMap<String, String> hm = new HashMap<>();
		String string_Split[] = null;
		float old_value_BI = (float) 0.0, old_value_PFT = (float) 0.0, value_BI = (float) 0.0, value_PFT = (float) 0.0;
		int count_BI=0, count_PFT=0;
		for(int i=0; i<arr_occcuranceString.length; i++){
			string_Split = arr_occcuranceString[i].split(" ");
			
			String key = string_Split[0];
			float value = Float.parseFloat(string_Split[1]);
					
			if(key.contains("BI")){
				old_value_BI+=value;
				count_BI++;
			}
			else{
				old_value_PFT+=value;
				count_PFT++;
			}
			
			//System.out.println(old_value_BI + " " + count_BI + " " + old_value_PFT + " " + count_PFT);
			value_BI=old_value_BI/count_BI;
			value_PFT=old_value_PFT/count_PFT;
//			System.out.println();

		}
		System.out.println(value_BI);
		System.out.println(value_PFT);
	}
}
