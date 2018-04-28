package mindBasic;

public class SubtringNdTrimTest {
	public static void main(String[] args){
		String str1 = " hellofiends";
		String str2 = "hellofiends";
		String str3 = null;
		String str4 = "+hell  ofi +ends";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println();
		
		str1=str1.trim();
		if(str3 != null && str3.contains("+") || str3.contains(" ")){
			str3=str3.substring(1, str3.length());
		}
		if(str4.contains("+") && str4.contains(" ")){
			str4=str4.replaceAll("\\s", "");
			str4=str4.replaceAll("[+]", "");
			
		}
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
