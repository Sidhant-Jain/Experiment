package milindLearning.basic;


class A{
	void m1(){
		System.out.println("A-m1");
	}
}

class B extends A{
	void m1(){
		System.out.println("B-m1");
	}
	
	void m2(){
		System.out.println("B-m2");
	}
}

public class InheritanceChainingTesting {

	public static void main(String[] args) {
		A a1 = new A();
		a1.m1();
//		a1.m2();
		A a2 = new B();
		a2.m1();
//		a2.m2();
		B b1 = new B();
		b1.m1();
		b1.m2();
		B b2 = (B)new A();
		System.out.println("test");
		b2.m1(); //A-m1
		b2.m2(); //B-m2
	}

}
