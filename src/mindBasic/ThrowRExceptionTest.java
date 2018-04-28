package mindBasic;

public class ThrowRExceptionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = validate1(10);
		System.out.println(i);
	}
	
	 static int validate(int age){
	//try{
		if(age<18){
			//throw new ArithmeticException("not valid"); 
			System.out.println("throw ");
			
		throw new ArrayIndexOutOfBoundsException("not valid AI");
		
		
		// checked exception can not be resolved type. Its a compile time error
		//throw new IOException("not Valid IO");
		}
		else{
			return age;
			
		}
		
		
	//}
//	catch(Exception e){
//		System.out.println("catch");
//		return age;
//	}
		 
	}
	
	static int validate1(int age){
		//try{
			int a= validate(age);			
		//}
//		catch(ArrayIndexOutOfBoundsException e){
//			System.out.println("catch AI");
//		}
//		catch(ArithmeticException e){
//			System.out.println("catch AE");
//		}
//		catch(Exception e){
//			System.out.println("catch");
//		}
//		finally{
//			System.out.println("finally");
//		}
		return age;
	}

}
