package mindBasic;

public class PrivateConstructr {

	public static void main(String[] args) {
		int i = m1();
		System.out.println(i);
		}
	
	static int m1(){
		try{
			int a=10, b=0, c=0;
			int k[]= new int[5];
			k[4]=10/2;
			//c=a/b;
			System.out.println("try");
			try{
				//System.exit(10);
				c=a/b;
				System.out.println("2nd try");
			}
			catch(Exception e){
				System.out.println("catch 2nd");
			}
			finally{
				System.out.println("finally2nd");
			}
			return 10;
			
		}
		
		
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("catchAI");
		}
		catch(ArithmeticException e){
			System.out.println("catchAE");
			
			return 20;
		}
		
		
		finally{
			System.out.println("finally");
			return 30;
		}
	}

}

