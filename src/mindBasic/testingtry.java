package mindBasic;

public class testingtry {
	public static void main(String[] args) {
		int a = someFun();
		System.out.println("Result " + a);
	}
	
	static int someFun() {
		int a=0;
		try {
			a=10/0;
			
			
//			return a;
		} 
		catch(Exception e) {
			a=20;
			return a;
		} 
		finally {
			//a=30;
			System.out.println("abc");
//			return a;
		}
//		System.out.println("a" + a);
		return a;
	}
}

