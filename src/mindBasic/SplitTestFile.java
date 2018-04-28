package mindBasic;

import java.util.StringTokenizer;

public class SplitTestFile {

	public static void main(String[] args) {
		String str = "";
		String str1 = " ";
		String str2 = "";
		int length =0;
		str=str.trim();
		StringTokenizer st = new StringTokenizer(str,"[|]");
		
		length = st.countTokens();
		
		
//		length = str.split("[|]").length;
//		System.out.println(length);
//		if(length<=1){
//			length = 0;
//		}
		System.out.println(length);
//		length = str1.split("|").length;
//		length = str2.split("|").length;
		
				
	}

}
