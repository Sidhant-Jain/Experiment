package mindBasic;



public class IfCaseTest {
	public static void main(String [] args){
		boolean b1= false;
		if(b1){
			System.out.println("false");
		}else{
			System.out.println("true");
		}
		
//		m1();
	}
	
	public static void m1(){
		try{
			int c = 10/0;
		}

		catch(ArithmeticException e){
			System.out.println("hjh");
		}
		catch(Exception e){
			System.out.println("ex");
		}
	}
}
