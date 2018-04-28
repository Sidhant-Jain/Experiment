package milindLearning.basic;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B1 b = (B1)new A1();
		b.f1();
	}

}

class A1{
	public void f1()
	{
		System.out.println("A f1");
	}
}

class B1 extends A1{
	public void f1()
	{
		super.f1();
		System.out.println("B f1");
	}
}
