package mindBasic;

public class ConditionCheck {
	public static void main(String[] args){
//		Integer i = new Integer(0);
//		Integer j = new Integer(1);
		int i=5;
		int j=6;
		
		if(i<=j){
			System.out.println("print i : " + i);
		}
		if(j<=i){
			System.out.println("print j: "+ j);
		}
		if(i!=j){
			System.out.println("print");
		}
		
		String s1 = "sidhant";
		String s2 ="sidhant";
		String s3 = new String("sidhant");
		
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3);
		System.out.println(s1);
		System.out.println(s1.equals(s3));
//		System.out.println(s1==s2);
		
		
		
	}
}
