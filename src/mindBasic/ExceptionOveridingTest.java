package mindBasic;

import java.io.IOException;

class A{
	void msg() {
		System.out.println("A");
		
	}
	
}

public class ExceptionOveridingTest extends A {

	public static void main(String[] args) {
		A a1 = new ExceptionOveridingTest();
				
		try{
			a1.msg();
			
		}
		catch(Exception e){
			System.out.println("catch");
		}
	}
	
	void msg() throws ArithmeticException{
		System.out.println("EOt");
		throw new ArithmeticException("ex");
	}
}