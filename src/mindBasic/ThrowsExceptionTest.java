package mindBasic;

import java.io.IOException;


public class ThrowsExceptionTest {

	public static void main(String[] args) {
		ThrowsExceptionTest tet = new ThrowsExceptionTest();
		tet.validate(10);
		System.out.println("main");
	}
	
	void validate(int age) {
		 try{
		 
			 System.out.println("vali");
				validate1(age);
			 System.out.println("validte");
			 
		 }
		 catch(Exception e){
			 System.out.println("catch");
		 }
//		 finally{
//			 System.out.println("finally");
//		 }

	}
	
	 void validate1(int age) throws IOException{
		 System.out.println("validate1");
		 //try{
		 
			 validate2(age);
			 //throw new IOException("IO");
		 //}
		 //catch(Exception e){
		//	 System.out.println();
	//	 }

//		 throw new IOException("IO");
	 }
	 
	 void validate2(int age) throws ArithmeticException{
		 System.out.println("validate2");
		// throw new ArithmeticException("IO");
	 }

}
