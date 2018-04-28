package mindBasic;

class A1{
	
	static void m2(){
		System.out.println("m2 test");
	}
	void m4(){
		System.out.println("m4 test");
	}
}

public class StaticMethodOverridingTest extends A1{

	public static void main(String[] args) {
		  A1 a = new StaticMethodOverridingTest();
		  A1 a1 = new A1();
		  StaticMethodOverridingTest stmt = new StaticMethodOverridingTest();
		//  StaticMethodOverridingTest stmt1 = new (StaticMethodOverridingTest)A1();
		  stmt.m3();
		  stmt.m4();
		  stmt.m2();
		  a.m4();
		  a.m2();
		  a1.m2();
		  
	}

	static void m1(){
		System.out.println("test");
	}
	
	static void m2(){
		System.out.println("main test2");
	}
	
	void m3(){
		System.out.println("main m3");
	}
	
	void m4(){
		System.out.println("main m4");
	}
	
}


