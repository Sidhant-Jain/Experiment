package mindBasic;

import java.util.HashMap;

public class EqualIgnoreCaseNdContains {

	public static void main(String[] args) {
		HashMap<String,String> hm= new HashMap<>();
		String str = "sidhant jain";
		if(str.contains("sidhant")){
			System.out.println("contains true");
		}
		if(str.equalsIgnoreCase("SIDHANT")){
			System.out.println("true");
		}
		if(str.contains("SIDHANT")){
			System.out.println("upper_case_contains");
		}
		

	}

}
